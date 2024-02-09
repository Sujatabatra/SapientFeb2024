package training.sujata.demo;

import com.sujata.demo.Student;

public class MyMain {

	public static void main(String[] args) {
		Grade grade=new Grade();
		grade.inputStudentsDetailsWithMarks(101, "AAAA", 90, 67, 56);
		grade.showAllDetails();
		
		System.out.println("====================");
		
		Student student=new Student();
		student.setRollNo(111);
		student.setName("ABC");
		student.showStudentDetails();

	}

}
