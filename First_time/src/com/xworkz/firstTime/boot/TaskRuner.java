package com.xworkz.firstTime.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.firstTime.bean.Car;
import com.xworkz.firstTime.bean.HardwareShop;
import com.xworkz.firstTime.bean.Pencil;
import com.xworkz.firstTime.bean.Rubber;
import com.xworkz.firstTime.bean.Software;
import com.xworkz.firstTime.bean.SoftwareEngineer;
import com.xworkz.firstTime.configuration.TaskConfiguration;

public class TaskRuner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(TaskConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		HardwareShop hardwareShop = container.getBean(HardwareShop.class);
		System.out.println(hardwareShop);

		System.out.println("==========================================");

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		Pencil pencil = container.getBean(Pencil.class);
		System.out.println(pencil);

		System.out.println("================================================");

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		Rubber rubber = container.getBean(Rubber.class);
		System.out.println(rubber);

		System.out.println("==================================================");
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Software software = container.getBean(Software.class);
		System.out.println(software);

		System.out.println("================================================");
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		SoftwareEngineer softwareEngineer = container.getBean(SoftwareEngineer.class);
		System.out.println(softwareEngineer);

		System.out.println("================================================");
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Car car = container.getBean(Car.class);
		System.out.println(car);

	}

}
