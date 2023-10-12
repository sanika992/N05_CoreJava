package org.tnsif.collection;

import java.util.ArrayList;

public class UserDefinedListDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee>empList = new ArrayList<Employee>();
		empList.add(new Employee(121,"Sanika",90000,"Java Developer"));
		empList.add(new Employee(121,"Anika",90000,"Web Developer"));
		empList.add(new Employee(121,"Sanika",90000,"FrontEnd Developer"));
		System.out.println(empList);
		

	}

}
