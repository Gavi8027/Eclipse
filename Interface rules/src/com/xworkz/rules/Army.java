package com.xworkz.rules;

public class Army implements ArmyRules{

	@Override
	public boolean indianCitizen() {
		return true;
	}

	@Override
	public boolean height() {
		return true;
	}

	@Override
	public boolean uniform() {
		return true;
	}

	@Override
	public boolean nonCriminalCases() {
		return true;
	}

	@Override
	public boolean obeyingOrders() {
		return true;
	}

}
