package com.xworkz.examples.constant.service;

import java.util.zip.DataFormatException;

import com.xworkz.examples.constant.dto.BakeryDTO;

public interface BakeryService {

	boolean validateAndSave(BakeryDTO dto) throws DataFormatException,ArrayStoreException;

}
