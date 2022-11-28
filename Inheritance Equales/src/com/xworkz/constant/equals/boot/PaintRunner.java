package com.xworkz.constant.equals.boot;

import com.xworkz.constant.equals.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		
		Paint paint=new Paint("Asian", "White",356,"sffhgg", true,"Mumbai", "Amit", "3053croes",1800209567,"Publicly listed company");
	

		
		Paint paint1=new Paint("Asian","White",585, "Lewis berger",true,"Kolkata","Bola","8826 crore",180032627,"customer");
		
		boolean same=paint.equals(paint1);
		System.out.println(same);
		
		
		
		

	}

}
