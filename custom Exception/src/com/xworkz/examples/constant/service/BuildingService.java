package com.xworkz.examples.constant.service;

import javax.management.JMRuntimeException;

import com.xworkz.examples.constant.dto.BuildingDTO;
import com.xworkz.examples.exception.BadLocationException;

public interface BuildingService {

	boolean validateAndSave(BuildingDTO dto) throws BadLocationException, JMRuntimeException;

}
