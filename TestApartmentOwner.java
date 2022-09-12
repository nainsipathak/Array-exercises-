package com.arrays.demo.pll;
import com.arrays.demo.ApartmentOwner;

public class TestApartmentOwner {

	public static void main(String[] args) {
		ApartmentOwner d = new ApartmentOwner(" Naina");
		d.setApartment("ABC, 29", 0);
		d.setApartment("DEF, 42", 1);
		d.setApartment("GH, 9", 2);
		d.setApartment("IJ, 30", 3);
		d.setApartment("Xy, 250", 6);
		System.out.println(d);
		System.out.println();
		System.out.println(d.getOwner() + " has " +
		d.countApartments() + " apartments");
		System.out.println("Apartment 2: " + d.getApartment(2));
		
		System.out.println();
		d.reorganizeApartments();
		
		System.out.println(d);


	}

}
