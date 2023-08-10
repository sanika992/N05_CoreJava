package org.tnsif.singledimenstionalarray;

import java.util.Arrays;
import java.util.Scanner;

//program to demonstrate on run time array and to find out largest element in an array.
public class ArrayMax {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of Elements: ");
		int n=s.nextInt();
		//array declaration
		int arr[]= new int[n];
		//array initialization
		for(int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.print("Array elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max) 
			{
				max=arr[i];
			}
		}
		System.out.println("The largest element in an array is:"+max);
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
