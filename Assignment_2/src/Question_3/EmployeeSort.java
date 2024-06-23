package Question_3;

import java.util.Arrays;

public class EmployeeSort {
	public static void empSort(Employee arr[], int N) {
		for (int i = 1; i < N; i++) {
			Employee temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].getSalary() > temp.getSalary()) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		Employee employees[] = {  new Employee("Shubham", 90000.90),
				new Employee("Amit", 70000),
				new Employee("Rohit", 50000),
				new Employee("Sejal", 40000),
				new Employee("Abhishek", 60000),
				new Employee("Vijay", 100000)};
		empSort(employees, employees.length);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
