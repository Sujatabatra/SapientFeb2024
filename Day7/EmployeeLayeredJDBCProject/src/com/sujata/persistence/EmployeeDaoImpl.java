package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sujata.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllRecords() {
		List<Employee> employeeList = new ArrayList<>();

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sapientfeb2024", "root",
				"sujata");) {

			Class.forName("com.mysql.cj.jdbc.Driver");

			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE");
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int empId = resultSet.getInt("EMPID");
				String empName = resultSet.getString("NAME");
				String empDesig = resultSet.getString("DESIGNATION");
				String empDeptt = resultSet.getString("DEPARTMENT");
				double empSalary = resultSet.getDouble("SALARY");

				employeeList.add(new Employee(empId, empName, empDesig, empDeptt, empSalary));

			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return employeeList;
	}

	@Override
	public int addRecord(Employee employee) {
		int rows = 0;
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sapientfeb2024", "root",
				"sujata");) {

			Class.forName("com.mysql.cj.jdbc.Driver");

			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
			preparedStatement.setInt(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpName());
			preparedStatement.setString(3, employee.getEmpDesignation());
			preparedStatement.setString(4, employee.getEmpDepartment());
			preparedStatement.setDouble(5, employee.getEmpSalary());

			rows = preparedStatement.executeUpdate();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			return rows;
		}

		return rows;
	}

	@Override
	public Employee getRecordById(int id) {
		Employee employee = null;

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sapientfeb2024", "root",
				"sujata");) {

			Class.forName("com.mysql.cj.jdbc.Driver");

			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE EMPID=?");
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int empId = resultSet.getInt("EMPID");
				String empName = resultSet.getString("NAME");
				String empDesig = resultSet.getString("DESIGNATION");
				String empDeptt = resultSet.getString("DEPARTMENT");
				double empSalary = resultSet.getDouble("SALARY");

				employee=new Employee(empId, empName, empDesig, empDeptt, empSalary);

			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return employee;
	}

}
