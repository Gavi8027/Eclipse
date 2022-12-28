package com.xworkz.validation.dto;

import java.time.LocalDateTime;

import com.xworkz.validation.constant.Color;
import com.xworkz.validation.constant.Helmetype;

public class HelmetDTO extends AbstractAuditDTO {

	private String brand;// not null
	private Helmetype type;// not null
	private double price;
	private Color color;

	public HelmetDTO() {
		System.out.println();
	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}

	public HelmetDTO(String brand, Helmetype type, double price, Color color, String createdBy,
			LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Helmetype getType() {
		return type;
	}

	public void setType(Helmetype type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
