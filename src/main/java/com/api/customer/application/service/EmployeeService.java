package com.api.customer.application.service;

import java.util.List;

import com.api.customer.application.entity.Employee;

public interface EmployeeService {
	 public List<Employee> retrieveEmployees();
	  
	 public Employee getEmployee(Long employeeId);
	  
	 public void saveEmployee(Employee employee);
	  
	 public void deleteEmployee(Long employeeId);
	  
	 public void updateEmployee(Employee employee);

}
