package com.xworkz.constant.Relation;

public class Prashant extends Director{
	
	public int age;  
	
	public Prashant(String type, int experience,int age) {
		super(type, experience);
	    this.age=age;
	}

       public void display() {
    	   super.display();
    	   System.out.println(this.age);
    	   
    	   
       }
	
}


