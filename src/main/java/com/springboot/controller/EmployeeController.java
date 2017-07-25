package com.springboot.controller;


import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	 private static Logger log = Logger.getLogger(EmployeeController.class);
	
	@RequestMapping(value= "/employee", method = RequestMethod.GET)
    public List<Employee> getEmployees() 
    {
		log.info("getting list of employees");
		return employeeService.getEmployees();
    }
	
	@RequestMapping(value="/employee/", method = RequestMethod.POST)
	public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
		log.info("creating new employee");
		employeeService.createEmployee(employee);
		return ResponseEntity.ok("Employee created.");
	}
	
	@RequestMapping(value="/employee/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateEmployee(@PathVariable("id") Integer id, @RequestBody Employee employee) {
		log.info("updating employee: " +id);
		employeeService.updateEmployee(employee);
		return ResponseEntity.ok("employee updated.");
	}
	
	/*@RequestMapping(value="/employee/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id) {	
		log.info("deleting employee: " +id);
		return ResponseEntity.ok(employeeService.deleteEmployee(id));
	}*/

}
