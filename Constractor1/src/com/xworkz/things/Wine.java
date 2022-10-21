package com.xworkz.things;

public class Wine {
	
	public String[] brandNames;
	public String[] color;
	public int[] price;
	public String[] founderNames;
	public boolean taste;
	public String type;
	public boolean unHealthy;
	public int[] ml;
	
	public Wine(String[] brandNames,String[] color,int[] price,String[] founderNames,boolean taste,String type,boolean unHealthy,int[] ml){
		this.brandNames=brandNames;
		this.color=color;
		this.price=price;
		this.founderNames=founderNames;
		this.taste=taste;
		this.type=type;
		this.unHealthy=unHealthy;
		this.ml=ml;

}
	
	public void display() {
		System.out.println(this.taste);
		System.out.println(this.type);
		System.out.println(this.unHealthy);
		
		for (int i = 0; i < brandNames.length; i++) {
			String string = brandNames[i];
			System.out.println(string);
		}
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
		}
		for (int i = 0; i < price.length; i++) {
			int string = price[i];
			System.out.println(string);
		}
		for (int i = 0; i < founderNames.length; i++) {
			String string = founderNames[i];
			System.out.println(string);
		}
		for (int i = 0; i < ml.length; i++) {
			int string = ml[i];
			System.out.println(string);
		}
		

}


}

