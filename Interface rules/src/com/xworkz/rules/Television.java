package com.xworkz.rules;

public class Television implements TelevisionRule{

	@Override
	public boolean speakers() {
		return true;
	}

	@Override
	public boolean monocrome() {
		return true;
	}

	@Override
	public boolean motherBoard() {
		return true;
	}

	@Override
	public boolean wires() {
		return true;
	}

	@Override
	public boolean display() {
		return true;
	}

	
}
