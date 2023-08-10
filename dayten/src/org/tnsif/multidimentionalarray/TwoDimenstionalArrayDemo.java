package org.tnsif.multidimentionalarray;

import java.util.Scanner;

//program to demonstrate on 2D array
public class TwoDimenstionalArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[][]= new int[3][2];
		
		//for initializing an array value
		//outside array
		for(int i=0;i<3;i++)
		{
			//inside array
			for(int j=0;j<2;j++)
			{
				arr[i][j]=s.nextInt();
			}
			
		}
		//for printing values
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
