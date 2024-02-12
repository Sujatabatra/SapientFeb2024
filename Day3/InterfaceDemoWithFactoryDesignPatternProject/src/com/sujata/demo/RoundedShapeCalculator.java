package com.sujata.demo;

public class RoundedShapeCalculator {

	private RoundedShape roundedShape;
	
	
	public void setRoundedShape(RoundedShape roundedShape) {
		this.roundedShape = roundedShape;
	}
	public void calculateArea() {
		roundedShape.area();
		roundedShape.display();
	}
	public void calculateCircumference() {
		roundedShape.circumference();
		roundedShape.display();
	}
	
	public void calculateAll() {
		roundedShape.area();
		roundedShape.circumference();
		roundedShape.display();
	}
}

