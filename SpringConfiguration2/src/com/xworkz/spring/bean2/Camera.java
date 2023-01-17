package com.xworkz.spring.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	private Battery battery;
	@Autowired
	private Lens lens;

	public Camera() {
		System.out.println("Creating Camera with no arg constractor...");
	}

}
