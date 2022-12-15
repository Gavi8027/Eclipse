package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.WarDTO;

public abstract class WarRepositoryimpl implements WarRepository {

	private WarDTO[] warDtos = new WarDTO[1];
	private int currentindex = 0;

	@Override
	public boolean fight(WarDTO dto) {
		System.out.println("create warDTO " + dto);
		if (this.currentindex >= this.warDtos.length)
			;
		System.err.println("size exceeded");
		throw new WarSIzeExeededException();
	}
	
	public WarDTO findByStartBy(String startBy) {
		System.out.println("running findByStartBy" + startBy);
		for(WarDTO war: warDtos) {
			String startBy1=war.getStartBy();
			if(war!=null && war.getStartBy().equalsIgnoreCase(startBy1)) {
				System.out.println("war is found"+ startBy1);
				return war;
			}
			
		}
		System.out.println("war is not found or null");
		return null;
	}

	@Override
	public boolean fight(WarDTO[] dtos) {
		return false;
	}

}
