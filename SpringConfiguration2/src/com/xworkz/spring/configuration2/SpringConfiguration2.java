package com.xworkz.spring.configuration2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringConfiguration2 {

	public SpringConfiguration2() {
		System.out.println(" Creating SpringConfiguration2 with no arg constractor..");

	}

}
