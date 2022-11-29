package com.xworkz.rules.boot;

import com.xworkz.rules.College;


public class CollegeRulesRunner {

	public static void main(String[] args) {

       CollegeRules collegeRules =new College();
		
		College college=new College();
		
		Object obj=new Object();
		
		System.out.println(college.assignment());
		System.out.println(college.attendence());
		System.out.println(college.idCard());
		System.out.println(college.uniform());
		System.out.println(college.mobileProhibited());
	}

}
