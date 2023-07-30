package org.tnsid.hierachicalinheritance;

public class Andriod {
	
	//private Members
	private String brandName;
	private int sloteType;
	
	//Getter and Setter
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getSloteType() {
		return sloteType;
	}
	public void setSloteType(int sloteType) {
		this.sloteType = sloteType;
	}
	
	//Default constructor
	public Andriod() {
		super();
	
	}
	
	//Parameterized constructor
	public Andriod(String brandName, int sloteType) {
		super();
		this.brandName = brandName;
		this.sloteType = sloteType;
	}
	
	//toString
	@Override
	public String toString() {
		return "Andriod [brandName=" + brandName
				+ ", sloteType=" + sloteType
				+ ", getBrandName()=" + getBrandName()
				+ ", getSloteType()=" + getSloteType() 
				+ ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	 
	

}
