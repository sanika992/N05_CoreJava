package org.tnsif.statickeyword;

public class StaticBlockExecutor {
       static float salary;
       String companyName;
       
       /*static block is use to initialize  the static variable
        * we cannot assign a value for any non static variable 
        * 
        * 
        */
       static {
    	   //companyName="Accenture";
    	   salary = 77777.90f; 
       }
       //static method
       static void print()
       {
    	   System.out.println(salary);
       }
       
	public static void main(String[] args) {
		print();

	}

}
