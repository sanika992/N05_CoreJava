package org.tnsif.customexception;

//program to demonstrate on user exception
public class LoginCredenstial extends Exception{
	//private members
	private String str;
	
    //getter and setter
	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}


	//Parameterized constructor
	public LoginCredenstial(String str) {
		super();
		this.str = str;
	}


	@Override
	public String toString() {
		return "LoginCredenstial [str=" + str + "]";
	}
	
	


}
