package com.xworkz.constants.things.man;

public class State {
	
	
	public String name;
	public String capital;
	public String chiefMinister;
	public boolean havingFlag;
	public State(String name, String capital, String chiefMinister, boolean havingFlag) {
		super();
		this.name = name;
		this.capital = capital;
		this.chiefMinister = chiefMinister;
		this.havingFlag = havingFlag;
	}
	
	public void display() {
    System.out.println(this.name);
    System.out.println(this.capital);
    System.out.println(this.chiefMinister);
    System.out.println(this.havingFlag);
    
    
	}
}
