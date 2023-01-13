package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {

	@Autowired
	@Qualifier("ghostName")
	private String name;
	@Autowired
	@Qualifier("ghostAge")
	private int age;
	@Autowired
	@Qualifier("ghostGender")
	private String gender;
	@Autowired
	@Qualifier("ghostCast")
	private String cast;
	@Autowired
	@Qualifier("ghostMoNo")
	private double mobNo;
	@Autowired
	@Qualifier("ghostSurName")
	private String surName;
	@Autowired
	@Qualifier("ghostHeight")
	private int height;
	@Autowired
	@Qualifier("ghostWeight")
	private double weight;
	@Autowired
	@Qualifier("ghostColorr")
	private String color;
	@Autowired
	@Qualifier("ghostJob")
	private String job;
	private String location;
	private int nailLength;
	private String fatherName;
	private String motherName;
	private String wifeName;
	private String daughterName;
	private String emai;
	private double aadharNo;
	private String education;
	private boolean indian;

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", age=" + age + ", gender=" + gender + ", cast=" + cast + ", mobNo=" + mobNo
				+ ", surName=" + surName + ", height=" + height + ", weight=" + weight + ", color=" + color + ", job="
				+ job + ", location=" + location + ", nailLength=" + nailLength + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", wifeName=" + wifeName + ", daughterName=" + daughterName + ", emai="
				+ emai + ", aadharNo=" + aadharNo + ", education=" + education + ", indian=" + indian + "]";
	}

	public Ghost(@Qualifier("ghostJob") String job, @Qualifier("ghostLocation") String location,
			@Qualifier("ghostNailLength") int nailLength, @Qualifier("ghostFatherName") String fatherName,
			@Qualifier("ghostMotherName") String motherName, @Qualifier("ghostWifeName") String wifeName,
			@Qualifier("ghostDaughterName") String daughterName, @Qualifier("ghostEmail") String emai,
			@Qualifier("ghostAadharaNo") double aadharNo, @Qualifier("ghostEducation") String education,
			@Qualifier("ghostIndian") boolean indian) {
		super();
		this.job = job;
		this.location = location;
		this.nailLength = nailLength;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.wifeName = wifeName;
		this.daughterName = daughterName;
		this.emai = emai;
		this.aadharNo = aadharNo;
		this.education = education;
		this.indian = indian;
	}

}
