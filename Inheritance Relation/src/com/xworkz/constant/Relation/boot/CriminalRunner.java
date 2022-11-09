package com.xworkz.constant.Relation.boot;

import com.xworkz.constant.Relation.Ravi;
import com.xworkz.constant.Relation.Criminal;
public class CriminalRunner {
	
	public static void main(String[] args) {
		Criminal criminal=new Criminal("Raju","kidnap");
		criminal.display();
		System.out.println("=======================");
		
		
		Ravi ravi=new Ravi("ravi","Murder","male");
		ravi.display();
	}

}