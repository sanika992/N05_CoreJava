package org.tnsif.singleinheritance;
//Derived class
public class Student extends Citizen {
	
	//Private members
	private int rollno;
	private String collegeName;
	//Default Constructor
	public Student() {
		super();
		
	}
	// Parameterized Constructor
	public Student(String city, int pincode, long aadharNo, long contactNo,int rollno,String collegeName) {
		super(city, pincode, aadharNo, contactNo);
		this.rollno= rollno;
		this.collegeName = collegeName;
		
		
	}
	//Getter and Setter
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	


	
	
	
	

}
