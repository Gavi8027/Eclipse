package com.xworkz.abstraction;

public class Readers implements ReadersRule {

	@Override
	public boolean mentainSilence() {
		System.out.println("Running mentainSilence");
		return false;
	}

}
