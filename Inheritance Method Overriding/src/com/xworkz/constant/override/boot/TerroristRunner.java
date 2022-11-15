package com.xworkz.constant.override.boot;


import com.xworkz.constant.override.Kasab;

public class TerroristRunner {

	public static void main(String[] args) {
		
		Kasab kasab =new Kasab();
		kasab.domasticTerrosim();
		System.out.println("==============");
		kasab.internationalTerrosim();

	}

}
