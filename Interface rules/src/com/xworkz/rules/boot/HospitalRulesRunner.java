package com.xworkz.rules.boot;

import com.xworkz.rules.Hospital;
import com.xworkz.rules.HospitalRules;

public class HospitalRulesRunner {

	public static void main(String[] args) {

      HospitalRules hospitalRules =new Hospital();
		
		Hospital hospital=new Hospital();
		
		Object obj=new Object();
		
		System.out.println(hospital.AadharCard());
		System.out.println(hospital.Adress());
		System.out.println(hospital.MaksComplusary());
		System.out.println(hospital.Age());
		System.out.println(hospital.Name());
		
	}

}
