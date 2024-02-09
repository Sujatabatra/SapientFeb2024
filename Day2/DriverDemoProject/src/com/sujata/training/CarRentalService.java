package com.sujata.training;

import com.sujata.demo.Audi;
import com.sujata.demo.BMW;
import com.sujata.demo.Driver;
import com.sujata.demo.Honda;

public class CarRentalService {

	public static void main(String[] args) {
		Audi audi=new Audi("A8", "Red");
		BMW bmw=new BMW("Q5", "Blue");
		Honda honda=new Honda("CRV", "Silver");
		
		Driver sonu=new Driver("Sonu");
		Driver monu=new Driver("Monu");
		
		monu.setCar(honda);
		monu.drive();
		

	}

}
