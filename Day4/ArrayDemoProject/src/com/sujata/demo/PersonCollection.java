package com.sujata.demo;

import com.sujata.excep.ElementNotFoundException;
import com.sujata.excep.PositionNotFoundException;

public class PersonCollection {

	private Person arr[];
	private int total;
	private int currentLocation;
	
	public PersonCollection(int total) {
		super();
		this.total = total;
		arr=new Person[this.total];
	}
	
	public void insertValue(Person person,int position)throws PositionNotFoundException {
		if(position<0 || position >=total)
			throw new PositionNotFoundException(position+"position does not exist");
		else {
//			arr[position]=new Person();
			arr[position]=person;
			currentLocation=position;
		}
	}
	
	public void display() {
		for(int index=0;index<=currentLocation;index++) {
			System.out.println("arr["+index+"]="+arr[index]);
		}
	}

	public Person[] getArr() {
		return arr;
	}
	
	public int searchElement(Person person)throws ElementNotFoundException {
		boolean flag=false;
		int location=0;
		for(int index=0;index<=currentLocation;index++) {
			if(arr[index].equals(person)) {
				flag=true;
				location=index;
			}
		}
		if(flag==false)
			throw new ElementNotFoundException(person+" not found in collection");
		return location;
	}
	
}
