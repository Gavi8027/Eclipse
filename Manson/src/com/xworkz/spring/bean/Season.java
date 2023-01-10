package com.xworkz.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Season {
	private String name;
	private int duration;
	private String startingMonth;
	
	public Season() {
		System.out.println("Creating Season by spring");
	}

}
