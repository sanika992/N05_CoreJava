//PROGRAMES TO DEMONSTRATE ON ENCAPSULATION
/*ENCAPSULATION ACHIVES THE DATA HIDING USING PRIVATE
 * ACCESS SPECIFIER
 */

package org.tnsif.encapsulation;
public class HDFC {
	// private data members
	private long accountNo;
	private int cvvNo;
	private String accountType;
	private int pinNo;
	
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFC [accountNo=" + accountNo + ", cvvNo=" + cvvNo + ", accountType=" + accountType + ", pinNo=" + pinNo
				+ ", getAccountNo()=" + getAccountNo() + ", getCvvNo()=" + getCvvNo() + ", getAccountType()="
				+ getAccountType() + ", getPinNo()=" + getPinNo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
