package com.example.poc.exceptions;

public class EmployeeNotFoundException extends RuntimeException {

  public EmployeeNotFoundException(String msg) {
    super(msg);
  }
}
