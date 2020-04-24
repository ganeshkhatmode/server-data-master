package com.gk.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.gk.exception.EntitlementIdNotFoundException;
import com.gk.model.ExceptionResponse;

@RestControllerAdvice
public class ExceptionHandlerController {
	
	
	@ExceptionHandler({EntitlementIdNotFoundException.class})
	public ResponseEntity<ExceptionResponse> notFoundException(EntitlementIdNotFoundException entitlementIdNotFoundException, HttpServletRequest request){
		return new ResponseEntity<ExceptionResponse>(new ExceptionResponse(entitlementIdNotFoundException.getMessage(), HttpStatus.NOT_FOUND.value(), request.getRequestURI().toString(), new Date()), HttpStatus.NOT_FOUND);
	} 

}
