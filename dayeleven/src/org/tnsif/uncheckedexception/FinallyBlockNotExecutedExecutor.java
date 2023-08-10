package org.tnsif.uncheckedexception;
import java.util.Scanner;
public class FinallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		
		
		       //try block contains exception code
			    try 
				{
					System.out.println(x/y);
					/*when we use System.exit(0) in try or catch block,
					 * then finally block is not executed 
					 */
					System.exit(0);
				}
		       // catch block is used to exception handling
			    //catch(Exception e|ArrayIndexOutOfBoundsException)
				catch(Exception e)
				{
					System.out.println("Exception Handling"+e);
					System.exit(0);
				}
				finally 
				{
					/*when finally blocks contain an exception 
					 * then finally block is not executed
					 */
					System.out.println(4/0);
					System.out.println("Finally block is always executed");
				}
				
			

	}

}
