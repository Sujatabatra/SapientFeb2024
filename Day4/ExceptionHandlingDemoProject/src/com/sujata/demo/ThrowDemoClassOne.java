package com.sujata.demo;

import java.util.Scanner;

public class ThrowDemoClassOne {

	public static void divide(int number1,int number2) {
		if(number2==0)
			throw new ArithmeticException("Division By Zero for integers is not defined in Java!");
		else {
			int div=number1/number2;
			System.out.println("Result : "+div);
		}
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter first Number : ");
		int number1=scanner.nextInt();
		System.out.println("Enter second Number : ");
		int number2=scanner.nextInt();
		try {
		divide(number1,number2);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
