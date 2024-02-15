package com.sujata.serialize.casetwo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectFileIODemoClass {

	public static void main(String[] args) {
		try (FileOutputStream fileOutputStream = new FileOutputStream("empData");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		) {

			Person person=new Person(111, "AAA", new Address(1, "Street A", "Delhi", "Delhi"));
			objectOutputStream.writeObject(person);

			System.out.println("File Created");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
