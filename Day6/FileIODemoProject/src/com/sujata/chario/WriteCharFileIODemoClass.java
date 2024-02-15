package com.sujata.chario;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCharFileIODemoClass {

	public static void main(String[] args) {
		
		try(FileWriter fileWriter=new FileWriter("DemoChar")){
			
			String value="Sujata Batra";
			fileWriter.write(value);
			System.out.println("File Created!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
