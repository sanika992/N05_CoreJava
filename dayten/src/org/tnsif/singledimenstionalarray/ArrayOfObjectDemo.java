package org.tnsif.singledimenstionalarray;
//driven class
//program to demonstrate on array of object
public class ArrayOfObjectDemo {
	
	public static void main (String[] args) {
		Employee arr[]=new Employee[2];
		arr[0] =new Employee(101,"Sanika",94000.9);
		arr[1]=new Employee(102,"Rashmi",54000.9);
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
	    }
	}

}
