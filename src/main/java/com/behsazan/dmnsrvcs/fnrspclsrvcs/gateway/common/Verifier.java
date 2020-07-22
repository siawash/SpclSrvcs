package com.behsazan.dmnsrvcs.fnrspclsrvcs.gateway.common;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.security.Key;
import io.jsonwebtoken.Jwts;
import java.security.cert.CertificateFactory;
import java.io.FileInputStream;
import io.jsonwebtoken.JwtParser;
import java.security.PublicKey;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.common.AppLogger;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(ignoreResourceNotFound = true, encoding = "UTF-8", value = { "classpath:verification.properties" })
@Lazy
public class Verifier
{
    @Autowired
    private AppLogger logger;
    @Value("${keystore.file.path}")
    private String keyStoreFilePath;
    private PublicKey publicKey;
    private JwtParser parser;
    
    @PostConstruct
    public void intiPublicKey() throws Exception {
        try {
            final FileInputStream in = new FileInputStream(this.keyStoreFilePath);
            final CertificateFactory cf = CertificateFactory.getInstance("X.509");
            final PublicKey pk = cf.generateCertificate(in).getPublicKey();
            in.close();
            this.publicKey = pk;
            this.parser = Jwts.parser().setSigningKey((Key)this.publicKey);
            this.logger.log("verifier.intiPublicKey : pkey alg is " + this.publicKey.getAlgorithm());
            this.logger.log("verifier.intiPublicKey : pkey encoded bytes is " + Arrays.toString(pk.getEncoded()));
        }
        catch (Exception e) {
            throw new Exception("public key file not found at " + this.keyStoreFilePath + " - exception : " + e.getMessage());
        }
    }
    
    public Jws<Claims> parse(final String jwt) throws Exception {
        try {
            this.logger.log("jwt is : " + jwt);
            return (Jws<Claims>)this.parser.parseClaimsJws(jwt);
        }
        catch (Exception e) {
            this.logger.log("exception in parse : " + e.getMessage());
            throw new Exception("verifier.parse exception : " + e.getMessage());
        }
    }
}
