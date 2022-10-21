package com.xworkz.things.boot;

import com.xworkz.things.Watch;

public class WatchRunner {

	public static void main(String[] args) {
		
		
		String[] color={"white","red","blue","black","grey","silver"};
		int[] price= {1100,1200,1300,1400,1500,1600};
		String[] types= {"band","analog","digital","waterproof","bluetooth"};
		String[] shapes={"round","squre","rectangle","qube"};
		int[] number= {1,2,3,4,5,6,7};
		
		
		Watch watch=new Watch("MI",color,price,true,types,shapes,number);
		watch.display();

	}

}
