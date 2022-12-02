package com.xworkz.constant.practice.boot;

import com.xworkz.constant.practice.Development;
import com.xworkz.constant.practice.Institute;
import com.xworkz.constant.practice.Testing;
import com.xworkz.constant.practice.Xworkz;

public class XorkzRunner {
// multiple inheritance
	public static void main(String[] args) {

		
		Xworkz xworkz=new Xworkz();
		System.out.println(xworkz.interview());
		System.out.println(xworkz.mockInterviews());
		System.out.println(xworkz.presentation());
		System.out.println(xworkz.projects());
		xworkz.interview();
		
		
		Testing test=new Xworkz();
		System.out.println(test.interview());
		System.out.println(test.mockInterviews());
		System.out.println(test.presentation());
		System.out.println(test.projects());
		test.interview();
		
		
		Development devop=new Xworkz();
		System.out.println(devop.interview());
		System.out.println(devop.mockInterviews());
		System.out.println(devop.projects());
		devop.mockInterviews();
		
		
		Institute institute=new Xworkz();
		System.out.println(institute.interview());
		institute.interview();
		
		
	
	}

}
