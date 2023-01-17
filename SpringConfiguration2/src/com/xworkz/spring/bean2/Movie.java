package com.xworkz.spring.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Movie {
	@Autowired
	private Director director;
	
	public Movie() {
		System.out.println("Creating Movie with no arg constractor...");
	}

}
