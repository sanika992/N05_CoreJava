package org.tnisf.operators;

import java.util.Scanner;

public class BloodDonationEligible {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int weight = s.nextInt();
		
		if((age>=18)&(weight>=50))
			System.out.println("You are Eligible");
		else
			System.out.println("You are NOT Eligible");
		

	}

}
