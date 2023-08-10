package org.tnsif.customexception;

import java.util.Scanner;
//program to demonstrate user defined function
//driver class
public class Customexception {

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter email ID and Password");
		String email=s.nextLine();
		String password=s.nextLine();
		try {
			if(email.equals("sanikashinde@gmail.com")&& password.equals("pass@123"))
			{
			System.out.println("Credential matched");
			}
			else
			{
			throw new LoginCredenstial("Invalid credential");
			}
			
		}catch(LoginCredenstial e)
		{
			System.out.println(e);
		}
	}

}
