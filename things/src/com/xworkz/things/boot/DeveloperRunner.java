package com.xworkz.things.boot;

import com.xworkz.things.*;

public class DeveloperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Developer Developer1=new Developer();
		System.out.println(Developer1.name);
		System.out.println(Developer1.education);
		System.out.println(Developer1.experience);
		System.out.println(Developer1.salary);
		System.out.println(Developer1.company);
		
		
		Developer1.name="arun";
		Developer1.education="MCA";
		Developer1.experience=1;	
		Developer1.salary=35000D;
		Developer1.company="wipro";
		
		System.out.println(Developer1.name);
		System.out.println(Developer1.education);
		System.out.println(Developer1.experience);
		System.out.println(Developer1.salary);
		System.out.println(Developer1.company);
		
		
	}

}
