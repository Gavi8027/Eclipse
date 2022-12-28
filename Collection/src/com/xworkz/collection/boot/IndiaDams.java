package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IndiaDams {

	public static void main(String[] args) {

		Collection<String> karnataka = new ArrayList<String>();
		karnataka.add("Tunga Bhadra");
		karnataka.add("Kodasalli");
		karnataka.add("NarayanaPura");
		karnataka.add("Harangi Dam");
		karnataka.add("Krishna Raja Sagara");
		karnataka.add("Supa");
		karnataka.add("Alamatti");
		karnataka.add("Kadra Dam");
		karnataka.add("Linganamakki");

		Collection<String> kerala = new ArrayList<String>();

		kerala.add("Neyyar");
		kerala.add("Mullaperiyar");
		kerala.add("Walayar");
		kerala.add("Parambikulam");
		kerala.add("Kundala");
		kerala.add("idukki ");
		kerala.add("Peechi ");
		kerala.add("Malampuzha ");

		Collection<String> up = new ArrayList<String>();
		up.add("Rajghat ");
		up.add("Rihand ");

		Collection<String> mp = new ArrayList<String>();
		mp.add("Barna ");
		mp.add("Bargi ");
		mp.add("Banasagar ");
		mp.add("Gandhi sagara ");

		Collection<String> mh = new ArrayList<String>();
		mh.add("Yeldari ");
		mh.add("Pawna ");
		mh.add("Ujani ");
		mh.add("Mulshi ");
		mh.add("Koyna ");
		mh.add("Jayakawadi ");
		mh.add("Bhatsa ");
		mh.add("Wilson ");
		mh.add("Tansa ");
		mh.add("Panshet ");
		mh.add("Mula ");
		mh.add("Kolkewadi ");
		mh.add("Girna ");
		mh.add("Vaitarna ");

		Collection<String> telangana = new ArrayList<String>();
		telangana.add("Radhanagari ");
		telangana.add("Lower Manair ");
		telangana.add("Mid Manair ");
		telangana.add("Upper Manair ");
		telangana.add("Nijam Sagar ");
		telangana.add("Singur ");

		Collection<String> Od = new ArrayList<String>();
		Od.add("Indravati ");
		Od.add("Hirakud ");

		Collection<String> jharkhand = new ArrayList<String>();

		jharkhand.add("Panchet ");
		jharkhand.add("Chandil ");
		jharkhand.add("Maithon ");

		Collection<String> Ap = new ArrayList<String>();
		Ap.add("Somasila ");
		Ap.add("Srisailam ");

		Collection<String> gujarat = new ArrayList<String>();
		gujarat.add("Ukai ");
		gujarat.add("Dharoi ");
		gujarat.add("Kadana ");
		gujarat.add("Dantiwada ");

		Collection<String> Hp = new ArrayList<String>();
		Hp.add("Pandoh ");
		Hp.add("BhakraNangal ");
		Hp.add("Nathap Jhakri ");
		Hp.add("Chamera ");

		Collection<String> jammu = new ArrayList<String>();
		jammu.add("Baglihar ");
		jammu.add("Dumkhar Hydroelectric ");
		jammu.add("Uri Hydroelectric ");

		Collection<String> uttarakanda = new ArrayList<String>();
		uttarakanda.add("Tehri ");
		uttarakanda.add("Dhauli Ganga ");

		Collection<String> tamilnadu = new ArrayList<String>();
		tamilnadu.add("Vaigai ");
		tamilnadu.add("Perunchani ");
		tamilnadu.add("Mettur ");

		Collection<String> rajastana = new ArrayList<String>();
		rajastana.add("Bisalpur ");

		Collection<String> Dam = new ArrayList<String>();
		Dam.addAll(karnataka);
		Dam.addAll(kerala);
		Dam.addAll(up);
		Dam.addAll(mp);
		Dam.addAll(mh);
		Dam.addAll(telangana);
		Dam.addAll(Od);
		Dam.addAll(jharkhand);
		Dam.addAll(Ap);
		Dam.addAll(gujarat);
		Dam.addAll(Hp);
		Dam.addAll(jammu);
		Dam.addAll(uttarakanda);
		Dam.addAll(tamilnadu);
		Dam.addAll(rajastana);

		System.out.println(Dam.size());

		Iterator<String> ref = Dam.iterator();
		while (ref.hasNext()) {
			String element = ref.next();
			System.out.println(element);
		}

		System.out.println("==============startswith T===============");

		for (String ref1 : Dam) {
			if (ref1.startsWith("T")) {
				System.out.println("Element starts with T : " + ref1);
			}

		}
		System.out.println("=========elements starts with ar==============");
		for (String ref2 : Dam) {
			if (ref2.endsWith("ar")) {
				System.out.println("Elements ends with ar :" + ref2);
			}
		}
		System.out.println("======charlength============");
		for (String ref3 : Dam) {
			char[] ch = ref3.toCharArray();
			if (ch.length >= 15) {
				continue;
			}
			System.out.println(ref3);
		}
		System.out.println("=========Uppercase============");
		for (String ref4 : Dam) {
			System.out.println(ref4.toUpperCase());
		}

		System.out.println("=======lower=========");
		for (String ref5 : Dam) {
			System.out.println(ref5.toLowerCase());
		}

		System.out.println("=========Removing elemet==========");

	}

}
