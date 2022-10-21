package com.xworkz.things;

public class Shoes {
	
	public String[] brandNames;
	public String[] color;
	public int[] price;
	public String[] founderNames;
	public boolean waterProf;
	public String type;
	public boolean perfectSize;
	public int[] size;
	
	public Shoes(String[] brandNames,String[] color,int[] price,String[] founderNames,boolean waterProf,String type,boolean perfectSize,int[] size){
		this.brandNames=brandNames;
		this.color=color;
		this.price=price;
		this.founderNames=founderNames;
		this.waterProf=waterProf;
		this.type=type;
		this.perfectSize=perfectSize;
		this.size=size;
	}
	public void display() {
		System.out.println(this.waterProf);
		System.out.println(this.type);
		
		for (int i = 0; i < brandNames.length; i++) {
			String string = brandNames[i];
			System.out.println(string);
		}
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
		}
		for (int i = 0; i < price.length; i++) {
			long string = price[i];
			System.out.println(string);
		}
		for (int i = 0; i < founderNames.length; i++) {
			String string = founderNames[i];
			System.out.println(string);
		}
		for (int i = 0; i < size.length; i++) {
			int string = size[i];
			System.out.println(string);
		}
		

}
}