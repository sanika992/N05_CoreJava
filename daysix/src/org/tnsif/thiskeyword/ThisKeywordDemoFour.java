//

package org.tnsif.thiskeyword;
public class ThisKeywordDemoFour {
	
	int x;
	//Default Constructor
	ThisKeywordDemoFour()
	{
		this(55);  //invoking current parameterized constructor
		System.out.println("Default Constructor");
		
	}
	
	//Parameterized constructor
	ThisKeywordDemoFour(int x)
	{
		this.x=x;
		System.out.println("Parameterized Constructor: "+x);
	}
	

	public static void main(String[] args) {
		
		ThisKeywordDemoFour f = new ThisKeywordDemoFour();

	}

}
