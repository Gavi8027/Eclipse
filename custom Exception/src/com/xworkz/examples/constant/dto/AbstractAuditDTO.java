package com.xworkz.examples.constant.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAuditDTO implements Serializable {

	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updateddate;

	public AbstractAuditDTO() {
		System.out.println("calling no arg constractor of AbstractAuditDTO");
	}

	public AbstractAuditDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updateddate) {
		super();
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updateddate = updateddate;
	}

	@Override
	public String toString() {
		return "AbstractAuditDTO [createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updateddate=" + updateddate + ", toString()=" + super.toString() + "]";
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(LocalDateTime updateddate) {
		this.updateddate = updateddate;
	}

}
