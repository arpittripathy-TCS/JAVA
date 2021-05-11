package javaPackage;

public class Employee {
	private long empId;
	private String empName, empAddress;
	private int empAge;
	Employee(long empId, String empName, int empAge, String empAddress){
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empAddress = empAddress;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public long getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public String getEmpAddress() {
		return empAddress;
	}
}