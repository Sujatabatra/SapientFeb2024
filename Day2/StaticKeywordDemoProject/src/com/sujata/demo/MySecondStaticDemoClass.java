package com.sujata.demo;

class SecondStaticDemo{
	
	private static int value1;
	//instance variables
	private int value2;
	
	static public int getValue1() {
		return value1;
	}
	public static void setValue1(int value1) {
		SecondStaticDemo.value1 = value1;
	}
	
	public  int getValue2() {
		return value2;
	}
	public void setValue2(int value2) {
		this.value2 = value2;
	}
	
	
}
public class MySecondStaticDemoClass {

	public static void main(String[] args) {
//		SecondStaticDemo.value1=10;
		
		SecondStaticDemo.setValue1(10);
		SecondStaticDemo obj1=new SecondStaticDemo();
		
		obj1.setValue1(10);
		
		SecondStaticDemo obj2=new SecondStaticDemo();
		
		
		

	}

}
