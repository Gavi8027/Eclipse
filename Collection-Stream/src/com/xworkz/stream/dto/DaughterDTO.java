package com.xworkz.stream.dto;

import java.io.Serializable;

public class DaughterDTO implements Serializable {

	private String name;
	private long mobile;
	private int age;
	private boolean cimmitted;
	private boolean alive;

	public DaughterDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 80;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof DaughterDTO) {
				DaughterDTO dto = (DaughterDTO) obj;
				if (dto.name.equals(this.name) && dto.age == this.age) {
					return true;
				}
			}
		}
		return false;

	}

	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", mobile=" + mobile + ", age=" + age + ", cimmitted=" + cimmitted
				+ ", alive=" + alive + "]";
	}

	public DaughterDTO(String name, long mobile, int age, boolean cimmitted, boolean alive) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.cimmitted = cimmitted;
		this.alive = alive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCimmitted() {
		return cimmitted;
	}

	public void setCimmitted(boolean cimmitted) {
		this.cimmitted = cimmitted;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
