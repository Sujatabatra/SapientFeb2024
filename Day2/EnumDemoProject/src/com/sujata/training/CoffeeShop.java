package com.sujata.training;

import com.sujata.demo.Coffee;

import static com.sujata.demo.Coffee.*;

public class CoffeeShop {

	public static void main(String[] args) {
		Coffee coffee=OVERWHELMING;
		System.out.println("Kindly take "+coffee.getSize()+" ounces of "+coffee.getName()+" by paying Rs."+coffee.getPrice());

	}

}
