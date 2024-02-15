package com.sujata.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharFileIODemoClass {

	public static void main(String[] args) {
		
		try(FileReader fileReader=new FileReader("DemoChar");){
			
			int ch;
			while((ch=fileReader.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
