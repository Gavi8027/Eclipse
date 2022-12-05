package com.xworkz.abstraction;

public class AxisBank implements BankRule{

	@Override
	public double minBalance() {
		System.out.println("Running mimBalance");
		return 0;
	}

}
