package com.sujata.oop;

public class FactorialMain {

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		factorial.setNumber(5);
//		factorial.factorial
		System.out.println("Factorial of "+factorial.getNumber()+" = "+factorial.getFactorial());

	}

}
