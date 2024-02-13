package com.sujata.demo;

import java.util.Scanner;

import com.sujata.excep.ElementNotFoundException;
import com.sujata.excep.PositionNotFoundException;

public class IntegerCollectionMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Total number of elements in a collection : ");
		int total = scanner.nextInt();

		IntegerCollection integerCollection = new IntegerCollection(total);
		try {
			for (int i = 0; i <total; i++) {
				System.out.println("Enter Value for Position " + i);
				int value = scanner.nextInt();
				integerCollection.insertValue(value, i);
			}
			
			integerCollection.display();
			
			System.out.println("Enter Element to be searched for : ");
			int element=scanner.nextInt();
			int location=integerCollection.searchElement(element);
			System.out.println("Element "+element+" found at location :"+location);
			
		} catch (PositionNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ElementNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
