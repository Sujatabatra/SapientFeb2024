package com.sujata.demo;

class MyFirstThreadClass extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
	
	public void show() {
		System.out.println("Calling show from "+Thread.currentThread().getName());
	}
}
public class MyFirstThreadDemoMain {

	public static void main(String[] args) {
		
		//New Born
		MyFirstThreadClass thread1=new MyFirstThreadClass();
		
		thread1.start();  //Ready or Running
		/*
		 * two threads in memory , main and Thread-0 (Both are fighting for CPU)
		 * main thread will execute main body
		 * Thread-0 will execute run() body
		 */
		
//		thread1.run();
		thread1.show();
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i => "+i);
		}
		
		System.out.println("Good Bye from "+Thread.currentThread().getName());

	}

}
