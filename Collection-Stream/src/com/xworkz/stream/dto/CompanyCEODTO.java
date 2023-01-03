package com.xworkz.stream.dto;

import java.io.Serializable;

public class CompanyCEODTO implements Serializable {

	private String name;
	private String company;
	private int age;
	private String country;
	private String qualification;
	private boolean marriade;

	public CompanyCEODTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof CompanyCEODTO) {
				CompanyCEODTO dto = (CompanyCEODTO) obj;
				if (dto.name.equals(this.name) && dto.country.equals(this.country)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "CompanyCEODTO [name=" + name + ", company=" + company + ", age=" + age + ", country=" + country
				+ ", qualification=" + qualification + ", marriade=" + marriade + "]";
	}

	public CompanyCEODTO(String name, String company, int age, String country, String qualification, boolean marriade) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.qualification = qualification;
		this.marriade = marriade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public boolean isMarriade() {
		return marriade;
	}

	public void setMarriade(boolean marriade) {
		this.marriade = marriade;
	}

}
