package org.tnsif.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> a = new Stack<Integer>();
		a.add(40);
		a.add(70);
		a.add(20);
		a.add(80);
		System.out.println(a);
		
		
		System.out.println(a);
		System.out.println("Size : "+a.size());
		System.out.println("is Stack Empty : "+a.isEmpty());
		System.out.println("Element to be remove : "+a.peek());
		
		
		while(!a.isEmpty())
		{
			System.out.println(a.pop()+" removed");
		}
		System.out.println(a);
		

		
		
		
		

	}

}



