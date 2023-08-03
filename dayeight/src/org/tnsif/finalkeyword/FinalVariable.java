package org.tnsif.finalkeyword;
//progarm to demonstrate on final keyword with variable
public class FinalVariable {
	
	//Initializing the vale is must
	//final int NUM;
	final float SALARY=78000.89f;
	
	public void print()
	{
		/*we can't change the value of final variable*/
		//SALARY=89000.56f;
		System.out.println("Salary is: "+SALARY);
	}

}
