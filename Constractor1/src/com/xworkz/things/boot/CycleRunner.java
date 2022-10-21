package com.xworkz.things.boot;

import com.xworkz.things.Cycle;


public class CycleRunner {

	
	public static void main(String[] args) {
		
		
		
		String[] color={"white","red","blue","black","grey","silver"};
		int[] price= {3000,3255,3356,3677,5671,67820,7830};
		String[] types= {"charg","race","normal","gear"};
		String[] usagePersons={"gents","ladies","auntys","uncles","childerns","grandpa"};
		String[] parts= {"bell","seat","wheel","pedal","chain"};
		
		
		Cycle cycle=new Cycle("atlas",color,price,true,types,usagePersons,parts);
		cycle.display();

}
}