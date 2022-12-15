package com.xworkz.ipl.dto;

import java.time.LocalDateTime;

public class WarAbstractAuditDTO{
	
	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updatedDate;
	
	
	public WarAbstractAuditDTO() {
		System.out.println("calling no arg constractor of absctaudit");
	}
	
	
	public String getCreatedBy() {
		return createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void showOff() {
		System.out.println(createdBy);
		System.out.println(createdDate);
		System.out.println(updatedBy);
		System.out.println(updatedDate);
	}
}




