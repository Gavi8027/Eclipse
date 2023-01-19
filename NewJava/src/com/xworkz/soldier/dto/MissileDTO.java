package com.xworkz.soldier.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MissileDTO extends AbstractorAuditDTO {

	public MissileDTO() {
		System.out.println("Creating MissileDTO with no arg constractor");
	}

}
