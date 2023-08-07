package org.tnsif.interfacedemo;
//Implementable class or child class
//program to demonstrate on multiple inheritance
public class Person implements ColdDrink,Alcohol 
{

	@Override
	public void showDrinkName() {
		System.out.println(brand+" "+alcoholname+" "+name);
		
	}


	
	

}
