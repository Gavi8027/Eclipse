package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {

		SanitizerDTO dto1 = new SanitizerDTO();
		dto1.setBrand("Savlon");
		dto1.setId(1);
		dto1.setPrice(3);
		dto1.setColor("Blue");

		SanitizerDTO dto2 = new SanitizerDTO();
		dto2.setBrand("Dettol");
		dto2.setId(2);
		dto2.setPrice(75);
		dto2.setColor("Green");

		SanitizerDTO dto3 = new SanitizerDTO();
		dto3.setBrand("Lifebuoy");
		dto3.setId(3);
		dto3.setPrice(90);
		dto3.setColor("Red");

		SanitizerDTO dto4 = new SanitizerDTO();
		dto4.setBrand("Dabur");
		dto4.setId(4);
		dto4.setPrice(210);
		dto4.setColor("Orange");

		SanitizerDTO dto5 = new SanitizerDTO();
		dto5.setBrand("Multani");
		dto5.setId(5);
		dto5.setPrice(159d);
		dto5.setColor("White");

		SanitizerDTO dto6 = new SanitizerDTO();
		dto6.setBrand("Sterillium");
		dto6.setId(6);
		dto6.setPrice(1d);
		dto6.setColor("Sky Blue");

		SanitizerDTO dto7 = new SanitizerDTO();
		dto7.setBrand("Multani");
		dto7.setId(7);
		dto7.setPrice(133d);
		dto7.setColor("Black");

		SanitizerDTO dto8 = new SanitizerDTO();
		dto8.setBrand("Corvil");
		dto8.setId(8);
		dto8.setPrice(110d);
		dto8.setColor("purple");

		SanitizerDTO dto9 = new SanitizerDTO();
		dto9.setBrand("Trust");
		dto9.setId(9);
		dto9.setPrice(170d);
		dto9.setColor("Pink");

		SanitizerDTO dto10 = new SanitizerDTO();
		dto10.setBrand("DCM Shriram");
		dto10.setId(10);
		dto10.setPrice(39d);
		dto10.setColor("Yellow");

		Collection<SanitizerDTO> collection = new ArrayList<SanitizerDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);

		Iterator<SanitizerDTO> ref = collection.iterator();
		while (ref.hasNext()) {
			SanitizerDTO element = ref.next();

			if (element.getPrice() > 5) {
				System.out.println("sanitizer price is more than 5rs " + element);

			}
		}

		System.out.println("======checking any property in sanitizer is null=======");

		Iterator<SanitizerDTO> ref1 = collection.iterator();
		while (ref1.hasNext()) {
			SanitizerDTO element1 = ref1.next();
			if (element1 != null) {
				System.out.println("Element2 not contain any null " + element1);
			}
		}

		System.out.println("=============removing some colors============");

		Iterator<SanitizerDTO> ref2 = collection.iterator();
		while (ref2.hasNext()) {
			SanitizerDTO element2 = ref2.next();
			if (element2.getColor().matches("Blue")) {
				((Iterator<SanitizerDTO>) ref2).remove();
				System.out.println("Element is removed " + element2);
			}

		}

		Iterator<SanitizerDTO> ref3 = collection.iterator();
		while (ref3.hasNext()) {
			SanitizerDTO element3 = ref3.next();
			if (element3.getColor().matches("Red")) {
				((Iterator<SanitizerDTO>) ref3).remove();
				System.out.println("Element is removed " + element3);
			}

		}

		System.out.println("===========lowest price==============");

		Iterator<SanitizerDTO> ref5 = collection.iterator();
		while (ref5.hasNext()) {
			SanitizerDTO element5 = ref5.next();
			if (element5.getPrice() < 10) {

				System.out.println("lowest price is" + element5);
			}

		}

		System.out.println("===========highest price==============");

		Iterator<SanitizerDTO> ref6 = collection.iterator();
		while (ref6.hasNext()) {
			SanitizerDTO element6 = ref6.next();
			if (element6.getPrice() > 200) {

				System.out.println("highest price is" + element6);
			}

		}

		System.out.println("===========2nd maximum price==============");

		Iterator<SanitizerDTO> ref4 = collection.iterator();
		while (ref4.hasNext()) {
			SanitizerDTO element4 = ref4.next();
			if (element4.getPrice() < 210) {

				System.out.println("2nd mamximum price " + element4);
			}

		}

	}

}
