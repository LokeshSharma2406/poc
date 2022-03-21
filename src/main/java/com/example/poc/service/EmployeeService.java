package com.example.poc.service;

import java.util.List;
import java.util.Optional;

import com.example.poc.entity.EmployeeEntity;
import com.example.poc.models.Employee;

/**
 * The Interface EmployeeService.
 */
public interface EmployeeService {

  public List<Employee> getAllEmployees();
  public Employee saveEmployee(Employee emp);
  public Optional<EmployeeEntity> getEmployeeById(int id);
  public EmployeeEntity updateEmployee(EmployeeEntity emp);
}
