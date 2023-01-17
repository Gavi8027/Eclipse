package com.xworkz.spring.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	@Autowired
	public Capacity capacity;
	
	public Battery() {
		System.out.println("Creating Battary with no arg constractor...");
	}
	
	public void checkPropertyRef() {
		System.out.println(this.capacity.hashCode()+"-------hash Code Of Reffference------");
	}
	
	

}
