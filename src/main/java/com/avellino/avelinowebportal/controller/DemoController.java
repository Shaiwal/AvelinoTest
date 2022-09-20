package com.avellino.avelinowebportal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.avellino.avelinowebportal.model.Clinic;
import com.avellino.avelinowebportal.model.Response;
import com.avellino.avelinowebportal.service.DemoService;

import static com.avellino.avelinowebportal.utils.Constants.TEST;
import static com.avellino.avelinowebportal.utils.Constants.SUCCESS;
import static com.avellino.avelinowebportal.utils.Constants.FAILURE;

import java.util.List;

@RestController
public class DemoController {
	
    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
    
    @Autowired
    private DemoService demoService;
    
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    	logger.info("Logging Constant:: ", TEST);
    	logger.info("Here is sample logger", name);
    	return String.format("Hello %s!", name);
    }
    
    @GetMapping("/getAllClinics")
    public Response<List<Clinic>> getAllClinics() {
    	logger.info("Controller - getAllClinics");
    	List<Clinic> clinics = this.demoService.getAllClinic();
    	if(!clinics.isEmpty()) {
    		return new Response<List<Clinic>>(SUCCESS, "abcd", clinics);
    	}
    	return new Response<List<Clinic>>(FAILURE, "No Data Present", clinics); 
    }
    
    @GetMapping("/findAllClinics")
    public Response<List<Clinic>> findAllClinics() {
    	logger.info("Controller - getAllClinics");
    	List<Clinic> clinics = this.demoService.findAllClinic();
    	if(!clinics.isEmpty()) {
    		return new Response<List<Clinic>>(SUCCESS, "abcd", clinics);
    	}
    	return new Response<List<Clinic>>(FAILURE, "No Data Present", clinics); 
    }
  
}
