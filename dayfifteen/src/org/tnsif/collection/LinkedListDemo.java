package org.tnsif.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String>strList = new LinkedList<String>();
		strList.add("Sanika");
		strList.add("Pooja");
		strList.add("Vijay");
		strList.add("Vipul");
		strList.add("Maloji");

		
		System.out.println(strList);
		strList.addFirst("Ruchi");
		strList.addLast("Mathura");
		System.out.println(strList);
		System.out.println("First Element is:"+strList.getFirst());
		System.out.println("Last Element is:"+strList.getLast());
		
		System.out.println(strList.remove(1)+" removed");
		System.out.println("IS Sanika REMOVED FROM LIST?"+strList.remove("sanika"));
		strList.removeLast();
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println(strList);
		System.out.println("----------------------------");
		ListIterator<String> listIt=strList.listIterator();
		while(listIt.hasNext())
		{
			System.out.println(listIt.next().toUpperCase());
		}
		System.out.println("-----------------------------");
		System.out.println(strList);
		while(listIt.hasPrevious())
		{
			System.out.println(listIt.previous().toLowerCase());
		}
		

	}

}
