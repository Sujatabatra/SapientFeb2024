package com.sujata.demo;

public class Circle implements RoundedShape {

	private double radius;
	private double area;
	private double circumference;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		area=PI*radius*radius;
	}

	@Override
	public void display() {
		System.out.println("Area of Circle : "+area);
		System.out.println("Circumference of Circle : "+circumference);

	}

	@Override
	public void circumference() {
		circumference=2*PI*radius;

	}

}
