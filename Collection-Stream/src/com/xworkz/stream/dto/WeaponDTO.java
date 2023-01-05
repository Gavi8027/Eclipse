package com.xworkz.stream.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.stream.constant.WeaponType;

public class WeaponDTO implements Serializable {

	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private double price;
	private WeaponType type;

	public WeaponDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 39;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof WeaponDTO) {
				WeaponDTO dto = (WeaponDTO) obj;
				if (this.name.equalsIgnoreCase(this.name) && this.madeBy.equalsIgnoreCase(this.madeBy)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	public WeaponDTO(String name, String madeBy, LocalDate madeOn, double price, WeaponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public WeaponType getType() {
		return type;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

}
