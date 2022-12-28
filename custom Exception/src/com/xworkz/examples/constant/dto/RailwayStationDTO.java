package com.xworkz.examples.constant.dto;

import java.time.LocalDateTime;

public class RailwayStationDTO extends AbstractAuditDTO {

	private String name;
	private int noOFPlatforms;
	private String area;
	private int platformTicketPrice;

	public RailwayStationDTO() {
      System.out.println();
	}

	@Override
	public String toString() {
		return "RailwayStationDTO [name=" + name + ", noOFPlatforms=" + noOFPlatforms + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}

	public RailwayStationDTO(String name, int noOFPlatforms, String area, int platformTicketPrice, String createdBy,
			LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		super.getCreatedDate();
		super.getUpdatedBy();
		super.getUpdateddate();
		this.name = name;
		this.noOFPlatforms = noOFPlatforms;
		this.area = area;
		this.platformTicketPrice = platformTicketPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOFPlatforms() {
		return noOFPlatforms;
	}

	public void setNoOFPlatforms(int noOFPlatforms) {
		this.noOFPlatforms = noOFPlatforms;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPlatformTicketPrice() {
		return platformTicketPrice;
	}

	public void setPlatformTicketPrice(int platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}

}
