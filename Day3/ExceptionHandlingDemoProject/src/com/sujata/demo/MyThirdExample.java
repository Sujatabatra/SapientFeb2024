package com.sujata.demo;

import java.util.Scanner;

public class MyThirdExample {

	public static int operate(int number1,int number2) {
		int divide = number1 / number2;
		return divide;
	}
	public static void divide(int num1,int num2) {
//		try {
			int divide=operate(num1,num2);
			System.out.println("Result : " + divide);
//		}
//		catch(NullPointerException ex) {
//			System.out.println("Some exception");
//		}
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
			
			divide(number1,number2);
				
		} catch (ArithmeticException ex) {
				System.out.println("Undefined");
			
		}
		
		System.out.println("Good Bye!!");
//		double a=10.4;
//		double b=0.0;
//		double r=a/b;
//		System.out.println(r);
//		output: Infinity

	}

}
