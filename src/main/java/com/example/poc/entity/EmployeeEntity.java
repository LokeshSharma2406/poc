package com.example.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Employee_Tb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class EmployeeEntity {

  @Id
  @GeneratedValue
  @Column(name = "EMPLOYEE_ID")
  private int id;

  @Column(name = "EMPLOYEE_NAME")
  private String name;

  @Column(name = "EMPLOYEE_ADDRESS")
  private String address;

  @Column(name = "DEPARTMENT")
  private String department;

  @Column(name = "DOJ")
  private String doj;

  @Column(name = "SALARY")
  private long salary;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getDoj() {
    return doj;
  }

  public void setDoj(String doj) {
    this.doj = doj;
  }

  public long getSalary() {
    return salary;
  }

  public void setSalary(long salary) {
    this.salary = salary;
  }

  public EmployeeEntity(int id, String name, String address, String department, String doj,
      long salary) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.department = department;
    this.doj = doj;
    this.salary = salary;
  }

  public EmployeeEntity() {
    super();
    // TODO Auto-generated constructor stub
  }
  

}
