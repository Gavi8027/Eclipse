package com.xworkz.rules.boot;

import com.xworkz.rules.Wife;
import com.xworkz.rules.WifeRules;

public class WifeRulesRunner {

	public static void main(String[] args) {

       WifeRules wifeRules =new Wife();
		
		Wife wife=new Wife();
		
		Object obj=new Object();
		
		System.out.println(wife.avoidArguments());
		System.out.println(wife.budgetWiselyTogether());
		System.out.println(wife.dontNag());
		System.out.println(wife.dontSmoke());
		System.out.println(wife.inTimeToHome());
	}

}
