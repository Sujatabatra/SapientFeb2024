package com.sujata.demo;

public class MyMainClass {

	public static void main(String[] args) {
		Student student=new Student();
		student.inputStudentDetails(1, "AAAA");
		student.showStudentDetails();
		System.out.println("===============");
		
		Marks marks=new Marks();
		marks.inputStudentsDetails(101, "XYZ", 90, 78, 90);
		marks.showStudentDetails();

		System.out.println("===============");
		
		Grade grade=new Grade();
		grade.inputStudentsDetails(111, "Amit", 89, 90, 67);
		grade.showStudentDetails();
		
	}

}
