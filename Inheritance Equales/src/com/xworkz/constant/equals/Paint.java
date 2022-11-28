package com.xworkz.constant.equals;

public class Paint {
	
	String brand;
	String color;
    double price;
    String owenrName;
    boolean warranty;
    String headQuaters;
    String CEO;
    String income;
    long customerService;
    String typeOfBusiness;

    
    
	public Paint(String brand, String color, double price, String owenrName, boolean warranty, String headQuaters,
			String CEO, String income, long customerService, String typeOfBusiness) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.owenrName = owenrName;
		this.warranty = warranty;
		this.headQuaters = headQuaters;
		this.CEO = CEO;
		this.income = income;
		this.customerService = customerService;
		this.typeOfBusiness = typeOfBusiness;
	}
	
	
	@Override
	public boolean equals(Object others) {
		System.out.println("running equals method in paint");
		
		if(others instanceof Paint) {
			System.out.println("============");
			Paint paint=(Paint) others;
			
			if(this.brand.equals(paint.brand)
			&& this.color.equals(paint.color)){
					
			System.out.println("brand is same");
			return true;
			}
		}else 
		{
			System.err.println("=========");
		
		}
		return false;
	}
	
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOwenrName() {
		return owenrName;
	}
	public void setOwenrName(String owenrName) {
		this.owenrName = owenrName;
	}
	public boolean isWarranty() {
		return warranty;
	}
	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}
	public String getHeadQuaters() {
		return headQuaters;
	}
	public void setHeadQuaters(String headQuaters) {
		this.headQuaters = headQuaters;
	}
	public String getCEO() {
		return CEO;
	}
	public void setCEO(String CEO) {
		this.CEO = CEO;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public long getCustomerService() {
		return customerService;
	}
	public void setCustomerService(long customerService) {
		this.customerService = customerService;
	}
	public String getTypeOfBusiness() {
		return typeOfBusiness;
	}
	public void setTypeOfBusiness(String typeOfBusiness) {
		this.typeOfBusiness = typeOfBusiness;
	}
    
    
}	


