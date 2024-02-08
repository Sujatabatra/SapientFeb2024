package com.sujata.demo;

import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Shape shape=new Shape();
		
		while(true) {
		System.out.println("Enter Shape 1 for rectangle, 2 for square, 3 for Circle ,4 for Exit ");
		int choice=scanner.nextInt();
		switch (choice) {
		case 1: 
			System.out.println("Enter length of rectangle ");
			int l=scanner.nextInt();
			System.out.println("Enter Breadth of Rectangle ");
			int b=scanner.nextInt();
			System.out.println("Area of Rectangle : "+shape.area(l,b));
			break;
		case 2:
			System.out.println("Enter side of square ");
			int s=scanner.nextInt();
			System.out.println("Area of Square : "+shape.area(s));
			break;
		case 3:
			System.out.println("");
			break;
		case 4:
			System.out.println("Thanks for using our system");
			System.exit(0);			
		default:
			System.out.println("Invalid Choice");
		}
		
		}

	}

}
