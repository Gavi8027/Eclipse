package com.xworkz.spring.bean2.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {

	private Area area;

	@Autowired
	public Location() {
		System.out.println("Creating Location with no arg constractor...");
	}

}
