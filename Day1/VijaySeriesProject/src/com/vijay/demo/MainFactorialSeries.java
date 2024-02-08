package com.vijay.demo;

public class MainFactorialSeries {

	public static void main(String[] args) {
		FactorialSeries factorialSeries=new FactorialSeries();
		
		factorialSeries.setTotalNumber(5);
		System.out.println("Sum of Series : "+factorialSeries.getSumSeries());

	}

}
