package org.tnsif.multilevelinheritance;
//child class2
//parent class2
public class TeamLead extends Manger {
	private String leadName;
	private int empID;
	private String projectName;
	
	//getter and setter
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	//tostring
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", empID=" + empID + ", projectName=" + projectName + ", toString()="
				+ super.toString() + "]";
	}
	
	
	//parameterized constructor
	public TeamLead(String deptName, String name, int empid, String leadName,int empID,String projectName) {
		super(deptName, name, empid);
		this.empID = empID;
		this.leadName = leadName;
		this.projectName= projectName;
	}

	
	

}
