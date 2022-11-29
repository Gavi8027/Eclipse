package com.xworkz.rules;

import com.xworkz.rules.boot.CollegeRules;

public class College implements CollegeRules{

	@Override
	public boolean assignment() {
		return true;
	}

	@Override
	public boolean idCard() {
		return true;
	}

	@Override
	public boolean uniform() {
		return true;
	}

	@Override
	public boolean attendence() {
		return true;
	}

	@Override
	public boolean mobileProhibited() {
		return true;
	}

}
