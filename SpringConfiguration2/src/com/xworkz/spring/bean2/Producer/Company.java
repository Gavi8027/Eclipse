package com.xworkz.spring.bean2.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Autowired
	private Location location;

	public Company() {
		System.out.println("Creating Company with no arg constractor");
	}

}
