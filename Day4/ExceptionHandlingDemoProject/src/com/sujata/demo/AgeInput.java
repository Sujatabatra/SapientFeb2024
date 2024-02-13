package com.sujata.demo;

import com.sujata.excep.AgeCheckedException;
import com.sujata.excep.AgeUncheckedException;

public class AgeInput {

	private int age;

	public AgeInput() {
		
	}
	public AgeInput(int age) throws AgeCheckedException {
		if(age<18)
			throw new AgeCheckedException("Age should not be less then 18");
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<18)
			throw new AgeUncheckedException("Age must be greater than 17");
		else
			this.age = age;
	}
	
	
}
