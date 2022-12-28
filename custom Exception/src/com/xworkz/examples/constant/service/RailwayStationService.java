package com.xworkz.examples.constant.service;

import java.nio.BufferOverflowException;
import java.util.prefs.BackingStoreException;

import com.xworkz.examples.constant.dto.RailwayStationDTO;
import com.xworkz.examples.exception.InvalidTheaterDataException;

public interface RailwayStationService {

	boolean validateAndSave(RailwayStationDTO dto) throws BackingStoreException, BufferOverflowException;

}
