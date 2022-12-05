package com.xworkz.abstraction;

public abstract class Person extends Object{
	
	private String name;
	private String adress;
	private long mobileNo;
	private String email;
	private String job;
	
	
	public String getName() {
		return name;
	}
	public String getAdress() {
		return adress;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public String getJob() {
		return job;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setMobileNo(long mobileNo){
		this.mobileNo = mobileNo;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	abstract String eat();
	abstract int sleep();

}
