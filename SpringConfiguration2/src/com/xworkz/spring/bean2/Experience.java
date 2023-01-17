package com.xworkz.spring.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Experience {
	@Autowired
	private Skill skill;
	
	public Experience() {
		System.out.println("Creating Experience with no arg constractor....");
	}

}
