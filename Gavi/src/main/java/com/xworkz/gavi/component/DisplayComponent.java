package com.xworkz.gavi.component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.gavi.dto.BeveragesDto;
import com.xworkz.gavi.dto.ChatDto;
import com.xworkz.gavi.dto.EducationDto;
import com.xworkz.gavi.dto.FamilyDto;
import com.xworkz.gavi.dto.MobileDto;

@Component
@RequestMapping
public class DisplayComponent {

	public DisplayComponent() {
		System.out.println("crating" + this.getClass().getSimpleName());

	}

	@GetMapping("/sending")
	public String toEmail(Model model) {
		System.out.println("Running toEmail.....");
		String email = "gavi@gmail.com";
		model.addAttribute("kalisu",email);
		return "index.jsp";

	}

	@GetMapping("/mb")
	public String toMobile(Model model) {
		System.out.println("Running toMobile.....");
        double num= 9916763682d;
		model.addAttribute("nbr",num);
		return "index.jsp";

	}

	@GetMapping("/guritiniCheete")
	public String toAadhar(Model model) {
		System.out.println("Running toAadhar.....");
		double aadhar= 829136518000d;
		model.addAttribute("aadhar", aadhar);
		return "index.jsp";

	}

	@GetMapping("/shata")
	public String toAge(Model model) {
		System.out.println("Running toAge.....");
		int age = 23;
		model.addAttribute("Vayasu",age);
		return "index.jsp";

	}

	@GetMapping("/birth")
	public String toDOB(Model model) {
		System.out.println("Running toDOB.....");
		model.addAttribute("tariku", LocalDate.now());
		return "index.jsp";

	}

	@GetMapping("/pagara")
	public String toSalary(Model model) {
		System.out.println("Running toSalary...");
		double payment=34000d;
		model.addAttribute("payment", payment);
		return "index.jsp";

	}

	@GetMapping("/dosta")
	public String BestFriends(Model model) {
		System.out.println("Running BestFriends");
		List<String> ref = new ArrayList<String>();
		ref.add("Anil");
		ref.add("Raju");
		ref.add("Ramesh");
		ref.add("satish");
		ref.add("Pandu");

		model.addAttribute("friends", ref);
		return "index.jsp";
	}

	@GetMapping("/stala")
	public String visitedPlaces(Model model) {
		System.out.println("Running visitedPlaces");
		List<String> ref2 = new ArrayList<String>();
		ref2.add("Dharmastala");
		ref2.add("Murudeshwra");
		ref2.add("Hampi");
		ref2.add("Badami");
		ref2.add("Mahakuta");

		model.addAttribute("wonder", ref2);
		return "index.jsp";
	}

	@GetMapping("/koushyla")
	public String skillSet(Model model) {
		System.out.println("Running visitedPlaces");
		List<String> ref3 = new ArrayList<String>();
		ref3.add("Java");
		ref3.add("Python");
		ref3.add("SQL");
		ref3.add("HTML");
		ref3.add("CSS");

		model.addAttribute("skills", ref3);
		return "index.jsp";
	}

	@GetMapping("/kutumba")
	public String familyDto(Model model) {
		System.out.println("Running familyDto");

		FamilyDto dto = new FamilyDto();
		dto.setFName("Ramesh");
		dto.setMName("Ritu");
		dto.setBrotherInLwa("Raghu");
		dto.setUncleName("Soma");
		dto.setAuntyName("Lata");
		dto.setBName("Ravi");
		dto.setNoOfChilderns(4);
		dto.setSonInLwaName("Chintu");
		dto.setSisterInLaw("Roja");
		dto.setSName("Megha");
		model.addAttribute("family",dto);
		return "index.jsp";

	}

	@GetMapping("/vidye")
	public String toEducationDto(Model model) {
		System.out.println("Running toEducationDto");

		EducationDto dto1 = new EducationDto();
		dto1.setSchoolName("Lions");
		dto1.setPuClgName("BVM");
		dto1.setDegreeClgName("RYMEC");
		dto1.setSchoolLocation("GVT");
		dto1.setClgLocation("Hubballi");
		dto1.setDegreeLocation("Ballari");
		dto1.setSslcPercentage(77);
		dto1.setDegreePercentage(71);
		dto1.setPuPercentage(64);
		dto1.setSchoolRank("First");
		model.addAttribute("education", dto1);
		return "index.jsp";

	}

	@GetMapping("/duravani")
	public String toMobileDto(Model model) {
		System.out.println("Running toMobileDto");

		MobileDto dto2 = new MobileDto();
		dto2.setName("Redmi");
		dto2.setCompanyName("MI");
		dto2.setColor("Black");
		dto2.setPrice(64748);
		dto2.setRam(4);

		model.addAttribute("mobile", dto2);

		return "index.jsp";

	}

	@GetMapping("/wine")
	public String toBeveragesDto(Model model) {

		System.out.println("Running toBeveragesDto");
		BeveragesDto dto3 = new BeveragesDto();
		dto3.setBrand("smirnoff");
		dto3.setName("vodka");
		dto3.setColor("Red");
		dto3.setFlevour("orange");
		dto3.setNotGoodForHealth(true);
		dto3.setGoodForHealth(false);
		dto3.setRating(5.5);
		dto3.setPrice(5374);
		model.addAttribute("beverages",dto3 );

		return "index.jsp";

	}

	@GetMapping("/snacks")
	public String toChatDto(Model model) {
		System.out.println("Running toChatDto");

		ChatDto dto4 = new ChatDto();
		dto4.setName("Panipuri");
		dto4.setPrice(30);
		dto4.setSweet(false);
		dto4.setColor("Brown");
		dto4.setFlevour("Crunchy");
		dto4.setTasty(true);
		dto4.setRating(5.5);
		dto4.setNotGood(false);
		dto4.setCombination("Pani");
		dto4.setKaara(true);
		model.addAttribute("chat", dto4);

		return "index.jsp";

	}

}
