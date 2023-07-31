//It can be used to refer instance variable of current class 

package org.tnsif.thiskeyword;
public class ThisKeywordDemoOne {
	
	// Default variable
			int x,y;
			
			void setData(int x,int y)
			{
				this.x= x;
				this.y= y;
				System.out.println(x+" "+y);
			}
			
			void display()
			{
				System.out.println(x+" "+y);
		
			}

	public static void main(String[] args) {
		ThisKeywordDemoOne t =new ThisKeywordDemoOne();
		t.setData(2,5);
		t.display();
		
		
		
	}

}
