package com.xworkz.soldier.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class AbstractorAuditDTO implements Serializable {

	private String createdBy;
	private String updateBy;
	private LocalDateTime updateDate;
	private LocalDateTime createdDate;

}
