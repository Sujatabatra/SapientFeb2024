package com.sujata.serialize.casetwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFileIODemoClass {

	public static void main(String[] args)  {
		try(FileInputStream fileInputStream=new FileInputStream("empData");
				ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);){
			
			Person person=(Person)objectInputStream.readObject();
			
			System.out.println(person);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
