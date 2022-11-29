package com.xworkz.rules;

public class Court implements CourtRules{

	@Override
	public boolean evidence() {
		return true;
	}

	@Override
	public boolean indianCitizen() {
		return true;
	}

	@Override
	public boolean writtenDocuments() {
		return true;
	}

	@Override
	public boolean obeyingRules() {
		return true;
	}

	@Override
	public boolean displaneInCourt() {
		return true;
	}

}
