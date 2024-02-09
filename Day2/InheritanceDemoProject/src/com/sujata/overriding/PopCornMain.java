package com.sujata.overriding;

public class PopCornMain {

	public static void main(String[] args) {
		//Reference Variable
		PopCorn popCorn;
		
		popCorn=new ButterPopCorn();
		popCorn.pop();  
		
		
		popCorn=new CheesePopCorn();
		popCorn.pop();

	}

}
