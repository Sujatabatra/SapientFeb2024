package com.sujata.training;

/*
 * 1. create setter if data is modifiable
 * 2. create getter if data is readable
 * 3. create getter and setter if data is both modifiable and readable
 */
public class Factorial {

	private int number,factorial;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}

	private void calculateFactorial() {
		factorial=1;
		int num=number;
		while(num>=1) {
			factorial*=num--;
		}
	}
		
//	

	
}
