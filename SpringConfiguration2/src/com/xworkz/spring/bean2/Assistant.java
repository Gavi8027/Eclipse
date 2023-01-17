package com.xworkz.spring.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.bean2.Producer.Company;

@Component
public class Assistant {
	@Autowired
	private Company company;

	public Assistant() {
		System.out.println("Creating Assistance with no arg constractor..");
	}

}
