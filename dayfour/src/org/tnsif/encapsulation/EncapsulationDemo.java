//PROGRAMES TO DEMONSTRATE ON ENCAPSULATION
/*ENCAPSULATION ACHIVES THE DATA HIDING USING PRIVATE
 * ACCESS SPECIFIER
 */
//driver class
package org.tnsif.encapsulation;
public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.setAccountNo(12345678901L);
		h.setAccountType("Current Account");
		h.setCvvNo(233);
		h.setPinNo(1232);
		//accessing and printing all the private no
		/*System.out.println(h.getAccountNo());
		System.out.println(h.getAccountType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());
		*/
		System.out.println(h);

	}

}
