package com.xworkz.constant.practice;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fathers age");
		int a=sc.nextInt();
		System.out.println("Enter the sons age");
		int b=sc.nextInt();
		if(a==(2*b))
		{
			System.out.println("fathers age is double of that sons");
		}
			else {
				System.out.println("fathers age is not double of that son");
			}
		}

	}


