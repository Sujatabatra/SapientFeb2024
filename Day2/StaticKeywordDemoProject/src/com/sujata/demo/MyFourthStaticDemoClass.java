package com.sujata.demo;


class FourthStaticDemo{
	
	{
		System.out.println("Hi from Instance Block");
	}
	
	static {
		System.out.println("Hi from static Block");
	}
	
	public FourthStaticDemo() {
		System.out.println("Hi from constructor");
	}
	
}
class DerivedFourthStaticDemo extends FourthStaticDemo{
	{
		System.out.println("Hi from Derived Instance Block");
	}
	
	static {
		System.out.println("Hi from Derived static Block");
	}
	
	public DerivedFourthStaticDemo() {
		System.out.println("Hi from Derived constructor");
	}
}
public class MyFourthStaticDemoClass {

	public static void main(String[] args) {
	
		FourthStaticDemo obj=new FourthStaticDemo();
		
		DerivedFourthStaticDemo obj1=new DerivedFourthStaticDemo();
		

	}

}
