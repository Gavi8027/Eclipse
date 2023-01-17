package com.xworkz.spring.boot2;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.bean2.Movie;
import com.xworkz.spring.bean2.Producer.Producer;
import com.xworkz.spring.configuration2.SpringConfiguration2;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration2.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Producer producer = container.getBean(Producer.class);
		System.out.println(producer);

		System.out.println("==================================");

		Movie movie = container.getBean(Movie.class);
		System.out.println(Movie.class);

	}

}
