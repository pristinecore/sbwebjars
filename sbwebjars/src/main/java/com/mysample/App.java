package com.mysample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Spring Boot servlet initializer - Start point
 * 
 * @author Brient Oh
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App.class);
	}
	
    public static void main(String[] args) {
    	SpringApplication.run(App.class, args);
    }
}
