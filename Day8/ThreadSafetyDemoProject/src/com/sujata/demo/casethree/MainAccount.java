package com.sujata.demo.casethree;

public class MainAccount {

	public static void main(String[] args) {
//		Account a001=new Account(1000);
		
		Thread akshita=new Thread(new Account(1000), "Akshita");
		Thread avtar=new Thread(new Account(1000), "Avtar");
		
		akshita.start();
		avtar.start();

	}

}
