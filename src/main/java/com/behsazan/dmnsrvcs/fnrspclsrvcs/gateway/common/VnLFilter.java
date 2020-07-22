package com.behsazan.dmnsrvcs.fnrspclsrvcs.gateway.common;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.ServletInitializer;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.common.AppLogger;

@Component
public class VnLFilter implements Filter {

//	@Autowired
//	private HttpSession httpSession;

	@Autowired
	private ApplicationContext context;

	@Autowired
	private AppLogger logger;

	@Value("${spring.profiles.active}")
	private String profile;

//	private boolean disableJwt;

//	public boolean noJwt(HttpServletRequest hsRequest) {
//		String path = hsRequest.getRequestURI().substring(hsRequest.getContextPath().length());
//		return (path.startsWith("/swagger-") || path.startsWith("/webjars") || path.startsWith("/v2/api-docs")
//				|| path.startsWith("/configuration") || path.equals("/isup"));
//	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {

		HttpServletRequest hsRequest = null;
		Claims claims = null;

		hsRequest = (HttpServletRequest) servletRequest;
		

//		if (!profile.equals("opr")) {
//			if (hsRequest.getRequestURI().substring(hsRequest.getContextPath().length()).equals("/swagger-ui.html")) {
//				httpSession.setAttribute("disableJwt", true);
//			}
//			try {
//				disableJwt = (boolean) httpSession.getAttribute("disableJwt");
//			} catch(Exception e) { }
//		}

//		if (profile.equals("opr") || (profile.equals("dev-jwt") && !noJwt(hsRequest))) {
//		if (profile.equals("opr") || (profile.equals("dev-jwt") && !disableJwt)) {
		if (profile.equals("opr") || (profile.equals("dev") && !hsRequest.getHeader("User-Agent").startsWith("Mozilla"))) {
			try {
				String jwt = hsRequest.getHeader("Authorization");
				Verifier verifier = context.getBean(Verifier.class);
				claims = verifier.parse(jwt).getBody();
				claims.put("contextPath", hsRequest.getContextPath());
				claims.put("servicePath", hsRequest.getRequestURI().substring(hsRequest.getContextPath().length()));
				servletRequest.setAttribute("jwt", claims);
				filterChain.doFilter(servletRequest, servletResponse);
			} catch (BeanCreationException e) {				
				logger.log(e.getMessage());
				((HttpServletResponse) servletResponse).sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, e.getMessage());
				if (profile.equals("opr"))
					ServletInitializer.exitApplication(context, -100);
			} catch (Exception e) {
				claims = Jwts.claims();
				claims.put("contextPath", hsRequest.getContextPath());
				claims.put("servicePath", hsRequest.getRequestURI().substring(hsRequest.getContextPath().length()));
				claims.put("exception", e.getMessage());
				logger.log(claims);
				((HttpServletResponse) servletResponse).sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, e.getMessage());
			}
		} else {
			claims = Jwts.claims();
			claims.put("contextPath", hsRequest.getContextPath());
			claims.put("servicePath", hsRequest.getRequestURI().substring(hsRequest.getContextPath().length()));
			servletRequest.setAttribute("jwt", claims);
			filterChain.doFilter(servletRequest, servletResponse);
		}
	}

	public void init(FilterConfig filterConfiguration) throws ServletException { }

	public void destroy() { }
}

