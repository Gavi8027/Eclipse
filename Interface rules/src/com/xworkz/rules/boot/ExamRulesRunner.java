package com.xworkz.rules.boot;

import com.xworkz.rules.Exam;
import com.xworkz.rules.ExamRules;

public class ExamRulesRunner {

	public static void main(String[] args) {

		ExamRules examRules =new Exam();
		
		Exam exam=new Exam();
		
		Object obj=new Object();
		
		System.out.println(exam.hallTicketMandatory());
		System.out.println(exam.idCards());
		System.out.println(exam.mobilesArenotAllowed());
		System.out.println(exam.noChits());
		System.out.println(exam.ownCasli());
		
		
		
	}

}
