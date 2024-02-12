package com.sujata.training;

import com.sujata.demo.Circle;
import com.sujata.demo.RoundedShape;
import com.sujata.demo.RoundedShapeCalculator;

public class MainRounbdedShapeCalculator {

	public static void main(String[] args) {
		
		RoundedShapeCalculator roundedShapeCalculator=new RoundedShapeCalculator();
		RoundedShapeFactory roundedShapeFactory=new RoundedShapeFactoryImpl();
		
		RoundedShape roundedShape=roundedShapeFactory.getShape('C', 6.7);
		if(roundedShape!=null) {
		roundedShapeCalculator.setRoundedShape(roundedShape);
		roundedShapeCalculator.calculateAll();
		}
		else {
			System.out.println("No Such Shape exist!");
		}

	}

}
