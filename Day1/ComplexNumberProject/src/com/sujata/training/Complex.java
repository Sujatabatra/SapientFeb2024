package com.sujata.training;

public class Complex {

	private int real,imagenary;

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
		if(imagenary>0)
			System.out.println("+"+imagenary+"i");
		else if(imagenary<0)
			System.out.println(imagenary+"i");
		
	}
	public void input(int real,int imagenary) {
		setReal(real);
		setImagenary(imagenary);
	}
}
