package com.sujata.serialize.caseone;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee extends Person {

	private String deptt;
	private double salary;
	
	public Employee(int id, String name, String deptt, double salary) {
		super(id, name);
		this.deptt = deptt;
		this.salary = salary;
	}
	public Employee() {
		super();
	
	}
	public String getDeptt() {
		return deptt;
	}
	public void setDeptt(String deptt) {
		this.deptt = deptt;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ Employee ID ="+getId()+"Employee Name ="+getName()+"Department=" + deptt + ", salary=" + salary + "]";
	}

	private void writeObject(ObjectOutputStream objectOutputStream)throws NotSerializableException{
		throw new NotSerializableException();
	}
	
	private void readObject(ObjectInputStream objectInputStream)throws NotSerializableException{
		throw new NotSerializableException();
	}
	
}
