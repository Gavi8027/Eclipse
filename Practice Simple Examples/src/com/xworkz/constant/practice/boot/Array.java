package com.xworkz.constant.practice.boot;

public class Array {

	public static void main(String[] args) {

		int[] s = { 1, 2, 3, 4, 5 };
		System.out.println(s[3]);
		//s[3] = 7;
		
		//for (int i = 0; i < s.length; i++) {
			//System.out.println(s[i]);
		//}
		//System.out.println(s[3]);
		//System.out.println(s[0]);
		
		System.out.println("===============================");

		String arr[] = { "ravi", "raju", "ramesh" };

		int length = arr.length;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("=================================");
		
		int[] arr1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		for (int i = 0; i < arr1.length; i++) {

			System.out.println(arr1[i]);

		}
		
		
		
	}

}
