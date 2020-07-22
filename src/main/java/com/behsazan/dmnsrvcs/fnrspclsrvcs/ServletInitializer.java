package com.behsazan.dmnsrvcs.fnrspclsrvcs;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import io.swagger.annotations.ApiOperation;

@SpringBootApplication
public class ServletInitializer extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(ServletInitializer.class, args);

		System.out.println("***********************************************************************************");
		System.out.println("***********************************************************************************");
		System.out.println("***********************************************************************************");
		System.out.println("*                                                                                 *");
		System.out.println("                   SpclSrvcs application ready to use");
		System.out.println("*                                                                                 *");
		System.out.println("***********************************************************************************");
		System.out.println("***********************************************************************************");
		System.out.println("***********************************************************************************");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServletInitializer.class);
	}

	public static void exitApplication(ApplicationContext context, int exitReason) {
		int exitCode = SpringApplication.exit(context, new ExitCodeGenerator() {
			
			@Override
			public int getExitCode() {
				return exitReason;
			}
		});
		
		System.out.println("application stopped with error code " + exitReason);
		System.exit(exitCode);
	}
}

@RestController
class RESTController {

//	@ApiOperation(value = "is SpclSrvcs up and running?", tags = "isup")
	@GetMapping("/isup")
	public String isUp() {
		return "SpclSrvcs is up and running";
	}
}

