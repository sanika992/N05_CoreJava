package org.tnsif.jumping;

public class BreakExecutor {

	public static void main(String[] args) {
		for(int i=1; i<=10;i++) {
			if(i==5)
				break;
			else
				System.out.print((i+" "));
		}

	}

}
