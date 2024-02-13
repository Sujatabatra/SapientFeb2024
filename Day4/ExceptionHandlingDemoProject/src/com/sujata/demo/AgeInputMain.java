package com.sujata.demo;

import java.util.Scanner;

import com.sujata.excep.AgeCheckedException;
import com.sujata.excep.AgeUncheckedException;

public class AgeInputMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
			try {
			System.out.println("Input Age ");
			AgeInput ageInput1=new AgeInput(scanner.nextInt());
			System.out.println("Person is eligible for voting");
			
			AgeInput ageInput2=new AgeInput();
			System.out.println("Input One more Age");
			ageInput2.setAge(scanner.nextInt());
			System.out.println("Person is major");
			}
			catch(AgeCheckedException|AgeUncheckedException ex) {
				System.out.println(ex.getMessage());
			}
//			catch(AgeCheckedException e) {
//				System.out.println("Person is not eligible for voting");
//			}
//			catch (AgeUncheckedException e) {
//				System.out.println("Person is minor");
//			}
	

	}

}
