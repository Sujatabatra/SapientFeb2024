package com.sujata.demo;

public class Student {

	private int rollNo;
	private String name;

	public Student() {
//		this(0,"AA");
		System.out.println("Hi I am Student Constructor ");
	}
	
	public Student(int rollNo, String name) {
		
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void inputStudentDetails(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	public void showStudentDetails() {
		System.out.println("Roll No. : "+rollNo);
		System.out.println("Name : "+name);
	}
}
