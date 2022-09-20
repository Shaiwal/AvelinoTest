package com.avellino.avelinowebportal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.avellino.avelinowebportal.exceptions.TestExceptions;

@ControllerAdvice
public class GenericExceptionController {
	
	@ExceptionHandler(value = TestExceptions.class)
	   public ResponseEntity<Object> exception(TestExceptions exception) {
	      return new ResponseEntity<>("Test Error", HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
