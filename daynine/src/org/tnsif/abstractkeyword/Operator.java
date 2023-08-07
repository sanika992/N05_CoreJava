package org.tnsif.abstractkeyword;
public abstract class Operator {
    
	//abstract
	abstract void operation();
	
    abstract void multiplication();
    
    //non abstract or concrete method
    void print(int a,int b)
    {
    	System.out.println(a+b);
    }
}
