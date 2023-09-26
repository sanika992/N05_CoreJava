//Program to demonstrate Heterogeneous List
package org.tnsif.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Executor {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
	 @SuppressWarnings("rawtypes")
	List listOne= new ArrayList();
	 listOne.add(10);
	 listOne.add(true);
	 listOne.add(43.10f);
	 listOne.add("Hello");
	 listOne.add(new String("hi"));
	 
	 System.out.println(listOne);
	 
	 //ClassCastException
	 Collections.sort(listOne);

	}

}
