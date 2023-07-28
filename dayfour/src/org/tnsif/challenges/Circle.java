/*   There are n people standing in a circle waiting to be executed. 
 * the counting out begins at some point in the circle 
 * and prose around the circle in fix direction.
 * in each step a certain no of people are skipped and the next person is executed
 * the elimination process around the circle 
 * (which is becoming smaller and smaller as executed people are removed)
 *  until only a last person remains, * who is given freedom? 
 *   Given total no of person and a no of k which indicates that k-1 person are skip and kth person 
 *  is skilled in the circle 
 *    The task is to choose the person in initial circle who survive?
 */
package org.tnsif.challenges;

import java.util.Scanner;

public class Circle {
	
	 static int survive(int n,int k)
	{
		if(n==1)
			return 1;
		else
			return(survive(n-1,k)+k-1)%n+1;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int k =s.nextInt();
		System.out.println(survive(n,k));
		
		
		

	}

}
