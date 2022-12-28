package com.xworkz.examples.constant.repository;

import com.xworkz.examples.constant.dto.TheaterDTO;
import com.xworkz.examples.exception.StorageFullException;

public interface TheaterRepository {

	boolean save(TheaterDTO dto)throws StorageFullException;
}
