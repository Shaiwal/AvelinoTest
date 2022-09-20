package com.avellino.avelinowebportal.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avellino.avelinowebportal.model.Clinic;
import com.avellino.avelinowebportal.repository.ClinicRepository;
import com.avellino.avelinowebportal.service.interfaces.IDemoService;

@Service
public class DemoService implements IDemoService{
	
	private static final Logger logger = LoggerFactory.getLogger(DemoService.class);
	
	@Autowired
	private ClinicRepository clinicRepository;
	
	@Override
	public List<Clinic> getAllClinic() {
		logger.info("Inside Demo Service - getAllClinic");
		List<Clinic> clinicList = new ArrayList<Clinic>();
		try {
			clinicList = this.clinicRepository.getAllClinics();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return clinicList;
	}

	@Override
	public List<Clinic> findAllClinic() {
		logger.info("Inside Demo Service - findAllClinic");
		List<Clinic> clinicList = new ArrayList<Clinic>();
		try {
			clinicList = this.clinicRepository.findAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return clinicList;
	}

}
