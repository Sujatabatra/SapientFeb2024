package com.sujata.byteio;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteFileIODemoClassTwo {

	public static void main(String[] args) {
//		File file=new File("ByteDemo");
		FileOutputStream fileOutputStream = null;
		BufferedOutputStream bufferedOutputStream=null;
		try {
			fileOutputStream = new FileOutputStream("ByteDemoTwo");
			bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
			

			byte arr[] = { 'S', 'U', 'J', 'A', 'T', 'A', '\n', 'D', 'E', 'L', 'H', 'I' };

			bufferedOutputStream.write(arr);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedOutputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("File Created");
	}

}
