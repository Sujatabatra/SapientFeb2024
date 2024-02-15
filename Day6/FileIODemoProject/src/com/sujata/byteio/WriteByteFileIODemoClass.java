package com.sujata.byteio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteFileIODemoClass {

	public static void main(String[] args) {
//		File file=new File("ByteDemo");
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("ByteDemo");

			byte arr[] = { 'S', 'U', 'J', 'A', 'T', 'A', '\n', 'D', 'E', 'L', 'H', 'I' };

			fileOutputStream.write(arr);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("File Created");
	}

}
