package com.example.poc.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * The Class Employee.
 */
public class Employee {

  /** The id. */
  private int id;

  /** The name. */
  @NotEmpty(message="Name should not be empty")
  private String name;

  /** The address. */
  @NotEmpty(message="Address should not be empty")
  private String address;

  /** The department. */
  @NotEmpty(message="Department should not be empty")
  private String department;

  /** The doj. */
  @NotEmpty(message="DOJ should not be empty")
  private String doj;

  /** The salary. */
  @NotNull(message="Salary should not be empty")
  private long salary;

  /**
   * Instantiates a new employee.
   *
   * @param id
   *          the id
   * @param name
   *          the name
   * @param address
   *          the address
   * @param department
   *          the department
   * @param doj
   *          the doj
   * @param salary
   *          the salary
   */
  public Employee(int id, String name, String address, String department, String doj, long salary) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.department = department;
    this.doj = doj;
    this.salary = salary;
  }
  
  

  public Employee() {
    super();
  }



  /**
   * Gets the id.
   *
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id
   *          the new id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name.
   *
   * @param name
   *          the new name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the address.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the address.
   *
   * @param address
   *          the new address
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Gets the department.
   *
   * @return the department
   */
  public String getDepartment() {
    return department;
  }

  /**
   * Sets the department.
   *
   * @param department
   *          the new department
   */
  public void setDepartment(String department) {
    this.department = department;
  }

  /**
   * Gets the doj.
   *
   * @return the doj
   */
  public String getDoj() {
    return doj;
  }

  /**
   * Sets the doj.
   *
   * @param doj
   *          the new doj
   */
  public void setDoj(String doj) {
    this.doj = doj;
  }

  /**
   * Gets the salary.
   *
   * @return the salary
   */
  public long getSalary() {
    return salary;
  }

  /**
   * Sets the salary.
   *
   * @param salary
   *          the new salary
   */
  public void setSalary(long salary) {
    this.salary = salary;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", department="
        + department + ", doj=" + doj + ", salary=" + salary + "]";
  }

}
