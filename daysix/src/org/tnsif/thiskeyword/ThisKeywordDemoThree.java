

package org.tnsif.thiskeyword;
public class ThisKeywordDemoThree {
	
	void print(ThisKeywordDemoThree t )
	{
		System.out.println("Hey there,I am using 'this'"+"keyword");
	}
	void display()
	{
		 /*When you call any parameterized method inside non parameterized constructor,
		  * we get an error
		  * to overcome that we have to use this keyword as argument in method call
		  */
		print(this);
	}

	public static void main(String[] args) {
		ThisKeywordDemoThree t =new ThisKeywordDemoThree();
		t.display();

	}

}
