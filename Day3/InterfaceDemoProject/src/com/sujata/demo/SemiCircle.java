package com.sujata.demo;

public class SemiCircle implements RoundedShape {

	private double radius;
	private double area;
	private double circumference;
	
	public SemiCircle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		area=(PI*radius*radius)/2;
	}

	@Override
	public void display() {
		System.out.println("Area of Circle : "+area);
		System.out.println("Circumference of Circle : "+circumference);

	}

	@Override
	public void circumference() {
		circumference=(PI*radius)+(2*radius);

	}

}
