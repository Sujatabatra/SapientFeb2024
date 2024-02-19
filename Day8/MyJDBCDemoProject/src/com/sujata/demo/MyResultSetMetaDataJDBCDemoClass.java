package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MyResultSetMetaDataJDBCDemoClass {

	public static void main(String[] args) {
		Connection connection=null;
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DB
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sapientfeb2024", "root", "sujata");
			
//			2. Query
			
			Statement statement=connection.createStatement();
			ResultSet resultSet= statement.executeQuery("SELECT * FROM EMPLOYEE");
			
			ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
			
			int columnCount=resultSetMetaData.getColumnCount();
			System.out.println("Total Number of Columns : "+columnCount);
			for(int i=1;i<=columnCount;i++) {
				String colName=resultSetMetaData.getColumnName(i);
				System.out.println("Column Name : "+colName);
				
			}
//			3. Process Results
//			while(resultSet.next()) {
//				int empId=resultSet.getInt("EMPID");
//				String empName=resultSet.getString("NAME");
//				String empDesig=resultSet.getString("DESIGNATION");
//				String empDeptt=resultSet.getString("DEPARTMENT");
//				double empSalary=resultSet.getDouble("SALARY");
//				
//				System.out.println(empId+" "+empName+"  "+empDesig+"  "+empDeptt+"  "+empSalary);
//			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close Connection
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
