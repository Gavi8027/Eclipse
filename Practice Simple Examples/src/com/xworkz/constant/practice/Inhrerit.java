package com.xworkz.constant.practice;

public class Inhrerit {
	
	public static void main(String [] args) {
	
	  Inhrerit(double d){
		this(10);
		System.out.println("double arg constractor" );
	}
	   Inhrerit(int i){
	   this();
	   System.out.println("int arg constractor");
    }
	   Inhrerit(){
		   
		   System.out.println("no arg constractor");
	   }
	}   
}
