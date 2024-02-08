package com.sujata.modular;

public class ModularFactorial {

	static int number,factorial;
	
	static void inputNumber(int num) {
		number=num;
	}
	
	static void displayOutput() {
//		factorial=80;//Logical Error
		System.out.println("Factorial : "+factorial);
	}
	
	static void calculateFactorial() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
	}
//	static void reinitializeFactorial() {
//		factorial=0;
//	}
	
	public static void main(String[] args) {
		inputNumber(4);
		number=-2; //Logical Error
		calculateFactorial();
//		reinitializeFactorial();  //Logical Error
		displayOutput();

	}

}
