package com.xworkz.rules.boot;

import com.xworkz.rules.CompanyRule;
import com.xworkz.rules.CompanyRules;

public class CompanyRulesRunner {

	public static void main(String[] args) {

      CompanyRules companyRules =new CompanyRule();
		
		CompanyRule companyRule=new CompanyRule();
		
		Object obj=new Object();
		
		System.out.println(companyRules.dontMisuse());
		System.out.println(companyRules.dressCode());
		System.out.println(companyRules.punctuality());
		System.out.println(companyRules.agreement());
		System.out.println(companyRules.shoes());
	}

}
