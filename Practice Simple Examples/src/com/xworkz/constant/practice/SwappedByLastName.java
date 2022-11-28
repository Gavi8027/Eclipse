package com.xworkz.constant.practice;

public class SwappedByLastName {

	public static void main(String[] args) {
		
		String str1="john McClane", str2="MaClane john";
		System.out.println("String before swapping" +str1+" "+ str2);
		
		str1=str1+str2;
		
		str2=str1.substring(0,(str1.length())-str2.length());
		
		str1=str1.substring(str2.length());
		
		System.out.println("String after swapping " +str1+ " "+str2);

	}

}
