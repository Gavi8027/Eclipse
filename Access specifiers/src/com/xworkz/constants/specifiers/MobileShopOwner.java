package com.xworkz.constants.specifiers;

public class MobileShopOwner {
	
	public String name="Pavan";
	public Mobile mobile;
	
	public void useMobile(Mobile mobile) {
		
		
		System.out.println(mobile.getBrand());
		System.out.println(mobile.getColor());
		System.out.println(mobile.getPrice());
		System.out.println(mobile.getAmbasassador());
		System.out.println(mobile.getDualSim());
		System.out.println(mobile.getQuantity());
		System.out.println(mobile.getWeight());
		System.out.println(mobile.getEasyToCarry());
		System.out.println(mobile.getSize());
		System.out.println(mobile.getRam());
		System.out.println(mobile.getCategory());
		System.out.println(mobile.getBattry());
		
		mobile.setBrand("oneplus","charcoal ink",24999,"shahid",true,3,5,true,13,8,"SmartPhone","lithium ion");
		
	}
}
