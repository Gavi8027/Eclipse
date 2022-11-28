package com.xworkz.constant.equals;

public class Currency {
	
	int value;
	String width;
	String Height;
	int yearOfPrinting;
	String design;
	int designDate;
	String designer;
	String type;
	boolean indianCurency;
	String inDoller;
	
	
	
	
	public Currency(int value, String width, String height, int yearOfPrinting, String design, int designDate,
			String designer, String type, boolean indianCurency, String inDoller) {
		super();
		this.value = value;
		this.width = width;
		Height = height;
		this.yearOfPrinting = yearOfPrinting;
		this.design = design;
		this.designDate = designDate;
		this.designer = designer;
		this.type = type;
		this.indianCurency = indianCurency;
		this.inDoller = inDoller;
	}
	
	
	public int getValue() {
		return value;
	}
	public String getWidth() {
		return width;
	}
	public String getHeight() {
		return Height;
	}
	public int getYearOfPrinting() {
		return yearOfPrinting;
	}
	public String getDesign() {
		return design;
	}
	public int getDesignDate() {
		return designDate;
	}
	public String getDesigner() {
		return designer;
	}
	public String getType() {
		return type;
	}
	public boolean isIndianCurency() {
		return indianCurency;
	}
	public String getInDoller() {
		return inDoller;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public void setHeight(String height) {
		Height = height;
	}
	public void setYearOfPrinting(int yearOfPrinting) {
		this.yearOfPrinting = yearOfPrinting;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public void setDesignDate(int designDate) {
		this.designDate = designDate;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setIndianCurency(boolean indianCurency) {
		this.indianCurency = indianCurency;
	}
	public void setInDoller(String inDoller) {
		this.inDoller = inDoller;
	}
	
	
	

}
