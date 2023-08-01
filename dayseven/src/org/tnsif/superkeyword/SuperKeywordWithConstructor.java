package org.tnsif.superkeyword;

//parent class
class Nationality
{
	String nationName="Germany";

	public Nationality(String nationName) {
		this.nationName = nationName;
		System.out.println(nationName);
	}
	
}

//child class 
class Person extends Nationality
{
	String language ="German";

	public Person(String nationName,String language) {
		//calling parent class constructor
		super(nationName);
		this.language = language;
		System.out.println(language);
	}
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) 
	{
       Person p= new Person("Germany","German");
       
	}

}
