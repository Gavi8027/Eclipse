package com.xworkz.constant.practice.boot;

import com.xworkz.constant.SubClass1;
import com.xworkz.constant.SubClass2;
import com.xworkz.constant.SubClass3;

public class MainCalss {

	public static void main(String[] args) {

		
		SubClass1 s=new SubClass1();
		s.hai();
		System.out.println(s.a);
		SubClass2 s1=new SubClass2();
		s1.slow();
		System.out.println(s1.b);
		SubClass3 s3=new SubClass3();
		s3.bye();
		System.out.println(s3.c);
		
		
	}

}
