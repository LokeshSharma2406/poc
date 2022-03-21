package com.example.poc.exceptions;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.poc.controller.EmployeeController;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
  
  public static final Logger LOGGER = LoggerFactory.getLogger(CustomResponseEntityExceptionHandler.class);

  @ExceptionHandler(EmployeeNotFoundException.class)
  public ResponseEntity<Object> employeNotFound(EmployeeNotFoundException ex, WebRequest request) {
    LOGGER.error("Employee not found exception occured");
    ExceptionResponse response = new ExceptionResponse(ex.getMessage(), new Date(), "not found");
    return new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND);
  }

  @Override 
  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
      HttpHeaders headers, HttpStatus status, WebRequest request) {
    LOGGER.error("HandleMethodArgumentNotValid exception occured "+ex.getMessage());
    ExceptionResponse error = new ExceptionResponse(ex.getBindingResult().getAllErrors().toString(), new Date(),
        "Request body validation fails");
    return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
  }
}
