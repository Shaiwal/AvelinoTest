package com.avellino.avelinowebportal.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.avellino.avelinowebportal.model.Clinic;

@Service
public interface IDemoService {

	List<Clinic> getAllClinic();
	List<Clinic> findAllClinic() ;
	
}
