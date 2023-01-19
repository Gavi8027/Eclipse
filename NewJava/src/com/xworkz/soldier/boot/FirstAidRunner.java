package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.configuration.SpringConfiguration;
import com.xworkz.soldier.dto.FirstAidDTO;
import com.xworkz.soldier.dto.MissileDTO;
import com.xworkz.soldier.service.FirstAidService;
import com.xworkz.soldier.service.MissileService;

public class FirstAidRunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidService ref=container.getBean(FirstAidService.class);
		
		FirstAidDTO aidDTO = new FirstAidDTO();
		ref.validateAndSave(aidDTO);
		

		

	}

}
