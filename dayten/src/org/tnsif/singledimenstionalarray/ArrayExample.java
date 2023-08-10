package org.tnsif.singledimenstionalarray;
//program to demonstrate on array using compile time input values
public class ArrayExample {

	public static void main(String[] args) {
		//Declaration and initialization of array at compile time
		int arr[]= {44,33,22,5,6};
		System.out.println(" The array of 2nd index is: "+arr[2]);
		//to print all values of array
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	
	
	}
}
