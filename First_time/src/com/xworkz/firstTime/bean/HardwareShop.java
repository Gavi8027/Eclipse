package com.xworkz.firstTime.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
	@Qualifier("hardwareId")
	private int id;
	@Autowired
	@Qualifier("hardwareShopName")
	private String name;
	@Autowired
	@Qualifier("shopGstNo")
	private double gstNo;
	@Autowired
	@Qualifier("shopOwnerName")
	private String ownerName;
	@Autowired
	@Qualifier("shopLocation")
	private String adress;

	public HardwareShop() {
		System.out.println("==============Creating HardwareShop by default constractor=============");
	}

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", adress=" + adress + "]";
	}

}
