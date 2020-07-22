package com.behsazan.dmnsrvcs.fnrspclsrvcs.config;


import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import javax.sql.DataSource;

@Configuration
@PropertySource(ignoreResourceNotFound = true, encoding = "UTF-8", value = { "classpath:jdbc.properties", "classpath:sp.properties" })
public class Db2Config {
	@Autowired
	private Environment env;


	
// ******************************** DEV **********************************
	@Primary
	@Bean(name = "devDataSource")
	//@Profile({"dev", "dev-jwt"})
	@Profile({"dev"})
	public DataSource devDevDataSource() {
		try {
			BasicDataSource ds = new BasicDataSource();
			ds.setDriverClassName(env.getProperty("dev.driver"));
			ds.setUrl(env.getProperty("dev.url"));
			ds.setUsername(env.getProperty("dev.username"));
			
			ds.setPassword(env.getProperty("dev.password"));
		 return ds;
		} catch (Exception e) {
			 System.out.println("exception => " + e.getMessage());
			return null;
		}
	}
	

	@Bean(name = "devDatasource")
	@Profile("opr")
	public DataSource devOprDataSource() {
	JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
		return dataSourceLookup.getDataSource(env.getProperty("dev.jndi.name"));
	}

	@Scope("prototype")
	@Bean("devsjc")
	public SimpleJdbcCall devsjc(@Qualifier("devDataSource") DataSource devDataSource) {
		return new SimpleJdbcCall(devDataSource);
	}
	

}
