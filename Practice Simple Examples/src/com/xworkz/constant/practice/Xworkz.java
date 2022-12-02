package com.xworkz.constant.practice;

public class Xworkz implements Testing {

	@Override
	public boolean presentation() {
		System.out.println("Running presentation");
		return true;
	}

	@Override
	public boolean interview() {
		System.out.println("Running interview");
		return true;
	}

	@Override
	public boolean projects() {
		System.out.println("Running projects");
		return false;
	}

	@Override
	public boolean mockInterviews() {
		System.out.println("Running mockInterviews");
		return false;
	}

}
