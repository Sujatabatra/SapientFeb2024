package com.sujata.demo;

public class Shape {
	
	private double area; 
	
	public double area(int length,int breadth) {
		area =length*breadth;
		return area;
	}
	
	public double area(int side) {
		area =side*side;
		return area;
	}
	
	public double area(double radius) {
		area =3.14*radius*radius;
		return area;
	}

	
	
	
	
	
	
	
	
}
