package com.xworkz.firstTime.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {

	@Autowired
	@Qualifier("rubberName")
	private String name;
	@Autowired
	@Qualifier("rubberPrice")
	private double price;
	@Autowired
	@Qualifier("rubberColor")
	private String color;
	@Autowired
	@Qualifier("rubberShape")
	private String shape;
	@Autowired
	@Qualifier("rubberStolen")
	private boolean stolen;
	@Autowired
	@Qualifier("rubberSize")
	private int size;

	public Rubber() {
		System.out.println("====================Creating Rubber no arg constractor=============");
	}

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", price=" + price + ", color=" + color + ", shape=" + shape + ", stolen="
				+ stolen + ", size=" + size + "]";
	}

}
