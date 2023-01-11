package com.xworkz.firstTime.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("softwareEngineerName")
	private String name;
	@Autowired
	@Qualifier("softwareEngineerSalary")
	private double salary;
	@Autowired
	@Qualifier("softwareEngineerCompanyName")
	private String companyName;
	@Autowired
	@Qualifier("softwareEngineerExperience")
	private int experience;

	public SoftwareEngineer() {
		System.out.println("===================Creating SoftwareEngineer no arg constractor===========");
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName
				+ ", experience=" + experience + "]";
	}

}
