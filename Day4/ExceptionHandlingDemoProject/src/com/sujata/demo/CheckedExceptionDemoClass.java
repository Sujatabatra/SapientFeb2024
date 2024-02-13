package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckedExceptionDemoClass {

	public static void openFile(String fileName) {
		try {
		FileInputStream fileInputStream=new FileInputStream(fileName);
		System.out.println("File exist");
		}
		catch(FileNotFoundException ex) {
			System.out.println(fileName+" named file don't exist");
		}
		
		}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
		System.out.println("Enter File Name : ");
		String fileName=scanner.next();
		
		openFile(fileName);
		
		System.out.println("Enter your age ");
		int age=scanner.nextInt();
		System.out.println("Entered Age : "+age);
		}
		catch (InputMismatchException e) {
			System.out.println("You can only enter numeric value in age");
		}
	}

}
