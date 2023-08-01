package org.tnsif.statickeyword;
public class StaticMethodExecutor {
	
	int x=2;
	static String collegename="MET";
	/*1.if any method outside main function and if you want 
	 * to access that method inside main function we have
	 *  to make that function as static
	 */
	//static method
	public static void print() {
		
		System.out.println(collegename);
		/*2.we cannot use non static variable inside any static method
		 */
		//System.out.println(x);
	}

	public static void main(String[] args) {
         print();
	}

}
