package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanyNamesRunner {

	public static void main(String[] args) {

		String company1 = "IBM";
		String company2 = "Infosys";
		String company3 = "TCS";
		String company4 = "Wipro";
		String company5 = "NTT DATA";
		String company6 = "Infotec";
		String company7 = "Amazon";
		String company8 = "Microsoft";
		String company9 = "Tata elxsi";
		String company10 = "Google";
		String company11 = "Cisco";
		String company12 = "SAP";
		String company13 = "DELL";
		String company14 = "ACCENTURE";
		String company15 = "CANON";
		String company16 = "YAHOO";
		String company17 = "HTC";
		String company18 = "BenQ";
		String company19 = "Apple";
		String company20 = "KOdak";

		Collection<String> software = new ArrayList<String>();
		software.add(company1);
		software.add(company2);
		software.add(company3);
		software.add(company4);
		software.add(company5);
		software.add(company6);
		software.add(company7);
		software.add(company8);
		software.add(company9);
		software.add(company10);
		software.add(company11);
		software.add(company12);
		software.add(company13);
		software.add(company14);
		software.add(company15);
		software.add(company16);
		software.add(company17);
		software.add(company18);
		software.add(company19);
		software.add(company20);

		System.out.println("software company names array list");

		System.out.println(software);

		System.out.println(software.size());

		for (String sft : software) {
			System.out.println(sft);
		}

		System.out.println("======Iterator========");

		Iterator<String> ref = software.iterator();
		while (ref.hasNext()) {
			String element = ref.next();
			System.out.println(element);
		}

	}

}
