package com.gl.empManagement.service;

import java.util.List;

import com.gl.empManagement.entity.Employee;


public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public void saveEmployee(Employee emp); 
	public int deleteEmpById(int id);
	public Employee findEmpById(int id);


}
