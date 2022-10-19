package com.xworkz.things.boot;

import com.xworkz.things.Wine;

public class WineRunner {

	public static void main(String[] args) {
		
		
		String[] brandNames= {"blossom hill","lindemans","jacobs creek","sutter home","beringer","hardys"};
	    String[] color= {"red","white","black","blue","brown","purple"};
	    int[] price= {450,500,600,700,850,900,950,};
	    String[] founderNames= {"diageo","treasury","pernod richard","trinchero","treasury","accolade"};
	    int[] ml= {30,40,50,60,90,35};
	    
	    Wine wine=new Wine(brandNames,color,price,founderNames,true,"vyaakk",true,ml);
	    wine.display();

	}

}
