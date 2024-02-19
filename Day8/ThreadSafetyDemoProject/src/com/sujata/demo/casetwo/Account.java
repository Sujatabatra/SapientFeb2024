package com.sujata.demo.casetwo;

public class Account implements Runnable {

	private static int balance;
	
	public Account(int balance) {
		super();
		Account.balance = balance;
	}

	@Override
	public void run() {
		withdrawl();

	}
	
	/*
	 * static Method : Class Level Locking
	 */
	synchronized static public void withdrawl() {
		if(balance>=800) {
			System.out.println(Thread.currentThread().getName()+" you have sufficient balance to withdraw , your balance is Rs."+balance);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			balance-=800;
			System.out.println(Thread.currentThread().getName()+" you balance after withdrawl is Rs."+balance);
		}
		else {
			System.out.println(Thread.currentThread().getName()+" you have insufficient funds to withdraw , your balance is Rs."+balance);
		}
			
	}

}
