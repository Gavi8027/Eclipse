package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SoldiersDTO extends AbstractorAuditDTO {
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20)
	private String name;
	@Min(1)
	@Max(200000)
	private int id;
	@NotNull
	@NotBlank
	@Size(min = 4, max = 100000)
	private String rank;
	@NotNull
	@NotBlank
	@Size(min = 5, max = 47000)
	private String batallion;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 500)
	private String country;

}
