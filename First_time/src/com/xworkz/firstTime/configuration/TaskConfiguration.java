package com.xworkz.firstTime.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.firstTime")
public class TaskConfiguration {
	@Bean
	public int hardwareId() {
		System.out.println("Registering hardwareId............");
		int ref = 24;
		return ref;
	}

	@Bean
	public String hardwareShopName() {
		System.out.println("Registering hardwareShopName.........");
		return "Ramesh";
	}

	@Bean
	public double shopGstNo() {
		System.out.println("Registering shopGstNo.............");
		return 124648;
	}

	@Bean
	public String shopOwnerName() {
		System.out.println("Registering shopOwnerName..........");
		return "Ranga";
	}

	@Bean
	public String shopLocation() {
		System.out.println("Registering shopLocation............");
		return "Bengalore";
	}

	@Bean
	public String pencilName() {
		System.out.println("Registering pencilName...........");
		return "Apsara";
	}

	@Bean
	public int pencilPrice() {
		System.out.println("Registering pencilPrice.............");
		return 12;
	}

	@Bean
	public String pencilcolor() {
		System.out.println("Registering pencilcolor.........");
		return "Black & Brown";
	}

	@Bean
	public boolean pencilSharp() {
		System.out.println("Registering pencilSharp.............");
		return true;
	}

	@Bean
	public boolean pencilStolen() {
		System.out.println("Registring pencilStolen..............");
		return true;
	}

	@Bean
	public String rubberName() {
		System.out.println("Registring rubberName...............");
		return "Nataraj";
	}

	@Bean
	public double rubberPrice() {
		System.out.println("Registering rubberPrice...............");
		return 15;
	}

	@Bean
	public String rubberColor() {
		System.out.println("Registering rubberColor...............");
		return "Brown";
	}

	@Bean
	public String rubberShape() {
		System.out.println(":Registering rubberSahpe................");
		return "Round";
	}

	@Bean
	public boolean rubberStolen() {
		System.out.println("Registering rubberStolen..............");
		return true;
	}

	@Bean
	public int rubberSize() {
		System.out.println("Registering rubberSize..............");
		return 4;
	}

	@Bean
	public String softwareName() {
		System.out.println("Registering softwareName.............");
		return "Datebase";
	}

	@Bean
	public double softwareVersion() {
		System.out.println("Registering softwareVersion.............");
		return 3.24;
	}

	@Bean
	public boolean softwareDeveloper() {
		System.out.println("Registering softwareDeveloper..........");
		return true;
	}

	@Bean
	public int softwareDate() {
		System.out.println("Registering softwareDate...................");
		return 14;
	}

	@Bean
	public boolean softwareFree() {
		System.out.println("Registering softwareFree...................");
		return true;
	}

	@Bean
	public String softwareEngineerName() {
		System.out.println("Registering softwareEngineerName..........");
		return "Gavi";
	}

	@Bean
	public double softwareEngineerSalary() {
		System.out.println("Registering softwareEngineerSalary.............");
		return 600000;
	}

	@Bean
	public String softwareEngineerCompanyName() {
		System.out.println("Registering softwareEngineerCompanyName.........");
		return "IBM";
	}

	@Bean
	public int softwareEngineerExperience() {
		System.out.println("Registering softwareEngineerExperience........");
		return 12;
	}

	@Bean
	public String carName() {
		System.out.println("Registering carName..............");
		return "Dzire";
	}

	@Bean
	public String carBrand() {
		System.out.println("Registering carBrand......");
		return "Maruti Suzuki";
	}

	@Bean
	public double carPrice() {
		System.out.println("Registering carPrice.....");
		return 60000000;
	}

	@Bean
	public int carNoOfWheels() {
		System.out.println("Registering carNoOfWheels....");
		return 4;
	}

	@Bean
	public String carOwnerName() {
		System.out.println("Registering carOwnerName.....");
		return "Gavi";
	}

	@Bean
	public boolean carHavingEngine() {
		System.out.println("Registering carHavingEngine....");
		return true;
	}

	@Bean
	public int carFuelCapacity() {
		System.out.println("Registering carFuelCapacity.....");
		return 6;
	}

	@Bean
	public double carMilage() {
		System.out.println("Registering carMilage......");
		return 22;
	}

	@Bean
	public int carSeatCapacity() {
		System.out.println("Registering carSeatCapacity....");
		return 5;
	}

}
