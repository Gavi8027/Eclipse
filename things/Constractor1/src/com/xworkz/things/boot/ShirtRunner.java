package com.xworkz.things.boot;

import com.xworkz.things.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
	
		
		String[] brandNames= {"raymond","arrow","phillippe","LifeStyle","louis phillippe"};
	    String[] color= {"red","white","black","blue","brown","purple"};
	    int[] price= {450,500,600,700,850,900,950,};
	    String[] founderNames= {"sandeep","apparel","rudolf","phil knight","adolf dassler","matthew"};
	    int[] size= {30,28,26,24,32,34};
	    
	    
	    Shirt shirt=new Shirt(brandNames,color,price,founderNames,true,"lether",true,size);
	    shirt.display();
	    		

	}

}
