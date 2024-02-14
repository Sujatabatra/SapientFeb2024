package com.sujata.demo;

class MySpellCheckThreadClass extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"Spell Check i : "+i);
		}
		
		System.out.println("Good Bye from SpellCheck"+Thread.currentThread().getName());
	}
	
}

class MyGrammerCheckThreadClass extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"Grammer Check i : "+i);
		}
		
		System.out.println("Good Bye from GrammerCheck"+Thread.currentThread().getName());
	}
	
}

class MyFormatingThreadClass extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"Formating i : "+i);
		}
		
		System.out.println("Good Bye from Formating"+Thread.currentThread().getName());
	}
	
}
public class MySecondThreadDemoMain {

	public static void main(String[] args) {
		
		MySpellCheckThreadClass thread1=new MySpellCheckThreadClass();
		MyGrammerCheckThreadClass thread2=new MyGrammerCheckThreadClass();
		MyFormatingThreadClass thread3=new MyFormatingThreadClass();
		
		Thread.currentThread().setName("Word");
		thread1.setName("Spell Check");
		thread2.setName("Grammer Check");
		thread3.setName("Formatting");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i => "+i);
		}
		
		System.out.println("Good Bye from "+Thread.currentThread().getName());

	}

}
