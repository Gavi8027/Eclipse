package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.springConfiguration;
import com.xworkz.spring.thing.Application;
import com.xworkz.spring.thing.Area;
import com.xworkz.spring.thing.Bus;
import com.xworkz.spring.thing.Cholocate;
import com.xworkz.spring.thing.City;
import com.xworkz.spring.thing.Cycle;
import com.xworkz.spring.thing.Fish;
import com.xworkz.spring.thing.Girl;
import com.xworkz.spring.thing.God;
import com.xworkz.spring.thing.Mall;
import com.xworkz.spring.thing.Mask;
import com.xworkz.spring.thing.Milk;
import com.xworkz.spring.thing.Park;
import com.xworkz.spring.thing.Patient;
import com.xworkz.spring.thing.Road;
import com.xworkz.spring.thing.Temple;

public class SpringRunner {

	public static void main(String[] args) {

		ApplicationContext spring =new AnnotationConfigApplicationContext(springConfiguration.class);
		Road ref=spring.getBean(Road.class);
		System.out.println(ref);
		
		System.out.println("==============");
		
		Bus ref1=spring.getBean(Bus.class);
		System.out.println(ref1);
		
		System.out.println("===============");
		
		Cycle ref2=spring.getBean(Cycle.class);
		System.out.println(ref2);
		
		System.out.println("================");
		Girl ref3=spring.getBean(Girl.class);
		System.out.println(ref3);
		
		System.out.println("=================");
		Milk ref4=spring.getBean(Milk.class);
		System.out.println(ref4);
		
		System.out.println("=====================");
		Mask ref5=spring.getBean(Mask.class);
		System.out.println(ref5);
		
		System.out.println("===================");
		Patient ref6=spring.getBean(Patient.class);
		System.out.println(ref6);
		
		System.out.println("================");
		Cholocate ref7=spring.getBean(Cholocate.class);
		System.out.println(ref7);
		
		System.out.println("=================");
		Area ref8=spring.getBean(Area.class);
		System.out.println(ref8);
		System.out.println("===================");
		City ref9=spring.getBean(City.class);
		System.out.println(ref9);
		
		
		System.out.println("===================");
		Fish ref10=spring.getBean(Fish.class);
		System.out.println(ref10);
		
		System.out.println("================");
		Temple ref11=spring.getBean(Temple.class);
		System.out.println(ref11);
		
		System.out.println("==================");
		God ref12=spring.getBean(God.class);
		System.out.println(ref12);
		
		System.out.println("====================");
		Park ref13=spring.getBean(Park.class);
		System.out.println(ref13);
		
		System.out.println("====================");
		Mall ref14=spring.getBean(Mall.class);
		System.out.println(ref14);
		
		System.out.println("===================");
		Application ref15=spring.getBean(Application.class);
		System.out.println(ref15);
	}
	
	     

}
