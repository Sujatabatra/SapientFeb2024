package com.sujata.demo;

import java.util.Scanner;

public class MyFinallyExampleTwo {

	public static void divide(int num1,int num2) {
		try {
			int div=num1/num2;
			System.out.println("Result : "+div);
			System.out.println("Good Bye from method try block");
			return;
		}
		catch(ArithmeticException ex) {
			System.out.println("undefined");
		}
		finally {
			System.out.println("Hi I am finally");
		}
		System.out.println("Good Bye from method");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		
		try {
			System.out.println("Enter First Number : ");
			number1 = scanner.nextInt();
			System.out.println("Enter Second Number : ");
			number2 = scanner.nextInt();
			divide(number1 , number2);
		}
		catch(RuntimeException ex) {
			System.out.println("Something went wrong , please try again");
		}
		
	}

}
