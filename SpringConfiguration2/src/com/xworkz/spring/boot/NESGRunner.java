package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.bean.Engine;
import com.xworkz.spring.bean.Ghost;
import com.xworkz.spring.bean.NewsPaper;
import com.xworkz.spring.bean.Snake;
import com.xworkz.spring.configuration.NESGConfiguration;

public class NESGRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(NESGConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		System.out.println(container.getBeanDefinitionCount());

		NewsPaper newsPapaer = container.getBean(NewsPaper.class);
		System.out.println(newsPapaer);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Engine engine = container.getBean(Engine.class);
		System.out.println(engine);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		Snake snake = container.getBean(Snake.class);
		System.out.println(snake);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		Ghost ghost = container.getBean(Ghost.class);
		System.out.println(ghost);
	}

}
