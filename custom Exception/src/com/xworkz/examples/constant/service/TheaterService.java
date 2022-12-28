package com.xworkz.examples.constant.service;

import com.xworkz.examples.constant.dto.TheaterDTO;
import com.xworkz.examples.constant.repository.TheaterRepository;
import com.xworkz.examples.exception.InvalidTheaterDataException;

public interface TheaterService {

	boolean validateAndSave(TheaterDTO dto) throws InvalidTheaterDataException, InvalidTheaterDataException;

}
