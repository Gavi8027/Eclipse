package com.xworkz.spring.configuration;

import javax.swing.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")

public class NESGConfiguration {

	@Bean
	public int newsPapedId() {
		System.out.println("Registering newsPapedId...........");
		return 5;
	}

	@Bean
	public String newsPaperName() {
		System.out.println("Registering newsPaperName........");
		return "Vijayavani";
	}

	@Bean
	public String newsPaperOwnerName() {
		System.out.println("Registering newsPaperOwnerName......");
		return "Sankeshwar";
	}

	@Bean
	public String newsPaperLanguage() {
		System.out.println("Registering newsPaperLanguage.......");
		return "Kannada";
	}

	public double newsPaperPrice() {
		System.out.println("Registering newsPaperPrice............");
		return 6;
	}

	// @Value : String,primitive,Wrapper Clasess
	// @Autowired : type ref
	@Bean
	public String engineName() {
		System.out.println("Registering engineName..........");
		return "DabbaEngine";
	}

	@Bean
	public String enigeType() {
		System.out.println("Registering enigeType.............");
		return "Petrol";
	}

	@Bean
	public String engineCompany() {
		System.out.println("Registering engineCompany.........");
		return "Mahendra";
	}

	@Bean
	public double engineNumber() {
		System.out.println("Registering engineNumber.......");
		return 25172.37;
	}

	@Bean
	public double engineVersion() {
		System.out.println("Registering engineVersion........");
		return 37.9;
	}

	@Bean
	public int engineStrokes() {
		System.out.println("Registering engineStrokes.........");
		return 4;
	}

	@Bean
	public String snakeName() {
		System.out.println("Registering snakeName..........");
		return "SanakeKing";
	}

	@Bean
	public double snakeLength() {
		System.out.println("Registering snakeLength..........");
		return 6.3;
	}

	@Bean
	public String snakeColor() {
		System.out.println("Registering snakeColor..........");
		return "Brown";
	}

	@Bean
	public String snakeType() {
		System.out.println("Registering snakeType..........");
		return "Fat";
	}

	@Bean
	public boolean snakePoisionous() {
		System.out.println("Registering snakePoisionous..........");
		return true;
	}

	@Bean
	public String ghostName() {
		System.out.println("Registering ghostName.............");
		return "Bethala";
	}

	@Bean
	public int ghostAge() {
		System.out.println("Registering ghostAge.............");
		return 66;
	}

	@Bean
	public String ghostGender() {
		System.out.println("Registering ghostCast.............");
		return "Male";
	}

	@Bean
	public String ghostCast() {
		System.out.println("Registering ghostCast.............");
		return "Others";
	}

	@Bean
	public double ghostMoNo() {
		System.out.println("Registering ghostMoNo.............");
		return 937463728;
	}

	@Bean
	public String ghostSurName() {
		System.out.println("Registering ghostSurName.............");
		return "Pichashi";
	}

	@Bean
	public int ghostHeight() {
		System.out.println("Registering ghostHeight.............");
		return 6;
	}

	@Bean
	public double ghostWeight() {
		System.out.println("Registering ghostWeight.............");
		return 88.43;
	}

	@Bean
	public String ghostColorr() {
		System.out.println("Registering ghostColor.............");
		return "Black";
	}

	@Bean
	public String ghostJob() {
		System.out.println("Registering ghostJob.............");
		return "Kadodu";
	}

	@Bean
	public String ghostLocation() {
		System.out.println("Registering ghostLocation.............");
		return "Sudugadu";
	}

	@Bean
	public int ghostNailLength() {
		System.out.println("Registering ghostNailLength.............");
		return 4;
	}

	@Bean
	public String ghostFatherName() {
		System.out.println("Registering ghostFatherName.............");
		return "Saitan";
	}

	@Bean
	public String ghostMotherName() {
		System.out.println("Registering ghostMotherName.............");
		return "Devil";
	}

	@Bean
	public String ghostWifeName() {
		System.out.println("Registering ghostWifeName.............");
		return "PedamBhoota";
	}

	@Bean
	public String ghostDaughterName() {
		System.out.println("Registering ghostDaughterName.............");
		return "SannaBhoota";
	}

	@Bean
	public String ghostEmail() {
		System.out.println("Registering ghostEmail.............");
		return "betala@gmail.com";
	}

	@Bean
	public double ghostAadharaNo() {
		System.out.println("Registering ghostAadharaNo.............");
		return 637382922;
	}

	@Bean
	public String ghostEducation() {
		System.out.println("Registering ghostEducation.............");
		return "BE";
	}

	@Bean
	public boolean ghostIndian() {
		System.out.println("Registering ghostName.............");
		return true;
	}

}
