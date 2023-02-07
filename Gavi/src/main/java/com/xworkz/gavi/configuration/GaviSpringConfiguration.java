package com.xworkz.gavi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.gavi")
public class GaviSpringConfiguration {
	
	public GaviSpringConfiguration() {
		System.out.println("Creating :" + this.getClass().getSimpleName());
	}

}
