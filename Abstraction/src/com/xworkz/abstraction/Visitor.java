package com.xworkz.abstraction;

public class Visitor implements VisitorRule{

	@Override
	public boolean noSmoking() {
		System.out.println("Running nosmoking");
		return false;
	}

}
