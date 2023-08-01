package org.tnsif.superkeyword;
//parent class
class Sports 
{
	String sportsName;
	void display()
	{
		System.out.println("Sport Name is: "+sportsName);
	}
	
}
//child class

class Cricket extends Sports
{
	int noOfPlayers=11;
	void display()
	{
		/*if parent and child methods are same and if we want to 
		 * call parent class method inside the child class then use super.methodName();
		 */
		super.display();
		System.out.println("No Of Player  is: "+noOfPlayers);
	}
	
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		Cricket c=new Cricket();
		c.display();
		

	}

}
