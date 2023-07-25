//PROGRAM TO DEMONSTRATE ON DEFAULT AND PARAMETERIZED Constructor
package org.tnsif.classandobject;
public class Citizen {
	//data member
	String citizenType;
	long aadharNo;
	String gender;
	String city;

	public Citizen(String citizenType, long aadharNo, String gender, String city) {
		super();
		this.citizenType = citizenType;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.city = city;
	}


	public Citizen() {
		System.out.println("Demonstarate default constructor");
	}


	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", aadharNo=" + aadharNo + ", gender=" + gender + ", city="
				+ city + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	}
	
	
	


