package com.xworkz.food.componenet;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping()
public class Item {
	
	public Item() {
		System.out.println("crating" + this.getClass().getSimpleName());
	}

	@GetMapping("/taste")
	public String taste() {
		System.out.println("Running tastey");
		return "Food.jsp";
	}
}
