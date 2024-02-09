package com.sujata.demo;


class ThirdStaticDemo{
	
	{
		System.out.println("Hi from Instance Block");
	}
	
	static {
		System.out.println("Hi from static Block");
	}
	
	public ThirdStaticDemo() {
		System.out.println("Hi from constructor");
	}
	
}
public class MyThirdStaticDemoClass {

	public static void main(String[] args) {
		
		ThirdStaticDemo obj1=new ThirdStaticDemo();
		
		ThirdStaticDemo obj2=new ThirdStaticDemo();
		

	}

}
