package com.jain;

public class BeerExpert {
	public String getBrands(String color) {
		String brands = new String();
		if(color.equals("Red")) brands = "Ralli's Rose";
		else brands = "Virgin Mary";
		return(brands); 
		}
	}

