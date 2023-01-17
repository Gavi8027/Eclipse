package com.xworkz.spring.bean2.Producer;

import org.springframework.stereotype.Component;

import com.xworkz.spring.bean2.Assistant;

@Component
public class Producer {

	private Assistant assistant;

	public Producer() {
		System.out.println("Creating producer with no arg constractor...");
	}

}
