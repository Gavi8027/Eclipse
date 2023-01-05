package com.xworkz.stream.dto;

import java.io.Serializable;

public class MovieDTO implements Serializable {

	private String name;
	private double budget;
	private String date;
	private String language;
	private boolean prize;

	public MovieDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", budget=" + budget + ", date=" + date + ", language=" + language
				+ ", prize=" + prize + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof MovieDTO) {
				MovieDTO ref = (MovieDTO) obj;
				if (ref.name.equals(this.name) && ref.language.equals(this.language))
					;
				return true;
			}
		}
		return false;
	}

	public MovieDTO(String name, double budget, String date, String language, boolean prize) {
		super();
		this.name = name;
		this.budget = budget;
		this.date = date;
		this.language = language;
		this.prize = prize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean getPrize() {
		return prize;
	}

	public void setPrize(boolean prize) {
		this.prize = prize;
	}

}
