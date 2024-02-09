package com.sujata.demo;

public enum Coffee {

	REGULAR(4,75.99,"Mocha"),MEDIUM(6,120.99,"Latte"),LARGE(8,150.99,"Java"),OVERWHELMING(10,160.99,"Americano");
	
	private int size;
	private double price;
	private String name;
	
	private Coffee(int size, double price, String name) {
		this.size = size;
		this.price = price;
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
	
	
	
	
}
