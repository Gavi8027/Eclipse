package com.xworkz.constant.inheritance.constant;

public class Bengalore extends SiliconCity{
	
	public void BLR() {
		
		System.out.println("creating creating");
		Bengalore bengalore=new Bengalore();
		bengalore.BLR();
		
	
		SiliconCity siliconCity=new SiliconCity();
		siliconCity.Silicon();
		
		
		MetroCity metroCity =new MetroCity();
		metroCity.Metro();
		
		City city=new City();
		city.Cities();
		
		Capital capital=new Capital();
		capital.Place();
		
		Place place=new Place();
		place.place();
		
		Object object =new Object();
		object.Obj();
	}

}
