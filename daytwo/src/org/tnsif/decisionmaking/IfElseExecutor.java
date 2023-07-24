//PRAGRAM FOR IF ELSE
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int weight = s.nextInt();
		
		if(age>18 && weight>50) {
			
			System.out.println("You are Eligible");
		}
		else {
			System.out.println("You are NOT Eligible");
		}

	}

}
