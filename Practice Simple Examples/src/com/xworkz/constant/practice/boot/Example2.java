package com.xworkz.constant.practice.boot;

import java.util.ArrayList;

import java.util.List;

public class Example2 {

	public static void main(String[] args) {

		List list=new ArrayList();
		
		list.add('A');
		list.add('b');
		list.add('c');
		
	
		for (Object object : list) {
			System.out.println(object);
			
		}
		System.out.println("====================");
		
		list.add(1, 'd');
		for (Object object : list) {
			System.out.println(object);
			
		}
		System.out.println("=============");
		
		list.remove(2);
		for (Object object : list) {
			System.out.println(object);
			
		}
		System.out.println("=============================");

		list.get(1);
		for (Object object : list) {
			System.out.println(object);
			
		}

           
		
	}

}
