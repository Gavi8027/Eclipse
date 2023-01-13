package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {

	@Autowired
	@Qualifier("newsPapedId")
	private int id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("newsPaperLanguage")
	private String language;
	private double price;

	public NewsPaper(@Qualifier("newsPaperName") String name, @Qualifier("newsPaperOwnerName") String ownerName,
			@Value("45") double price) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}
	// @Autowired
	// @Qualifier("newsPaperPrice")
	// public void setPrice(double price) {
	// this.price = price;
	// }

	// public double getPrice() {
	// return price;
	// }

}
