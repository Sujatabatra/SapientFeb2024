package com.sujata.training;

import com.sujata.demo.RoundedShape;

public interface RoundedShapeFactory {

	RoundedShape getShape(char shapeName,double radius);
}
