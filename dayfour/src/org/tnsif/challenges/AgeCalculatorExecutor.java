/*Ask a user for birth year encode in two digit
 * ("02") and for the current year,also encoded as two digit("23")
 * Write a program to find user current age in years?
 */


package org.tnsif.challenges;

import java.util.Scanner;

public class AgeCalculatorExecutor {
	
	static void currentAge(int birthYear,int currentYear)
	{
		if(currentYear > birthYear) 
		{
			System.out.println(currentYear-birthYear);
		}
		else
		{
			System.out.println((100-birthYear)+currentYear);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter birthYear and currentYear ");
		int birthYear =s.nextInt();
		int currentYear = s.nextInt();
		currentAge(birthYear,currentYear);

	}

}
