package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;



@SpringBootApplication
public class RestaurantProjectApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RestaurantProjectApplication.class, args);
	}
	
	[5:12 PM] Vaddadi Pranathi
    


	@Override

 
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

 
	return application.sources(RestaurantProjectApplication.class);

 
	}






}
