package com.xworkz.examples.constant.repository;

import java.nio.BufferOverflowException;

import com.xworkz.examples.constant.dto.RailwayStationDTO;

public interface RailwayStationRepository {

	boolean save(RailwayStationDTO dto) throws BufferOverflowException;

}
