package com.xworkz.constants.things.man;

public class Email {
	
	public int id;
	public int password;
	public long mobileNo;
	public Company company;
	public Email(int id, int password, long mobileNo) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
		
		
	}	
	public void setCompany(Company company) {
		this.company=company;
	}
		public void showOff() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobileNo);
		
		
		this.company.display();
		}
	
	
	}
