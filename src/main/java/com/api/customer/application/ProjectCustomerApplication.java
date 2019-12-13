package com.api.customer.application;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author dipsm
 *
 */

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "com.api.customer.application.*")

public class ProjectCustomerApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ProjectCustomerApplication.class, args);
	}

}
