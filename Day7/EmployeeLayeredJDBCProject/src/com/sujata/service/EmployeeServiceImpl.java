package com.sujata.service;

import java.util.List;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePaySlip;
import com.sujata.exceptions.DuplicateEmployeeIdException;
import com.sujata.exceptions.NoEmployeeFound;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public List<Employee> getAllEmployee()throws NoEmployeeFound {
		List<Employee> employeeList=employeeDao.getAllRecords();
		if(employeeList.size()==0)
			throw new NoEmployeeFound("No Employee Found");
		return employeeList;
	}

	@Override
	public boolean addNewEmployee(Employee employee) throws DuplicateEmployeeIdException {
		if(employeeDao.addRecord(employee)==0)
			throw new DuplicateEmployeeIdException("Employee with id "+employee.getEmpId()+" already exist!");
		return true;
	}

	@Override
	public Employee searchEmployeeById(int employeeId) throws NoEmployeeFound {
		Employee employee=employeeDao.getRecordById(employeeId);
		if(employee==null)
			throw new NoEmployeeFound("No Employee with id "+employeeId+" exist ");
		return employee;
	}

	@Override
	public EmployeePaySlip getEmployeePayslip(int employeeId) throws NoEmployeeFound {
		Employee employee=employeeDao.getRecordById(employeeId);
		if(employee==null)
			throw new NoEmployeeFound("No Employee with id "+employeeId+" exist ");
		
		EmployeePaySlip employeePaySlip=new EmployeePaySlip();
		employeePaySlip.setEmployee(employee);
		employeePaySlip.setHra(employee.getEmpSalary()*0.15);
		employeePaySlip.setDa(employee.getEmpSalary()*0.18);
		employeePaySlip.setPf(employee.getEmpSalary()*.12);
		employeePaySlip.setTotalSalary(employee.getEmpSalary()+employeePaySlip.getHra()+employeePaySlip.getDa()-employeePaySlip.getPf());
		
		return employeePaySlip;
	}

}
