package com.sujata.training;

/*
 * Constructor
 * 1. Constructors are used to initialize the Object while declaring them.
 * 2. Constructor name is same as that of our class name
 * 3. Constructor cannot return any value not even void
 * 4. Constructor can be argumented and can be non argumented
 * 5. If my class is constructor challenged(No Constructor), 
 * Compiler will create one zero argument constructor for us 
 * and we call it as default constructor, 
 * whose purpose is to initialize instance variable with default intial values.
 * 6. Constructor can be in any scope i.e private and public
 */
public class Complex {

	private int real, imagenary;

//	public Complex() {
//		real=10;
//		imagenary=5;
//	}
//Constructor Overloading
	public Complex(int real, int imagenary) {
		this.real = real;
		this.imagenary = imagenary;
	}

	private Complex() {

	}

	public Complex(int real) {
		this.real = real;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImagenary() {
		return imagenary;
	}

	public void setImagenary(int imagenary) {
		this.imagenary = imagenary;
	}

	public void display() {
		System.out.print(real);
		if (imagenary > 0)
			System.out.println("+" + imagenary + "i");
		else if (imagenary < 0)
			System.out.println(imagenary + "i");

	}

	public void input(int real, int imagenary) {
		setReal(real);
		setImagenary(imagenary);
	}
	
	public Complex sum(Complex c2) {
		Complex sum=new Complex();
		sum.real=this.real+c2.real;
		sum.imagenary=this.imagenary+c2.imagenary;
		return sum;
	}
}
