package com.xworkz.constant.practice;

public class Enquiry {
	private static Enquiry enquiry1;              //wrongggg
	private static Enquiry enquiry2;
	private static Enquiry enquiry;

	Enquiry(String name,long number,String email,String adress) {
		
		
	}
	
	Enquiry(String name,String email,String adress) {
		
	}
	
	Enquiry(String name) {
		
	}
	
	
	
	public static void main(String[] args) {
		
		setEnquiry(new Enquiry("gavi",8297292,"hfik@738","koppal"));
		
		setEnquiry1(new Enquiry("ravi","hfihdks@8","gadag"));
		
		setEnquiry2(new Enquiry("raghu"));
		
		
	}

	public static Enquiry getEnquiry1() {
		return enquiry1;
	}

	public static void setEnquiry1(Enquiry enquiry1) {
		Enquiry.enquiry1 = enquiry1;
	}

	public static Enquiry getEnquiry2() {
		return enquiry2;
	}

	public static void setEnquiry2(Enquiry enquiry2) {
		Enquiry.enquiry2 = enquiry2;
	}

	public static Enquiry getEnquiry() {
		return enquiry;
	}

	public static void setEnquiry(Enquiry enquiry) {
		Enquiry.enquiry = enquiry;
	}

}
