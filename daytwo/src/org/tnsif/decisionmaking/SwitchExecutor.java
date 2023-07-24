package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int songno = s.nextInt();
		switch(songno)
		{
		 case 1:
			System.out.println("Boy with Love");
			break;
		 case 2:
			System.out.println("Dynamite");
			break;
		 case 3:
			System.out.println("Life Goes On");
			break;
		 case 4:
			System.out.println("Butter");
			break;
		}

	}

}
