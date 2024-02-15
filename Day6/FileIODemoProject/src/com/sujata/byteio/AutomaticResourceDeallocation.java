package com.sujata.byteio;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AutomaticResourceDeallocation {

	public static void main(String[] args) {

		try (FileOutputStream fileOutputStream = new FileOutputStream("ByteDemoTwo");
				BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);) {

			byte arr[] = { 'S', 'U', 'J', 'A', 'T', 'A', '\n', 'D', 'E', 'L', 'H', 'I' };

			bufferedOutputStream.write(arr);

		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("File Created");
	}

}
