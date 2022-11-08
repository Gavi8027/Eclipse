package com.xworkz.constant.inheritance.constant.boot;
import com.xworkz.constant.inheritance.constant.Jail;
import com.xworkz.constant.inheritance.constant.SubJail;
import com.xworkz.constant.inheritance.constant.DistrictJail;
import com.xworkz.constant.inheritance.constant.CentralJail;
public class JailRunner {
	
	public static void main(String [] args) {
		
		
		Jail jail=new Jail();
		System.out.println(jail.name);
		System.out.println(jail.noOfCells);
		
		CentralJail jail1=new CentralJail();
		CentralJail centralJail=(CentralJail)jail1; 
		System.out.println(centralJail.name);
		System.out.println(centralJail.noOfThiefs);
		
		
		DistrictJail jail2=new DistrictJail();
		DistrictJail districtJail=(DistrictJail) jail2;
		
		System.out.println(districtJail.location);
		System.out.println(districtJail.name);
		
		SubJail jail3=new SubJail();
		SubJail subJail=(SubJail)jail3;
		System.out.println(subJail.location);
		System.out.println(subJail.noOfGuards);
		
	}
	
	

}
