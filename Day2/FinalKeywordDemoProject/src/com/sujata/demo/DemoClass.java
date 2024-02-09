package com.sujata.demo;

/*
 * Final : variable, method, class
 * if variable is final, we can't change the value of final variable , we can only assign it once
 */
public class DemoClass {

	private int value1;
	private final int value2=33;
	private final int value3;
	
	public DemoClass(int value3) {
		super();
		this.value3 = value3;
	}

	public void assignValuesOne(int value1) {
		this.value1 = value1;
//		this.value2 = value2;
	}
	
	public void displayValues() {
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
	}
	
}
