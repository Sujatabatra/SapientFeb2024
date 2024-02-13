package com.sujata.demo;

import java.util.Scanner;

import com.sujata.excep.ElementNotFoundException;
import com.sujata.excep.PositionNotFoundException;

public class PersonCollectionMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Total number of persons in a collection : ");
		int total = scanner.nextInt();

		PersonCollection personCollection = new PersonCollection(total);
		try {
			for (int i = 0; i < total; i++) {
				System.out.println("Enter Person ID : ");
				int id = scanner.nextInt();
				System.out.println("Enter Person Name : ");
				String name = scanner.next();
				System.out.println("Enter Person Age");
				int age = scanner.nextInt();
				personCollection.insertValue(new Person(id, name, age), i);
			}

			personCollection.display();

			System.out.println("Enter following details for the person to be searched for");
			System.out.println("Enter Person ID : ");
			int id = scanner.nextInt();
			System.out.println("Enter Person Name : ");
			String name = scanner.next();
			System.out.println("Enter Person Age");
			int age = scanner.nextInt();
			Person person=new Person(id, name, age);
			int location=personCollection.searchElement(person);
			System.out.println("Person "+person+" found at location :"+location);

		} catch (PositionNotFoundException e) {
			System.out.println(e.getMessage());

		}catch (ElementNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
}
