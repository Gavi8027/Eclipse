package com.xworkz.constant.practice;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=scanner.nextInt();
		int temp=0;
		
		for(int i=2; i<=no-1;i++) {
			if(no%i==0) {
				temp=temp+1;
				
			}
		}
			if(temp==0) {
				System.out.println("number is prime");
			}
				else {
					System.out.println("number is not prime");
				}
			}
		}
	


