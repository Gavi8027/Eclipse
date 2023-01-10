package com.xworkz.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.bean.Rocket;

@Configuration
@ComponentScan("com.xworkz.spring")
public class ThingsConfiguration {
	
	public ThingsConfiguration() {
		System.out.println("Creating ThingsConfiguration by springd");
	}
	
	public Rocket jetRocket() {
		System.out.println("registering rocket with spring");
		Rocket rock=new Rocket();
		return rock;
		
	}

}
