package com.xworkz.constant.equals.boot;

import com.xworkz.constant.equals.God;

public class GodRunner {

	public static void main(String[] args) {

		
		God god=new God();
		god.setName("Shiva");
		god.setGender("Male");
		god.setWeight(50);
		god.setHeight(6);
		god.setDivinPower(true);
		god.setVehicle("Nandi");
		god.setWifeName("Parvati");
		god.setSonName("Ganesh");
		god.setPlace("Kailasa");
		god.setNoOfChildern(2);
		
		God god1=new God("Vishnu","Male",60,7,true,"Garuda","Lakshmi","Bramha","Vaikunta",1);
		
		boolean same=god.equals(god1);
		System.out.println(same);
		
	}

}
