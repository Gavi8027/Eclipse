package com.xworkz.firstTime.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {

	@Autowired
	@Qualifier("pencilName")
	private String name;
	@Autowired
	@Qualifier("pencilPrice")
	private int price;
	@Autowired
	@Qualifier("pencilcolor")
	private String color;
	@Autowired
	@Qualifier("pencilSharp")
	private boolean sharp;
	@Autowired
	@Qualifier("pencilStolen")
	private boolean stolen;

	public Pencil() {
		System.out.println("=============Creating pencil by no arg constractor======");
	}

	@Override
	public String toString() {
		return "Pencil [name=" + name + ",  price=" + price + ", color=" + color + ", sharp=" + sharp + ", stolen="
				+ stolen + "]";
	}

}
