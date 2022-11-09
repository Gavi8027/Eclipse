package com.xworkz.constant.Relation.boot;

import com.xworkz.constant.Relation.ShoppingMall;
import com.xworkz.constant.Relation.Orion;
public class ShoppingMallRunner {
	
	public static void main(String [] args) {
		
		ShoppingMall shoppingMall=new ShoppingMall(1900,"Bengalore");
		shoppingMall.display();
		System.out.println("===============");
		
		Orion orion =new Orion(2000,"Yashvantapura",true);
		orion.display();
	}

}
