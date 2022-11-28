package com.xworkz.constant.equals.boot;

import com.xworkz.constant.equals.Institution;
public class InstitutionRunner {

	public static void main(String[] args) {

	 Institution institution =new Institution();
		institution.setHR("Akshara");
		institution.setName("Xworkz");
		institution.setBatchName("M1");
		institution.setEmail("xworkz@gmail.com");
		institution.setLocation("Rajajinagara");
		institution.setNoOfStaff(10);
		institution.setNoOfstudents(100);
		institution.setTakenPermissionFromGovt(true);
		institution.setTrinerName("omkar");
		institution.setTriners(true);
		
		Institution institution1=new Institution("Akshara","Xworkz","Rajajinagara",100,"M1,",true,"xworkz@gmailcom",10,"omkar",true);
		
		
		boolean same=institution.equals(institution1);
		System.out.println(same);
		
		
	}
	

}
