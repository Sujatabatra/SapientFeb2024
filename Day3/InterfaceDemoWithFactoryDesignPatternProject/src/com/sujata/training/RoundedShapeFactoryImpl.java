package com.sujata.training;

import com.sujata.demo.Circle;
import com.sujata.demo.RoundedShape;
import com.sujata.demo.SemiCircle;

public class RoundedShapeFactoryImpl implements RoundedShapeFactory {

	@Override
	public RoundedShape getShape(char shapeName, double radius) {
		RoundedShape roundedShape;
		switch (shapeName) {
		case 'C': 
			roundedShape=new Circle(radius);
			break;
		case 'S':
			roundedShape=new SemiCircle(radius);
			break;
		default:
			roundedShape=null;
		}
		return roundedShape;
	}

}
