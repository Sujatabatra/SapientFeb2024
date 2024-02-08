package com.sujata.training;

public class MainComplex {


	
	public static void main(String[] args) {
		//ClassName ObjectName=new ClassName();
//		ClassName ObjectName=new Constructor;
//		Complex c1=new Complex();
//		c1.display();
		System.out.println(" ");
		Complex c2=new Complex(5);
		c2.display();
		System.out.println(" ");
		Complex c3=new Complex(7, -4);
		c3.display();
		System.out.println("Sum of Above Complex Numbers : ");
		Complex c4=c2.sum(c3);
		c4.display();
	}

}
