package com.sujata.misc;

class IntegerInput {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

class StringInput {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

class DoubleInput {
	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}

class EmployeeInput {
	private Employee value;

	public Employee getValue() {
		return value;
	}

	public void setValue(Employee value) {
		this.value = value;
	}

}

class GenericInput<E>{
	private E value;

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}
	
}
public class MyFirstExampleMain {

	public static void main(String[] args) {
		GenericInput<Integer> genericInput=new GenericInput<>();
		genericInput.setValue(10);
		System.out.println(genericInput.getValue());
		
		
		GenericInput<String> genericInput2=new GenericInput<>();
		genericInput2.setValue("Sujata");
		System.out.println(genericInput2.getValue());
		
		GenericInput<Employee> genericInput3=new GenericInput<>();
		genericInput3.setValue(new Employee(101, "ABC"));
		System.out.println(genericInput3.getValue());

	}

}
