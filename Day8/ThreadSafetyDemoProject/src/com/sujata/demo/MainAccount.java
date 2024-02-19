package com.sujata.demo;

public class MainAccount {

	public static void main(String[] args) {
		Account a001=new Account(1000);
		
		Thread akshika=new Thread(a001, "Akshita");
		Thread avtar=new Thread(a001, "Avtar");
		
		akshika.start();
		avtar.start();

	}

}
