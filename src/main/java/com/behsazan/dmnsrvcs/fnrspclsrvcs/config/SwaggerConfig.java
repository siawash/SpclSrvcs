package com.behsazan.dmnsrvcs.fnrspclsrvcs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.spi.DocumentationType;
import org.springframework.context.annotation.Profile;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@Profile({"dev", "dev-jwt"})
@Profile({"dev"})
public class SwaggerConfig extends WebMvcConfigurerAdapter  {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().build();
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
	}
}

