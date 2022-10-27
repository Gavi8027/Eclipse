package com.xworkz.constants.things;



import com.xworkz.constants.Types;

public class Fuel {
	
	public boolean special;
	public Types types=Types.PETROL;
	public int price;
	public int quantity;
	public Brand brand;
	
	
	public Fuel(boolean special, int price, int quantity) {
		super();

		this.special = special;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void showOff() {
		System.out.println(this.brand);
		System.out.println(this.special);
		System.out.println(this.types);
		System.out.println(this.price);
		System.out.println(this.quantity);
		Brand brand=new Brand("HP",19373,4.0);
		brand.showOff();
	}

}
