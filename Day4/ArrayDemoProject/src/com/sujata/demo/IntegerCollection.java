package com.sujata.demo;

import com.sujata.excep.ElementNotFoundException;
import com.sujata.excep.PositionNotFoundException;

public class IntegerCollection {

	private int arr[];
	private int total;
	private int currentLocation;
	
	public IntegerCollection(int total) {
		super();
		this.total = total;
		arr=new int[this.total];
	}
	
	public void insertValue(int value,int position)throws PositionNotFoundException {
		if(position<0 || position >=total)
			throw new PositionNotFoundException(position+"position does not exist");
		else {
			arr[position]=value;
			currentLocation=position;
		}
	}
	
	public void display() {
		for(int index=0;index<=currentLocation;index++) {
			System.out.println("arr["+index+"]="+arr[index]);
		}
	}

	public int[] getArr() {
		return arr;
	}
	
	public int searchElement(int element)throws ElementNotFoundException {
		boolean flag=false;
		int location=0;
		for(int index=0;index<=currentLocation;index++) {
			if(arr[index]==element) {
				flag=true;
				location=index;
			}
		}
		if(flag==false)
			throw new ElementNotFoundException(element+" not found in collection");
		return location;
	}
	
}
