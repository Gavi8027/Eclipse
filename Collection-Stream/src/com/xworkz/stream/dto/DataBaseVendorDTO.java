package com.xworkz.stream.dto;

import java.io.Serializable;

public class DataBaseVendorDTO implements Serializable {

	private String name;
	private String developedBy;
	private int size;
	private double licenseCost;

	public DataBaseVendorDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 75;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof DataBaseVendorDTO) {
				DataBaseVendorDTO dto = (DataBaseVendorDTO) obj;
				if (dto.name.equals(this.name) && dto.developedBy.equals(this.developedBy)) {
					return true;
				}
			}
		}
		return false;
	}

	public DataBaseVendorDTO(String name, String developedBy, int size, double licenseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.size = size;
		this.licenseCost = licenseCost;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", size=" + size + ", licenseCost="
				+ licenseCost + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(double licenseCost) {
		this.licenseCost = licenseCost;
	}

}
