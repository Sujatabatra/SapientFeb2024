package com.sujata.demo;

import java.util.Scanner;

public class MyFirstExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number1 = 0;
		int number2 = 0;
		int divide = 0;
		try {
			System.out.println("Enter First Number : ");
			number1 = scanner.nextInt();
			System.out.println("Enter Second Number : ");
			number2 = scanner.nextInt();

			divide = number1 / number2;

			System.out.println("Result : " + divide);
		} catch (NullPointerException ex) {
			System.out.println("OHHO Exception Arise!");
		} catch (ArithmeticException ex) {
			try {
				System.out.println("Kindly Enter any integer other then zero in number2");
				number2 = scanner.nextInt();
				divide = number1 / number2;
				System.out.println("result : " + divide);
			} catch (ArithmeticException exp) {
				System.out.println("Undefined");
			}
		}
		System.out.println("Good Bye!!");
//		double a=10.4;
//		double b=0.0;
//		double r=a/b;
//		System.out.println(r);
//		output: Infinity

	}

}
