package org.tnsif.uncheckedexception;
import java.io.IOException;
//program to demonstrate on throw and throws keyword
public class ThrowExecutor{
     //throws keyword is used to declare an exception
	 static void isEligible(int age,int weight) throws IOException
	{
		if(age>18 && weight>50)
		{
			System.out.println("Elegible to donate blood");
		}
		else 
			//throw keyword id used to throw an exception explicitly
			throw new IOException("not eligible");
	}
	public static void main(String[] args)throws IOException
	{
		
		isEligible(12,54);

	}

}
