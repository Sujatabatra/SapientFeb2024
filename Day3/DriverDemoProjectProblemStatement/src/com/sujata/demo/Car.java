package com.sujata.demo;

public class Car {

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
	
	public void engine() {
		System.out.println("No Engine Right now!");
	}
}
