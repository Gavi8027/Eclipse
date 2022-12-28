package com.xworkz.collection.dto;

import java.io.Serializable;

public class GameDTO implements Serializable{
	
	private String name;
	private int noOfPlayers;
	private String type;
	
	public boolean equals(Object obj) {
		System.out.println("Running equals methods");
		if(obj!=null) {
			if(obj instanceof GameDTO) {
				GameDTO dto=(GameDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("namee is matching " + dto.name);
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	public GameDTO() {
		
	}

	public GameDTO(String name, String type, int noOfPlayers) {
		super();
		this.name = name;
		this.noOfPlayers = noOfPlayers;
		this.type = type;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", noOfPlayers=" + noOfPlayers + ", type=" + type + ", toString()="
				+ super.toString() + "]";
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
