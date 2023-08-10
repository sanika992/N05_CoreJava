package org.tnsif.uncheckedexception;
//program to demonstrate on ArrayIndexOutOfBoundException
public class ArrayIndexOutOfBoundExceptionExecutor {
	
	 static void print(int arr[])
	 {
		 try {
	 
		 System.out.println(arr[4]);
		 }
		 catch(Exception e) 
		 {
			 System.out.println("Exception handled: "+e);
		 }
		 finally 
		 {
			 System.out.println("Finally block is always executed");
		 }
	 }


	public static void main(String[] args) {
		int arr[]= {12,4,6};
		print(arr);
		
		
	}

}
