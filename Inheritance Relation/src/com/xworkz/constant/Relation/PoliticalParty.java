package com.xworkz.constant.Relation;

public class PoliticalParty {
	
	public String leaderName;
	public String president;
	public PoliticalParty(String leaderName, String president) {
		super();
		this.leaderName = leaderName;
		this.president = president;
	}
	
	public void display() {
		System.out.println(this.leaderName);
		System.out.println(this.president);
	}

}
