package com.vijay.demo;

import com.sujata.training.Factorial;

public class FactorialSeries {

	private int totalNumber;
	private double sumSeries;
	
	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}
	public double getSumSeries() {
		calculateSumSeries();
		return sumSeries;
	}
	private void calculateSumSeries() {
		Factorial factorial=new Factorial();
		for(int count=1;count<=totalNumber;count++) {
			factorial.setNumber(count);
			sumSeries=sumSeries+factorial.getFactorial()/count;
		}
	}
	
	
}
