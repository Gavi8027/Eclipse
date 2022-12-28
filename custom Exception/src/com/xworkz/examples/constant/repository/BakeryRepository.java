package com.xworkz.examples.constant.repository;

import com.xworkz.examples.exception.ArrayStoreException;
import com.xworkz.examples.constant.dto.AbstractAuditDTO;
import com.xworkz.examples.constant.dto.BakeryDTO;

public interface BakeryRepository {
	

	boolean save(BakeryDTO dto)throws ArrayStoreException; 

}
