package com.sujata.demo;

class BaseClass {

	void show() {
		System.out.println(Thread.currentThread().getName() + " calls show method!!");
	}
}

class DerivedClass extends BaseClass implements Runnable {

	@Override
	void show() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " i : " + i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

	@Override
	public void run() {
		show();

	}
}

public class MyThirdThreadDemoMain {

	public static void main(String[] args) {

		DerivedClass threadJob = new DerivedClass();

		Thread thread1 = new Thread(threadJob);

		thread1.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " i : " + i);
		}
		
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

}
