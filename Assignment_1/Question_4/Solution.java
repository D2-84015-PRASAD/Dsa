package Question_4;

import java.util.Scanner;

public class Solution {
	
	public static void searchEmployee(Employee arr[],int N,int key) {
		int index=-1;
		for(int i=0; i<N; i++) {
			if(arr[i].empid==key) {
				System.out.println("Employee found at index =" + i);
				System.out.println(arr[i].toString());
				index=i;
				break;
				}				
		}
		if(index==-1)
			System.out.println("Employee not found");
	}
	
	public static void searchEmployee(Employee arr[],int N,String key) {
		int index=-1;
		for(int i=0; i<N; i++) {
			if(arr[i].empname.equals(key)) {
				System.out.println("Employee found at index =" + i);
				System.out.println(arr[i].toString());
				index=i;
				break;
				}				
		}
		if(index==-1)
			System.out.println("Employee not found");
	}
	
	public static void searchEmployee(Employee arr[],int N,double key) {
		int index=-1;
		for(int i=0; i<N; i++) {
			if(arr[i].salary==key) {
				System.out.println("Employee found at index =" + i);
				System.out.println(arr[i].toString());
				index=i;
				break;
				}				
		}
		if(index==-1)
			System.out.println("Employee not found");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		Employee[] employees = 
				{new Employee(1,"Rohan",30000),
			     new Employee(2,"Mohan",40000),
			     new Employee(3,"Nitin",200.00),
			     new Employee(4,"Yash",50000),
			     new Employee(5,"Ram",90000),
			     new Employee(6,"Amit",70000),
			     new Employee(7,"Nilesh",60000),
			     new Employee(8,"Sameer",10000),
			     new Employee(9,"Amit",1000.00),
			     new Employee(10,"Mayur",10000)};

		
		do {
			System.out.println("1.Search Employee By Id");
			System.out.println("2.Search Employee By Name");
			System.out.println("3.Search Employee By Salary");		
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Employee Id To Search :");
				int id = sc.nextInt();
				System.out.println(" ");
				searchEmployee(employees, employees.length, id);
				System.out.println(" ");
				break;
			case 2:
				System.out.println("Enter Employee Name To Search :");
				String name = sc.next();
				System.out.println(" ");
				searchEmployee(employees, employees.length, name);
				System.out.println(" ");
				break;
			case 3:
				System.out.println("Enter Employee Salary To Search :");
				double salary = sc.nextDouble();
				System.out.println(" ");
				searchEmployee(employees, employees.length, salary);
				System.out.println(" ");
				break;			
			default:
				System.out.println("Enter valid choice");
				break;
			}			
		} while (choice!=0);
	}									
}
