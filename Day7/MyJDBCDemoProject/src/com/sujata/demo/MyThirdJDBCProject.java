package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyThirdJDBCProject {

	public static void main(String[] args) {
		Connection connection=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DB
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sapientfeb2024", "root", "sujata");
			
//			2. Query
			
			PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
			
			System.out.println("Enter Employee ID : ");
			int eId=scanner.nextInt();
			System.out.println("Enter Employee Name : ");
			String eName=scanner.next();
			System.out.println("Enter Employee Designation : ");
			String eDesig=scanner.next();
			System.out.println("Enter Employee Department : ");
			String eDeptt=scanner.next();
			System.out.println("Enter Employee Salary : ");
			double eSal=scanner.nextDouble();
			
			
			preparedStatement.setInt(1, eId);
			preparedStatement.setString(2, eName);
			preparedStatement.setString(3, eDesig);
			preparedStatement.setString(4, eDeptt);
			preparedStatement.setDouble(5, eSal);
			String query="INSERT INTO EMPLOYEE VALUES("+eId+",'"+eName+"','"+eDesig+"','"+eDeptt+"',"+eSal+")";
			
			int rows=preparedStatement.executeUpdate();
			
//			3. Process Results
			if(rows>0)
				System.out.println("Employee Added!");
			
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
