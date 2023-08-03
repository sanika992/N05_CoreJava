package org.tnsif.polymorphism;

import java.util.Scanner;
//program to demonstrate on Method overriding
class Laptop
{
	String generation1,generation2;
	void specification(String generation1,String generation2)
	{
		System.out.println("Laptop: "+generation1);
	}
	
}
class Hp extends Laptop
{
	String generation1,generation2;
	void specification(String generation1,String  generation2)
	{
		super.specification(generation1,generation2);
		System.out.println("Hp: "+generation2);
	}
}

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		Hp h=new Hp();
		Scanner s = new Scanner(System.in);
		String generation1=s.nextLine();
		String generation2=s.nextLine();
		h.specification(generation1,generation2);

	}

}
