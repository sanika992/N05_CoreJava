//TO DEMONSTRATE TRENARY OPERATOR

package org.tnisf.operators;

import java.util.Scanner;

public class TrenaryOperatorDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String res = (num%2==0)?"Even":"Odd";
		System.out.println("Result is: "+res);
		s.close();
		

	}

}
