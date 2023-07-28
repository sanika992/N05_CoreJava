// PROGRAM TO DEMONSTRATE ACCESS SPECIFIRE
package org.tnsif.accesspecifier;
public class Bank {
	//different access specifier
	public String bankName;
	private int pinNo;
	long accountNo = 123456789101L;
	
    //public method
	public void displayPublic()
	{
		System.out.println("Bank Name is: "+bankName);
	}
	
	//private method
		public void displayPrivate()
		{
			System.out.println("Pin No is: "+pinNo);
		}
		
	//default method
		public void displayDfault()
		{
			System.out.println("Account No is: "+accountNo);
		}

}
