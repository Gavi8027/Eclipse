package com.xworkz.pizza.constant.boot;

import java.time.LocalDateTime;

import com.xworkz.dto.PizzaDTO;
import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.constant.boot.service.PizzaService.Pizza;
import com.xworkz.pizza.constant.boot.service.PizzaServiceimpl;

public class PizzaRunner {

	public static void main(String[] args) {
		
		PizzaDTO pizzaDto = new PizzaDTO();	
		Pizza pizza = new PizzaServiceimpl();
		
		pizzaDto.setPrice(3000);
		pizzaDto.setType("Veg");
		pizzaDto.setFlavour("Cheese Flavour");
		pizzaDto.setCheese(true);
		pizzaDto.setSize(PizzaSize.LARGE);
		pizzaDto.setCompany("Dominos");
		pizzaDto.setName("Mexican Pizza");
	    pizzaDto.setCreatedBy("Gavi");
	    pizzaDto.setCreatedDateTime(LocalDateTime.of(2022, 12, 12, 10, 10));
	    pizzaDto.setUpdatedBy("system");
	    pizzaDto.setCreatedDateTime(LocalDateTime.of(2022, 12, 14, 9, 10));
			
	    pizza.pizzaCreate(pizzaDto);

	}

}
