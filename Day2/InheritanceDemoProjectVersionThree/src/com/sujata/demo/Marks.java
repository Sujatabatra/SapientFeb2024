package com.sujata.demo;

import com.sujata.demo.Student;

public class Marks extends Student {
	
	private int marks1,marks2,marks3;

	public Marks() {
		/*
		 * default call goes to parent class default constructor
		 */
		super();//implicit call is super(), thats why optional
		System.out.println("Hi I am Marks Constructor ");
	}
	
	
	public Marks(int rollNo, String name, int marks1, int marks2, int marks3) {
		super(rollNo, name);  //explicit call to argumented constructor
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}



	public int getMarks1() {
		return marks1;
	}


	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	
	public void inputStudentsDetails(int rollNo,String name,int marks1,int marks2,int marks3) {
		inputStudentDetails(rollNo, name);
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
		}
	
	@Override
	public void showStudentDetails() {
		super.showStudentDetails();
		System.out.println("Marks 1 :"+marks1);
		System.out.println("Marks 2 :"+marks2);
		System.out.println("Marks 3 :"+marks3);
	}

}
