package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;
import com.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployee(Integer id) {
		return null;
	}

	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);

	}

	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public String   deleteEmployee(Integer id) {
		employeeRepository.delete(id);
		return "Employee deleted";
	}

}
