package com.student.globalhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.student.customexception.AgeInvalidException;

@RestControllerAdvice
public class GlobalHandling {
	@ExceptionHandler(AgeInvalidException.class)
	public ResponseEntity<Object>AgeHandler(){
		return new ResponseEntity<Object>("age not eligible",HttpStatus.BAD_GATEWAY);
		
	}

}
