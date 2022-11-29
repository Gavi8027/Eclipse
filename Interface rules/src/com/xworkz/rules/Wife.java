package com.xworkz.rules;

public class Wife implements WifeRules {

	@Override
	public boolean avoidArguments() {
		return false;
	}

	@Override
	public boolean dontNag() {
		return false;
	}

	@Override
	public boolean budgetWiselyTogether() {
		return false;
	}

	@Override
	public boolean dontSmoke() {
		return true;
	}

	@Override
	public boolean inTimeToHome() {
		return false;
	}
	

}
