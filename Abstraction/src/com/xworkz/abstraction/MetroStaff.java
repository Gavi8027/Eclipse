package com.xworkz.abstraction;

public class MetroStaff implements MetroRules{

	@Override
	public boolean inTime() {
		System.out.println("running intime");
		return false;
	}

}
