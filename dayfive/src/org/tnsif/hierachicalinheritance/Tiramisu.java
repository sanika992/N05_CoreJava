package org.tnsif.hierachicalinheritance;
//child class 2
public class Tiramisu extends Andriod {
	
	//private members
	private int version;

	//getter and setter
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	//to string
	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}

	//Parameterized constructor
	
	public Tiramisu(int version,String brandName, int sloteType) {
		super(brandName, sloteType);
		this.version = version;
	}

	
	


}
