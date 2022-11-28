package com.xworkz.constant.equals.boot;

import com.xworkz.constant.equals.Currency;

public class CurrencyRunner {

	public static void main(String[] args) {

		
		Currency currency=new Currency();
		currency.setValue(10);
		currency.setWidth("123mm");
		currency.setHeight("63mm");
		currency.setYearOfPrinting(2018);
		currency.setDesign("Mahatma Gandhi");
		currency.setDesignDate(2017);
		currency.setDesigner("RBI");
		currency.setType("Paper");
		currency.setIndianCurency(true);
		currency.setInDoller("$0.13");
		
		Currency currency1=new Currency(10,"123mm","63mm",2018,"Mahatma Gandhi",2017,"RBI","Paper",true,"$0.13");
		
		
		boolean same=currency.equals(currency1);
		System.out.println(same);
	}
}
		
				
				
