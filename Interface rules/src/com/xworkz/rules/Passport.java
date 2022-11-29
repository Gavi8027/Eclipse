package com.xworkz.rules;

public class Passport implements PassportRules{

	@Override
	public boolean indianCitizen() {
		return true;
	}

	@Override
	public boolean aadharCard() {
		return true;
	}

	@Override
	public boolean photo() {
		return true;
	}

	@Override
	public boolean nonCriminalCase() {
		return true;
	}

	@Override
	public boolean panCard() {
		return true;
	}

}
