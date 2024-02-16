package com.sujata.entity;

public class EmployeePaySlip {

	private Employee employee;
	private double hra;
	private double da;
	private double pf;
	private double totalSalary;
	
	public EmployeePaySlip() {
		
	}

	public EmployeePaySlip(Employee employee, double hra, double da, double pf, double totalSalary) {
		super();
		this.employee = employee;
		this.hra = hra;
		this.da = da;
		this.pf = pf;
		this.totalSalary = totalSalary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	@Override
	public String toString() {
		return "EmployeePaySlip [employee=" + employee + ", hra=" + hra + ", da=" + da + ", pf=" + pf + ", totalSalary="
				+ totalSalary + "]";
	}
	
	
}
