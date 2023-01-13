package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name;
	private String type;
	@Autowired
	@Qualifier("engineNumber")
	private double number;
	@Autowired
	@Qualifier("engineVersion")
	private double version;

	private String company;
	private int strokes;

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

	public Engine(@Qualifier("engineName") String name, @Qualifier("enigeType") String type,
			@Qualifier("engineCompany") String company, @Value("4") int strokes) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
		this.strokes = strokes;
	}

}
