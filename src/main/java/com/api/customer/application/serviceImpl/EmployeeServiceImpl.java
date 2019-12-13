package com.api.customer.application.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.customer.application.entity.Employee;
import com.api.customer.application.repository.EmployeeRepository;
import com.api.customer.application.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService  {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> retrieveEmployees() {
		// TODO Auto-generated method stub
		 List<Employee> employees = employeeRepository.findAll();
		  return employees;
	}

	@Override
	public Employee getEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		Optional<Employee> optEmp = employeeRepository.findById(employeeId);
		  return optEmp.get();
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(employeeId);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		 employeeRepository.save(employee);
	}

}
