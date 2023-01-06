package com.xworkz.collection.dto;

import java.io.Serializable;

public class TheaterDTO implements Serializable {

	private String name;
	private String location;
	private String movieName;
	private float rating;

	public TheaterDTO() {

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof TheaterDTO) {
				TheaterDTO dto = (TheaterDTO) obj;
				if (dto.name.equals(this.name) && dto.location.equals(this.location)) {
					
				return true;
			}
		}
		}
		return false;
	}

	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", location=" + location + ", movieName=" + movieName + ", rating=" + rating
				+ "]";
	}

	public TheaterDTO(String name, String location, String movieName, float rating) {
		super();
		this.name = name;
		this.location = location;
		this.movieName = movieName;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

}
