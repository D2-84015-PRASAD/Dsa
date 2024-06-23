package Question_3;

public class Employee {
	String empname;
	double salary;
	
	public Employee(String empname, double salary) {
		this.empname = empname;
		this.salary = salary;
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
		return "Employee [empname=" + empname + ", salary=" + salary + "]";
	}
}
