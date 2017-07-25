package com.springboot.service;

import java.util.List;

import com.springboot.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	public Employee getEmployee(Integer id);
	public Employee createEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(Integer id);
}
 