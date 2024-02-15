package com.sujata.serialize.caseone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectFileIODemoClass {

	public static void main(String[] args) {
		try (FileOutputStream fileOutputStream = new FileOutputStream("empData");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		) {

			Employee employee=new Employee(111, "AAAA", "Sales", 56000);
			objectOutputStream.writeObject(employee);

			System.out.println("File Created");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
