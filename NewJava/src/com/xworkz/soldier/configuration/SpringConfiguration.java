package com.xworkz.soldier.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.soldier")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Creating SpringConfiguration..");
	}
    @Bean
	public Validator vali() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator valid = factory.getValidator();
		return valid;

	}

}
