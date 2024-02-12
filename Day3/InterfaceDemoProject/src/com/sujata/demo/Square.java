package com.sujata.demo;

public class Square extends InputNumber implements Shape, ShowResult, NonRoundedShape {

	
	private int area,perimeter;
	
	public Square(int value) {
		super(value);
	}

	@Override
	public void perimeter() {
		perimeter=4*getValue();

	}

	@Override
	public void display() {
		System.out.println("Area of Square : "+area);
		System.out.println("Perimeter of Square :  "+perimeter);

	}

	@Override
	public void area() {
		area=getValue()*getValue();

	}

}
