package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemoClass {

	public static void openFile(String fileName) throws FileNotFoundException {

		FileInputStream fileInputStream=new FileInputStream(fileName);
		System.out.println("File exist");
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String fileName=null;
		try {
		System.out.println("Enter File Name : ");
		fileName=scanner.next();
		
		openFile(fileName);
		
		System.out.println("Enter your age ");
		int age=scanner.nextInt();
		System.out.println("Entered Age : "+age);
		}
		catch (InputMismatchException e) {
			System.out.println("You can only enter numeric value in age");
		} catch (FileNotFoundException e) {
			System.out.println(fileName+" named file don't exist");
		}
	}

}
