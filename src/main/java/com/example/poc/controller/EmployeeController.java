package com.example.poc.controller;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.poc.entity.EmployeeEntity;
import com.example.poc.entity.Movies;
import com.example.poc.exceptions.EmployeeNotFoundException;
import com.example.poc.models.Employee;
import com.example.poc.service.EmployeeService;

/**
 * The Class EmployeeController.
 */
@RestController
public class EmployeeController {

	public static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;
	

	@RequestMapping(method = RequestMethod.GET, value = "/employees")
	public ResponseEntity<List<Employee>> getemployee() {
		List<Employee> allEmployees = employeeService.getAllEmployees();
		if (CollectionUtils.isEmpty(allEmployees)) {
			throw new EmployeeNotFoundException("Emplyee not found");
		}
		return new ResponseEntity<List<Employee>>(allEmployees, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public ResponseEntity<Employee> addEmployees(@Valid @RequestBody Employee emp) {
		Employee employee = employeeService.saveEmployee(emp);
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/employees/{id}")
	public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable("id") int id) {

		LOGGER.info("Fetching employee with id {}", id);
		Optional<EmployeeEntity> optionalEmployee = employeeService.getEmployeeById(id);
		Supplier<EmployeeNotFoundException> exceptionSupplier = () -> new EmployeeNotFoundException(
				"Emplyee not found");
		EmployeeEntity response = optionalEmployee.orElseThrow(exceptionSupplier);
		return new ResponseEntity<EmployeeEntity>(response, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
	public ResponseEntity<EmployeeEntity> updateEmployees(@Valid @RequestBody Employee emp,
			@PathVariable("id") int id) {
		LOGGER.info("Fetching employee with id {}", id);
		Optional<EmployeeEntity> optionalEmployee = employeeService.getEmployeeById(id);
		Supplier<EmployeeNotFoundException> exceptionSupplier = () -> new EmployeeNotFoundException(
				"Emplyee not found");
		EmployeeEntity employeeEntity = optionalEmployee.orElseThrow(exceptionSupplier);
		employeeEntity.setName(emp.getName());
		employeeEntity.setAddress(emp.getAddress());
		employeeEntity.setSalary(emp.getSalary());
		employeeEntity.setDepartment(emp.getDepartment());
		employeeEntity.setDoj(emp.getDoj());

		EmployeeEntity response = employeeService.updateEmployee(employeeEntity);
		return new ResponseEntity<EmployeeEntity>(response, HttpStatus.CREATED);
	}

	

}
