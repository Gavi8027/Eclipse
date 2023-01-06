package com.xworkz.collection.dto;

import java.io.Serializable;
import java.util.HashSet;

public class CakeDTO implements Serializable {

	private String name;
	private double price;
	private String color;
	private String shape;

	public CakeDTO() {

	}

	@Override
	public String toString() {
		return "CakeDTO [name=" + name + ", price=" + price + ", color=" + color + ", shape=" + shape + "]";
	}

	public CakeDTO(String name, double price, String color, String shape) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.shape = shape;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof CakeDTO) {
				CakeDTO dto = (CakeDTO) obj;
				if (dto.name.equals(this.name) && dto.price == this.price) {
					System.out.println("Cake is same" + this.name);
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

}
