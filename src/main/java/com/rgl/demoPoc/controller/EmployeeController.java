package com.rgl.demoPoc.controller;

import java.util.List;
import com.rgl.demoPoc.domain.Employee;
import com.rgl.demoPoc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping(path = "/employee/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getAccountById(@PathVariable Long id) {
		if (!service.isEmployeePresent(id)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.ok(service.getEmployeeById(id));
	}
	
	@RequestMapping(path = "/employee", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmployees() {
		return ResponseEntity.ok(service.getEmployees());
	}

	@RequestMapping(path = "/employee", method = RequestMethod.POST)
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		System.out.println("New employee Added");
		service.addEmployee(employee);
		return new ResponseEntity<>(HttpStatus.OK);
		//return ResponseEntity.status(HttpStatus.CREATED).body(service.addEmployee(employee));
	}

	@RequestMapping(path = "/employee/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		if (!service.isEmployeePresent(id)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		System.out.println("Employee updated");
		service.updateEmployee(id, employee);
		return new ResponseEntity<>(HttpStatus.OK);
		//return ResponseEntity.ok(service.updateEmployee(id, employee));
	}

	@RequestMapping(path = "/employee/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
		if (!service.isEmployeePresent(id)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		service.deleteEmployee(id);
		return ResponseEntity.ok(String.format("Account with ID : %d is deleted successfuly", id));
	}
}
