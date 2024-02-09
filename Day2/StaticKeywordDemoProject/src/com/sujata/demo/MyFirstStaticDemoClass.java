package com.sujata.demo;

class FirstStaticDemo{
	
	static int value1;
	int value2;
	
}
public class MyFirstStaticDemoClass {

	public static void main(String[] args) {
		FirstStaticDemo.value1=10;
		
		FirstStaticDemo obj1=new FirstStaticDemo();
		
		FirstStaticDemo obj2=new FirstStaticDemo();
		
		System.out.println("obj2 value2 : "+obj1.value2);
		

	}

}
