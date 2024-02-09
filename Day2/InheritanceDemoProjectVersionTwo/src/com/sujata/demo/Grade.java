package com.sujata.demo;

public class Grade extends Marks {

	private double percentage;
	private String grade;
	
	public Grade() {
		/*
		 * default call goes to parent class default constructor
		 */
		super(0, 0, 0);  //explicit call to available parent class constructor
		System.out.println("Hi I am Grade Constructor ");
	}
	public double getPercentage() {
		percentage=(super.getMarks1()+getMarks2()+getMarks3())/3;
		return percentage;
	}
	
	public String getGrade() {
		if(getPercentage()>75)
			grade="A Grade";
		else
			grade="B Grade";
		return grade;
	}
	
	@Override
	public void showStudentDetails() {
		super.showStudentDetails();
		System.out.println("Percentage : "+getPercentage());
		System.out.println("Grade : "+getGrade());
	}
	
}
