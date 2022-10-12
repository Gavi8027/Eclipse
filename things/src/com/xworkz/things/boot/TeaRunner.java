package com.xworkz.things.boot;

import com.xworkz.things.Tea;

public class TeaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tea Tea1=new Tea();
		System.out.println(Tea1.price);
		System.out.println(Tea1.brand);
		System.out.println(Tea1.flavour);
		System.out.println(Tea1.color);
		System.out.println(Tea1.taste);
		System.out.println(Tea1.tasteless);
		System.out.println(Tea1.cold);
		System.out.println(Tea1.Compnay);
		
		
		Tea1.chemical="caffeine";
		Tea1.combo="bun";
		Tea1.production="1.2Mn tonn";
		Tea1.packaging="tea bag";
		Tea1.highestTeaConsumptionCountry="iranians";
		Tea1.highestCultivatedCountry="china";
		Tea1.benifits="relief";
		Tea1.type="aromatic beverage";
		
		System.out.println(Tea1.chemical);
		System.out.println(Tea1.combo);
		System.out.println(Tea1.production);
		System.out.println(Tea1.packaging);
		System.out.println(Tea1.highestTeaConsumptionCountry);
		System.out.println(Tea1.benifits);
		System.out.println(Tea1.type);

	}

}
