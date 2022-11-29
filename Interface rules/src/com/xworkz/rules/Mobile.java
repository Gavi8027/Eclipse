package com.xworkz.rules;

public class Mobile implements MobileRules {

	@Override
	public boolean recharge() {
		return true;
	}

	@Override
	public boolean sim() {
		return true;
	}

	@Override
	public boolean network() {
		return true;
	}

	@Override
	public boolean operatingSystem() {
		return true;
	}

	@Override
	public boolean ram() {
		return true;
	}

}
