package com.xworkz.constant.Relation;

public class BJP extends  PoliticalParty {
	
	public String headQuareters;

	public BJP(String leaderName, String president,String headQuareters) {
		super(leaderName, president);
		this.headQuareters=headQuareters;
	}
	
	public void display() {
		System.out.println("printing bjp details");
		super.display();
		System.out.println("printing bjp details");
		System.out.println(this.headQuareters);
	}
}	
	


