package com.xworkz.rules.boot;

import com.xworkz.rules.Television;

import com.xworkz.rules.TelevisionRule;

public class TelevisionRuleRunner {

	public static void main(String[] args) {

		TelevisionRule televisionRule =new Television();
			
		Television television=new Television();
		
			Object obj=new Object();
			
			
			System.out.println(television.display());
			System.out.println(television.monocrome());
			System.out.println(television.speakers());
			System.out.println(television.wires());
			System.out.println(television.motherBoard());
	}

}
