package com.xworkz.things.boot;

import com.xworkz.things.Shoes;

public class ShoesRunner {

	public static void main(String[] args) {
		
		String[] brandNames= {"bata","woodland","puma","nike","adidas","reebok"};
	    String[] color= {"red","white","black","blue","brown","purple"};
	    int[] price= {450,500,600,700,850,900,950,};
	    String[] founderNames= {"sandeep","apparel","rudolf","phil knight","adolf dassler","matthew"};
	    int[] size= {30,28,26,24,32,34};
	    
	    
	    Shoes shoes=new Shoes(brandNames,color,price,founderNames,true,"lether",true,size);
	    shoes.display();
	    		
	    
		

	}

}
