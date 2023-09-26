//Program to demonstrate homogeneous ArrayList
package org.tnsif.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(60);
		intList.add(40);
		intList.add(50);
		
		System.out.println(intList);
		intList.add(2,90);
		System.out.println(intList);
		intList.contains(intList);
		System.out.println("is 10 present ?"+intList.contains(10));
		System.out.println("is 100 present ?"+intList.contains(100));
		System.out.println("Remove element at index 5"+intList.remove(5));
		System.out.println(intList);
		
		//IndexOutOFBoundException
		//System.out.println("Remove element at index 25"+intList.remove(5));
		
		System.out.println("Remove element at index 41"+intList.indexOf(41));
		System.out.println(intList);
		
		System.out.println(intList.indexOf(56)>=0?"56 is present":"not prestent");
		System.out.println(intList);
		
		Iterator<Integer> it=intList.iterator();
		while(it.hasNext()) {
			int no=it.next();
			System.out.println(no+" : "+no*no);
		}
		
		Collections.sort(intList);
		System.out.println("-----AfterSortinhg-------");
		System.out.println(intList);
		
		intList.clear();
		Collections.reverse(intList);
		System.out.println("-----After reversing---");
		System.out.println(intList);
	}

}
