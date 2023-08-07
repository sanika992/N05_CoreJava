package org.tnsif.interfacedemo;
// Functional interface is a interface which contain exact one abstract method
 /*below annotation ensure that we have to
  *  use exactly one abstract method inside interface
  */
@FunctionalInterface  //exact one static method
public interface PopCon 
{
	//abstract method
	void displayRecipe();
	//void display();

}
