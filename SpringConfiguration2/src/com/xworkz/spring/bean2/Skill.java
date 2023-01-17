package com.xworkz.spring.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Skill {
	@Autowired
	private CameraMan cameraMan;
	
	public Skill() {
		System.out.println("Creating skill with no arg constractor...");
	}
	
	

}
