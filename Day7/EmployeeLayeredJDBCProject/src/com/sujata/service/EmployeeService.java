package com.sujata.service;

import java.util.List;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePaySlip;
import com.sujata.exceptions.DuplicateEmployeeIdException;
import com.sujata.exceptions.NoEmployeeFound;

public interface EmployeeService {

	List<Employee> getAllEmployee()throws NoEmployeeFound;
	
	boolean addNewEmployee(Employee employee)throws DuplicateEmployeeIdException;
	
	Employee searchEmployeeById(int employeeId)throws NoEmployeeFound;
	
	EmployeePaySlip getEmployeePayslip(int employeeId)throws NoEmployeeFound;
}
