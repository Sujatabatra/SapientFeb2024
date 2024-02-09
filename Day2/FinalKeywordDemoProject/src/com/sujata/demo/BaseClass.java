package com.sujata.demo;

class BaseClass {

	final public void methodOne() {
		System.out.println("MethodOne");
	}
	
	public void methodTwo() {
		System.out.println("MethodTwo");
	}
	
	public void methodThree() {
		System.out.println("MethodThree");
	}
}
class DerivedClass extends BaseClass{
	
//	@Override
//	public void methodOne() {
//		System.out.println("MethodOne");
//	}
	
	@Override
	public void methodTwo() {
		System.out.println("MethodTwo from Derived");
	}
}