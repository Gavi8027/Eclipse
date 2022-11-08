package com.xworkz.constant.inheritance.constant.boot;


import com.xworkz.constant.inheritance.constant.Doctor;
import com.xworkz.constant.inheritance.constant.Dentist;
import com.xworkz.constant.inheritance.constant.Cardiology;
public class DoctorRunner {

	
	public static void main (String [] args) {
		
		
		Doctor doctor=new Doctor();
		System.out.println(doctor.name);
		System.out.println(doctor.specialists);
		
		
		Dentist doctor1=new Dentist();
		
		Dentist dentist= (Dentist) doctor1;
		
		System.out.println(dentist.noOfStaff);
		System.out.println(dentist.fees);
		 
		ENT ent=new ENT();
		System.out.println(ent.name);
		System.out.println(ent.location);
		
		Cardiology doctor3= new Cardiology();
		
		Cardiology cardiology = (Cardiology) doctor3;
		System.out.println(cardiology.hospitalName);
		System.out.println(cardiology.heartSpeciliest);
		
		
	}
}
