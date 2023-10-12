package org.tnsif.collection;

public class Employee {
	private int empid;
	private String comName;
	private float salary;
	private String designation;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", comName=" + comName + ", salary=" + salary + ", designation="
				+ designation + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Employee(int empid, String comName, float salary, String designation) {
		super();
		this.empid = empid;
		this.comName = comName;
		this.salary = salary;
		this.designation = designation;
	}

	public static void main(String[] args) {
		

	}

}
