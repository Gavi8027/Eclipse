package com.xworkz.ipl.dto;

import java.time.LocalDateTime;


public class WarDTO extends WarAbstractAuditDTO {

	private String name;//kargil
	private LocalDateTime startDate;//3 may 1999
	private LocalDateTime endDate;//26 july 1999
	private String startBy;     //pak
	private String startedWith;//solders
	private int noOfDeath;//525

	public WarDTO(String name, LocalDateTime startDate, LocalDateTime endDate, String startBy, String startedWith,
			int noOfDeath) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startBy = startBy;
		this.startedWith = startedWith;
		this.noOfDeath = noOfDeath;
	}

	@Override
	public String toString() {
		return "WarDTO [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", startBy=" + startBy
				+ ", startedWith=" + startedWith + ", noOfDeath=" + noOfDeath + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public String getStartBy() {
		return startBy;
	}

	public void setStartBy(String startBy) {
		this.startBy = startBy;
	}

	public String getStartedWith() {
		return startedWith;
	}

	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}

	public int getNoOfDeath() {
		return noOfDeath;
	}

	public void setNoOfDeath(int noOfDeath) {
		this.noOfDeath = noOfDeath;
	}

	
	}


