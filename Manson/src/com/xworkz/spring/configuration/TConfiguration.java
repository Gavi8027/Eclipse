package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.bean.Actor;
import com.xworkz.spring.bean.Rocket;

@Configuration
@ComponentScan("com.xworkz.spring")
public class TConfiguration {

	public TConfiguration() {
		System.out.println("Created TConfiguration by spring");
	}

	@Bean
	public Rocket jetRocket() {
		System.out.println("Creating jet rocket by bean");
		Rocket rock = new Rocket();
		return rock;
	}
	@Bean
	public Rocket superRocket() {
		System.out.println("Creating superRocket by bean");
		Rocket rock =new Rocket();
		return rock;
	}
    @Bean
	public Actor Puneet() {
		System.out.println("Creating puneet by bean");
		Actor act=new Actor("Shivanna","Kannada",60);
		return act;
		
		}
    @Bean
	public Actor Hero() {
		System.out.println("Creating Hero by bean");
		Actor act1=new Actor("Dashan","Kannada",44);
		return act1;
		
	}
}
