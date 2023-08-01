package org.tnsif.homework;

import java.util.Scanner;

public class HotelTariff {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int month = s.nextInt();
		float rent = s.nextFloat();
		int days =s.nextInt();
		switch(month)
		{
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println(rent*days);
			break;
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			System.out.println(rent+(rent*0.2)*days);
			break;
		default:
			System.out.println("Invalid month no:");
			
								
		
		
		}
		
 
	}

}
