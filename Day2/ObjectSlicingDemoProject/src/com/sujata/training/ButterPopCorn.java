package com.sujata.training;

public class ButterPopCorn extends PopCorn {

	private int butterQuantity;

	public ButterPopCorn(int butterQuantity) {
		super();
		this.butterQuantity = butterQuantity;
	}

//	public void setButterQuantity(int butterQuantity) {
//		this.butterQuantity = butterQuantity;
//	}

	@Override
	public void pop() {
		System.out.println("Butter PopCorn is Popping with " + butterQuantity + " ounce of butter!");
	}
}
