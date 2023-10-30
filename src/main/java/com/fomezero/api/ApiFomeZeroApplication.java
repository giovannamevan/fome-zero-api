package com.fomezero.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.fomezero.api")
public class ApiFomeZeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFomeZeroApplication.class, args);
	}

}
