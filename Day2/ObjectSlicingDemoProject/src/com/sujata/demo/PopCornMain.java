package com.sujata.demo;

public class PopCornMain {

	public static void main(String[] args) {

		PopCorn popCorn;
		
		popCorn=new ButterPopCorn();
		((ButterPopCorn)(popCorn)).setButterQuantity(10);
		popCorn.pop();

	}

}
