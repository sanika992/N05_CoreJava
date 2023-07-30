package org.tnsif.multilevelinheritance;
//child class
public class TeamMember extends TeamLead{
	
	private int size;
	private int duration;
	//parameterized
	public TeamMember(String deptName, String name, int empid,
			          String leadName, int empID2, String projectName,
			          int size,int duration)
	{
		super(deptName, name, empid, leadName, empID2, projectName);
		this.size=size;
		this.duration=duration;
	}
	//getter and setter
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	//tostring
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	

}
