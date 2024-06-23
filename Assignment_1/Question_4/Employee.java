package Question_4;

public class Employee {
	int empid;
	String empname;
	double salary;
	
	
	public Employee() {
		
	}

	public Employee(int empid, String empname, double salary) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	
}
