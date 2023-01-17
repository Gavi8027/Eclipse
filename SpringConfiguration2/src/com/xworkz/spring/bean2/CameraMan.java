package com.xworkz.spring.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CameraMan {
	@Autowired
	private Camera camera;
	
	public CameraMan() {
		System.out.println("Creating CameraMan with no arg constractor...");
	}

}
