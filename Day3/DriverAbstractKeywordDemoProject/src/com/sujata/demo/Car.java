package com.sujata.demo;
/*
 * 1. Abstract can be the method of a class
 * 2. Even if a single method in the class is abstract 
 * then its mandatory to marks class also an abstract.
 * 3. We can't instantiate Abstract class.
 * 4. abstract is like signing a contract with child classes,
 * to give the implementation of certain methods. 
 * 5. if child class failed to give the implementation of all methods,
 * then child class need to mark itself abstract(reason point 2)
 * 6. we declare abstract method but don't define it not even with blank body.
 */
abstract public class Car {

	private String model,color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
	
	abstract public void engine();
}
