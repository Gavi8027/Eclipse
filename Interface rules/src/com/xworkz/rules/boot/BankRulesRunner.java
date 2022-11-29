package com.xworkz.rules.boot;

import com.xworkz.rules.BankRules;
import com.xworkz.rules.Bank;


public class BankRulesRunner {

	public static void main(String[] args) {

		
    BankRules bankRules =new Bank();
		
		Bank bank=new Bank();
		
		Object obj=new Object();
		
		System.out.println(bank.CandidatePresnt());
		System.out.println(bank.PassbookMandatory());
		System.out.println(bank.Photo());
		System.out.println(bank.CandidateSign());
	    System.out.println(bank.account());
	}

}
