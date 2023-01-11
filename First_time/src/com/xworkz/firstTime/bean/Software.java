package com.xworkz.firstTime.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("softwareName")
	private String name;
	@Autowired
	@Qualifier("softwareVersion")
	private double version;
	@Autowired
	@Qualifier("softwareDeveloper")
	private boolean developer;
	@Autowired
	@Qualifier("softwareDate")
	private int date;
	@Autowired
	@Qualifier("softwareFree")
	private boolean free;

	public Software() {
		System.out.println("=========================Creating software no arg constractor===================");
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}

}
