package com.example.poc.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.poc.entity.EmployeeEntity;
import com.example.poc.models.Employee;
import com.example.poc.repository.EmployeeRepository;
import com.example.poc.service.EmployeeService;

@Service
public class EmployeeServiceIml implements EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  @Override
  public List<Employee> getAllEmployees() {
    List<Employee> employee = new ArrayList<>();
    List<EmployeeEntity> employeeEntity = employeeRepository.findAll();
    employeeEntity.forEach(obj -> {
      Employee emp = new Employee();
      BeanUtils.copyProperties(obj, emp);
      employee.add(emp);
    });
    return employee;
  }

  @Override
  public Employee saveEmployee(Employee emp) {
    EmployeeEntity entity = new EmployeeEntity();
    BeanUtils.copyProperties(emp, entity);
    EmployeeEntity result = employeeRepository.save(entity);
    BeanUtils.copyProperties(result, emp);
    return emp;
  }

  @Override
  public Optional<EmployeeEntity> getEmployeeById(int id) {

    Optional<EmployeeEntity> optionalEmployee = employeeRepository.findById(id);
    return optionalEmployee;
  }

  @Override
  public EmployeeEntity updateEmployee(EmployeeEntity emp) {

    EmployeeEntity result = employeeRepository.save(emp);
    
    return result;
  }
}
