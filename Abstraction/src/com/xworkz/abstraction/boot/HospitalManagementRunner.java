package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.HospitalManagement;
import com.xworkz.abstraction.Visitor;

public class HospitalManagementRunner {

	public static void main(String[] args) {

		
		Visitor visitor=new Visitor();
		 HospitalManagement  hospitalManagement=new  HospitalManagement(visitor);
		 hospitalManagement.checknoSmoking();
	}

}
