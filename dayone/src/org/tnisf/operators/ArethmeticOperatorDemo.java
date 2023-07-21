//PROGRAM TO DEMONSTARATE ARETHEMATIC OPERATORS

package org.tnisf.operators;

import java.util.Scanner;

public class ArethmeticOperatorDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();//7
		int num2 = s.nextInt();//3
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		s.close();

	}

}
