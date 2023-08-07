package org.tnsif.interfacedemo;
//driver class
//program to demonstrate on an interface
public class InterfaceExecutor {

	public static void main(String[] args) {
		//we cannot instantiate  an interface
		//DebitCard d =new DebitCard();
		SBIDebitCard s= new SBIDebitCard();
		s.displayCardDetails();
		/*we can call default method of an interface using obj
		 * of implementable class
		 */
		s.display();
		/*print() is a static method inside an interface 
		 * to call print()method we have to use interface name.method name();
		 */
        DebitCard.print();
        
        CheesePopcon c = new CheesePopcon();
        c.displayRecipe();
        
        Person p =new Person();
        p.showDrinkName();
	}

}
