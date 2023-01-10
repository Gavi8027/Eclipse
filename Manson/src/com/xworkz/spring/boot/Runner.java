package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.bean.Actor;
import com.xworkz.spring.bean.Rocket;
import com.xworkz.spring.configuration.TConfiguration;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(TConfiguration.class);

		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));

		Rocket rocketref = spring.getBean("rocket", Rocket.class);
		System.out.println(rocketref);
		System.out.println(rocketref.getCountry());
		System.out.println(rocketref.getName());
		System.out.println(rocketref.getBudget());
		
		Rocket rocketref1 = spring.getBean("jetRocket", Rocket.class);
		System.out.println(rocketref1);
		rocketref1.setName("Scout");
		rocketref1.setCountry("USA");
		rocketref1.sevoidtBudget(748);
		System.out.println(rocketref1.getCountry());
		System.out.println(rocketref1.getName());
		System.out.println(rocketref1.getBudget());
		
		
		Rocket rocketref2 = spring.getBean("superRocket", Rocket.class);
		System.out.println(rocketref2);
		rocketref2.setName("Sputnik");
		rocketref2.setCountry("Russian");
		rocketref2.sevoidtBudget(748);
		System.out.println(rocketref2.getCountry());
		System.out.println(rocketref2.getName());
		System.out.println(rocketref2.getBudget());
		
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));

		
		Actor actor=spring.getBean("actor",Actor.class);
		System.out.println(actor);
		System.out.println(actor.getName());
		System.out.println(actor.getLanguage());
		System.out.println(actor.getAge());
		
		
		Actor actor1=spring.getBean("Puneet",Actor.class);
		System.out.println(actor1);
		System.out.println(actor1.getName());
		System.out.println(actor1.getLanguage());
		System.out.println(actor1.getAge());
		
		
		Actor actor2=spring.getBean("Hero",Actor.class);
		System.out.println(actor2);
		System.out.println(actor2.getName());
		System.out.println(actor2.getLanguage());
		System.out.println(actor2.getAge());

	}
	
	

}
