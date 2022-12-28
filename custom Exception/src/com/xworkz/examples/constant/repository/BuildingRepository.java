package com.xworkz.examples.constant.repository;

import javax.management.JMRuntimeException;

import com.xworkz.examples.constant.dto.BuildingDTO;

public interface BuildingRepository{

	boolean save(BuildingDTO dto)throws JMRuntimeException;

}
