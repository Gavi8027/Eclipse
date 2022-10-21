package com.xworkz.things.boot;

import com.xworkz.things.Pen;

public class PenRunner {

	public static void main(String[] args) {
	

		String[] color={"white","red","blue","black","grey","silver"};
		int[] price= {3,5,6,7,10,20,30};
		String[] types= {"writometer","santoor","mueow","magic",};
		String[] usages={"school","college","office","home","company"};
		int[] number= {1,2,3,4,5,6,7};
		
		
		Pen pen=new Pen("brite",color,price,true,types,usages,number);
		pen.display();

	}

}

	


