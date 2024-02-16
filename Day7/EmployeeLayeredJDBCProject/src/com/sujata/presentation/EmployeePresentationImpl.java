package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePaySlip;
import com.sujata.exceptions.DuplicateEmployeeIdException;
import com.sujata.exceptions.NoEmployeeFound;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("==============================");
		System.out.println("Employee Management System");
		System.out.println("==============================");
		System.out.println("1. Show All Employees");
		System.out.println("2. Add New Employee");
		System.out.println("3. Search Employee By ID");
		System.out.println("4. Generate PaySlip");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1: 
			try {
				List<Employee> employeeList=employeeService.getAllEmployee();
				for(Employee employee:employeeList) {
					System.out.println(employee);
				}
			} catch (NoEmployeeFound e) {
				System.out.println("No Employee Added so far...");
			}
			break;
		case 2:
			try {
			Employee newEmployee=new Employee();
			System.out.println("Enter Employee ID : ");
			newEmployee.setEmpId(scanner.nextInt());
			System.out.println("Enter Employee Name : ");
			newEmployee.setEmpName(scanner.next());
			System.out.println("Enter Employee Designation : ");
			newEmployee.setEmpDesignation(scanner.next());
			System.out.println("Enter Employee Department : ");
			newEmployee.setEmpDepartment(scanner.next());
			System.out.println("Enter Employee Salary : ");
			newEmployee.setEmpSalary(scanner.nextDouble());
			if(employeeService.addNewEmployee(newEmployee))
				System.out.println("New Employee with ID "+newEmployee.getEmpId()+" Added!");
			}
			catch (DuplicateEmployeeIdException e) {
				System.out.println(e.getMessage());
			}
			catch (Exception e) {
				System.out.println("Something went wrong please try again!");
			}
			break;
		case 3:
			try {
			System.out.println("Enter Employee ID : ");
			int employeeId=scanner.nextInt();
			Employee employee=employeeService.searchEmployeeById(employeeId);
			System.out.println(employee);
			}
			catch(NoEmployeeFound e) {
				System.out.println(e.getMessage());
			}
			catch (Exception e) {
				System.out.println("Something went wrong please try again!");
			}
			break;
		case 4:
			try {
				System.out.println("Enter Employee ID : ");
				int employeeId=scanner.nextInt();
				EmployeePaySlip employeePayslip=employeeService.getEmployeePayslip(employeeId);
				System.out.println(employeePayslip);
				}
				catch(NoEmployeeFound e) {
					System.out.println(e.getMessage());
				}
				catch (Exception e) {
					System.out.println("Something went wrong please try again!");
				}
				break;
		case 5:
			System.out.println("Thanks for using Sapient QE Jan 2024 Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}
