package com.xworkz.soldier.dto;

import lombok.Getter;

import lombok.Setter;

@Setter
@Getter

public class FirstAidDTO extends AbstractorAuditDTO {

	public FirstAidDTO() {
		System.out.println("creating FirstAidDTO with no arg constractor ");
	}

}
