package com.xworkz.constant.practice.boot;

public class Reverse {

	public static void main(String[] args) {

		String s = "ravi";

		String res = " ";

		for (int i = s.length() - 1; i >= 0; i--) {

			res = res + s.charAt(i);

		}

		System.out.println(res);

	}

}
