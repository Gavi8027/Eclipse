package com.xworkz.rules.boot;

import com.xworkz.rules.Mobile;

import com.xworkz.rules.MobileRules;

public class MobileRulesRunner {

	public static void main(String[] args) {

      MobileRules mobileRules =new Mobile();
		
		Mobile mobile=new Mobile();
	
		Object obj=new Object();
		
		
		System.out.println(mobile.network());
		System.out.println(mobile.operatingSystem());
		System.out.println(mobile.ram());
		System.out.println(mobile.recharge());
		System.out.println(mobile.sim());
		
	}

}
