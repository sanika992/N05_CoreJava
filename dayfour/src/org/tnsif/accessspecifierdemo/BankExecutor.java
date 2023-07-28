//PROGRAM TO DEMONSTRATE ACCESS SPECIFIRE

package org.tnsif.accessspecifierdemo;
import org.tnsif.accesspecifier.Bank;
public class BankExecutor {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.bankName = "SBI";
		b.displayPublic();
		/*pin no and displayPrivate() method are private,
		 * so we cannot access into another class and
		 * another package ,only we can access private
		 * data members inside the same class*/
		
		//b.pinNo;
		//b.displayPrivate();
		/*accountNo and displayDefault method are default that's why,
		 * we are not able to access into another package,
		 * only we can access in the same package
		 */
		//b.accountNO;
		//b.displayDefault();

	}
	

}
