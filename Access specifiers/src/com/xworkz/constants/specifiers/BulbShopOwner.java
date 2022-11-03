package com.xworkz.constants.specifiers;

public class BulbShopOwner {
	
	public String name="vishwa";
	public Bulb bulb;
	
	public void useBulb(Bulb bulb) {
		
		System.out.println(bulb.getName());
		System.out.println(bulb.getColor());
		System.out.println(bulb.getPrice());
		System.out.println(bulb.getShape());
		System.out.println(bulb.getWeight());
		System.out.println(bulb.getCompany());
		System.out.println(bulb.getIllumination());
		System.out.println(bulb.getMadeByGlass());
		System.out.println(bulb.getHavingTungsten());
		System.out.println(bulb.getHavingThread());
		System.out.println(bulb.getambassador());
		
		bulb.setBrand("LED","White",60,"Round",1,"EveryDay",true,true,true,true,"puneet");
	}

}
