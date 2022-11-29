package com.xworkz.rules;

public class PG implements PGRules{

	@Override
	public boolean inTime() {
		return true;
	}

	@Override
	public boolean mentainNeat() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean pgRent() {
		return true;
	}

	@Override
	public boolean switchOffSupply() {
		return true;
	}

	@Override
	public boolean saveWater() {
		return true;
	}

}
