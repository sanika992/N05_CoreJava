package org.tnsif.multilevelinheritance;
//parent class
public class Manger {
	private String deptName;
	private String name;
	private int empid;
	public Manger() {
		super();
		System.out.println("Default Constructor Manager");
	}
	public Manger(String deptName, String name, int empid) {
		super();
		this.deptName = deptName;
		this.name = name;
		this.empid = empid;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Manger [deptName=" + deptName + ", name=" + name + ", empid=" + empid + ", getDeptName()="
				+ getDeptName() + ", getName()=" + getName() + ", getEmpid()=" + getEmpid() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
