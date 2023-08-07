package org.tnsif.interfacedemo;

public interface DebitCard {
	/*by default all the variables inside an interface is public static final and 
	 * if it is final then we have to initialize the value for the variable
	 */
	long cardno= 1234578L;
	//we cannot use concrete method inside interface
	//by default meth0d is abstract
	void displayCardDetails();
	//default method and static method are new features of java8 version which we can use inside a interface
	//default method
	default void display() {
		System.out.println("Default method");
	}
	//static method
    static void print() {
    	System.out.println("static method");
    }
}
