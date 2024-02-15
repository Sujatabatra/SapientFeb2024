package com.sujata.byteio;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class MyBufferedOutputStream {

	public static void main(String[] args) {

		BufferedOutputStream bufferedOutputStream=null;
		try {
			bufferedOutputStream=new BufferedOutputStream(System.out);
			byte arr[]={'B','A','T','R','A'};
			bufferedOutputStream.write(arr);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bufferedOutputStream.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
