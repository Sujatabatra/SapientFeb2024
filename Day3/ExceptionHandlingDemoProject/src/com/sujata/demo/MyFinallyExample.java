package com.sujata.demo;

import java.util.Scanner;

public class MyFinallyExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[]; //declaration
		int number1 = 0;
		int number2 = 0;
		int divide = 0;
		int location=0;
		try {
			System.out.println("Enter First Number : ");
			number1 = scanner.nextInt();
			System.out.println("Enter Second Number : ");
			number2 = scanner.nextInt();
			divide = number1 / number2;
			System.out.println("Result : " + divide);
			
			System.out.println("Enter Total Number of Elements : ");
			int total=scanner.nextInt();
			
			//memory area allocation to an array
			arr=new int[total];
			
			for(int index=0;index<total;index++) {
				System.out.println("Enter "+(index+1)+" element : ");
				arr[index]=scanner.nextInt();
			}
			
			System.out.println("Enter location in an array whose element you want to display");
			location=scanner.nextInt();
			
			System.out.println("Element at "+location+" position :"+arr[location]);
			
		}catch(NegativeArraySizeException ex) {
			System.out.println("You can't enter negative value in total number of elements in an array.");
		}
		
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(location+" position does not exist in an array ");
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
//		catch(RuntimeException ex) {
//			System.out.println("Something went wrong , please try again");
//		}
		finally {
			System.out.println("Hi I am finally block");
		}
		System.out.println("Good Bye!!");
//		double a=10.4;
//		double b=0.0;
//		double r=a/b;
//		System.out.println(r);
//		output: Infinity

	}

}
