package com.xworkz.constants.things.boot;

import com.xworkz.constants.things.man.Person;
import com.xworkz.constants.things.man.Job;
import com.xworkz.constants.things.man.Country;
import com.xworkz.constants.things.man.Location;
import com.xworkz.constants.things.man.Company;
import com.xworkz.constants.things.man.Adress;
import com.xworkz.constants.things.man.City;
import com.xworkz.constants.things.man.Email;
import com.xworkz.constants.things.man.State;


public class PersonRunner {

	public static void main(String[] args) {
		
		
		Person person=new Person("gavi");
		
		Job job=new Job(30000,"developer",2);
		
		Company company=new Company("wipro","Azim Premji");
		
		Adress adress=new Adress();
		
		Country country=new Country("india","delhi",true,"droupadi murmu");
		
		State state=new State("karnataka","bengalore","basavaraj bommai",true);
		
		
		Location location=new Location(1,"malleshwaram", null, state, country);
		
		City city=new City("koppal",583231,"gangavati",4);
		
		person.setJob(job);
		
		job.setCompany(company);
		company.setAddress(adress);
		adress.setAdress(location);
		location.setLocation(state,country,city);
		Email emai=new Email("gavi@gmail.com","gavi1@123",1234,9916763682L);
		email.setCompany(company);
		person.displa();
		
	}

}
