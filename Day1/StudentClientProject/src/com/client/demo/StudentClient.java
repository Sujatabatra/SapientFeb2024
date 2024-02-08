package com.client.demo;

import com.sujata.demo.Student;

public class StudentClient {

	public static void main(String[] args) {
		Student student=new Student();
		student.setRollNo(101);
		student.setName("Sanchit");
		student.showStudentDetails();
		
		System.out.println("================");
		
		Marks marksObject=new Marks();
		marksObject.inputStudentsDetailsWithMarks(111, "AAAA", 78, 89, 98);
		marksObject.displayStudentDetailsWithMarks();

	}

}
