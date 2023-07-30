package org.tnsif.hierachicalinheritance;
//child class 3
public class SnowCore extends Andriod{
	
	private int version;

	
	//getter and setter
	public int getVersion() {
		return version;
	}
    
	public void setVersion(int version) {
		this.version = version;
	}
	//To String

	@Override
	public String toString() {
		return "SnowCore [version=" + version + ", toString()=" + super.toString() + "]";
	}


     //Parameterized constructor
	public SnowCore(int version,String brandName, int sloteType) {
		super(brandName, sloteType);
		this.version = version;
	}

	
	
	
	
	

}
