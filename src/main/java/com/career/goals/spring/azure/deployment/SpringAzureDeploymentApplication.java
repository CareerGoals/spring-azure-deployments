package com.career.goals.spring.azure.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDeploymentApplication {
	
	@GetMapping("/getStatus")
	public String getMessage() {
		return "your application deployed at azure server successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDeploymentApplication.class, args);
	}

}
