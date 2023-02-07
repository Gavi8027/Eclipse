package com.xworkz.casino.component;



import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.casino.dto.CasinoDto;

	@Component
	@RequestMapping("/goa")
	public class CasinoComp {

		public CasinoComp() {
			System.out.println("Creating :" + this.getClass().getSimpleName());
		}

		@PostMapping
		public String toSend(CasinoDto dto,Model model) {
			System.out.println("Creating To send");
			System.out.println(dto);
			model.addAttribute("name", dto.getClass());
		    model.addAttribute("prize", dto.getPrize());
			return "casinoSucess.jsp";

		}
	}


