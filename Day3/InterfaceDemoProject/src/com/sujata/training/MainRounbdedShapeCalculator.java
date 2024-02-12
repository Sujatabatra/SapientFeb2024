package com.sujata.training;

import com.sujata.demo.Circle;
import com.sujata.demo.RoundedShapeCalculator;

public class MainRounbdedShapeCalculator {

	public static void main(String[] args) {
		
		RoundedShapeCalculator roundedShapeCalculator=new RoundedShapeCalculator();
		
		roundedShapeCalculator.setRoundedShape(new Circle(6.2));
		roundedShapeCalculator.calculateAll();

	}

}
