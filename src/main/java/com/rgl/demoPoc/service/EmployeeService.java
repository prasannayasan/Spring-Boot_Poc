package com.rgl.demoPoc.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rgl.demoPoc.domain.Employee;
import com.rgl.demoPoc.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;
	
	public boolean isEmployeePresent(Long id) {
		return repository.existsById(id);
	}
	
	public Employee getEmployeeById(Long id) {
		return repository.getOne(id);
	}
	/*
	public void updateDemo() {
		Employee employeeDemo = new Employee();
		employeeDemo.setEmp_id((long) 001);
		employeeDemo.setFirst_name("RamaRaj");
		employeeDemo.setLast_name("Pandiyan");
		employeeDemo.setDate_of_birth("1997-10-25");
		employeeDemo.setPosition("Associate");
		employeeDemo.setDepartment("Development");
		employeeDemo.setExperience(2);
		employeeDemo.setLocation("USA");
		employeeDemo.setJoining_date("2017-07-14");
		System.out.println(employeeDemo.emp_id);
		System.out.println(employeeDemo.experience);
		System.out.println(employeeDemo.date_of_birth);
		System.out.println(employeeDemo.joining_date);
		System.out.println(employeeDemo.first_name);
		System.out.println(employeeDemo.last_name);
		System.out.println(employeeDemo.position);
		System.out.println(employeeDemo.department);
		System.out.println(employeeDemo.location);
		repository.save(employeeDemo);
	}
	
	public void getAllEmployees() {
		Employee employee = new Employee();
		Iterator<Employee> employeeIterator = repository.findAll().iterator();
		while (employeeIterator.hasNext()) {
			employee = employeeIterator.next();
			System.out.println(employee.emp_id);
			System.out.println(employee.first_name);
			System.out.println(employee.last_name);
			System.out.println(employee.experience);
			System.out.println(employee.date_of_birth);
			System.out.println(employee.position);
			System.out.println(employee.department);
			System.out.println(employee.joining_date);
			System.out.println(employee.location);
		}
	} */
		
	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		Iterator<Employee> employeeIterator = repository.findAll().iterator();
		while (employeeIterator.hasNext()) {
			employees.add(employeeIterator.next());
		}
		return employees;
	}
	
	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	public Employee updateEmployee(Long id, Employee updatedEmployee) {
		Employee employeeToBeUpdated = repository.getOne(id);
		employeeToBeUpdated.setFirst_name(updatedEmployee.getFirst_name());
		employeeToBeUpdated.setLast_name(updatedEmployee.getLast_name());
		employeeToBeUpdated.setDate_of_birth(updatedEmployee.getDate_of_birth());
		employeeToBeUpdated.setPosition(updatedEmployee.getPosition());
		employeeToBeUpdated.setDepartment(updatedEmployee.getDepartment());
		employeeToBeUpdated.setExperience(updatedEmployee.getExperience());
		employeeToBeUpdated.setLocation(updatedEmployee.getLocation());
		employeeToBeUpdated.setJoining_date(updatedEmployee.getJoining_date());
		return repository.save(employeeToBeUpdated);
	}
	
	public void deleteEmployee(long id) {
		repository.deleteById(id);
	}
	
}
