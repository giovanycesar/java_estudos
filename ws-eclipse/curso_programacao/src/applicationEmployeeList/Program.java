package applicationEmployeeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesEmployeeList.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		List<Integer> idsEmployees = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Employee #" + (i + 1) + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			if (idsEmployees.contains(id)) {
				System.out.println("Id " + id + " already exists.");
				System.out.print("Id: ");
				id = sc.nextInt();
			} else {
				idsEmployees.add(id);
			}
			
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
			
			System.out.println();
			
		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int idIncrease = sc.nextInt();
		
		if (idsEmployees.contains(idIncrease)) {
			System.out.print("Enter the percentage: ");
			double percentageIncrease = sc.nextDouble();
			
			for (Employee emp : employees) {
				if (emp.getId()==idIncrease) {
					emp.increaseSalary(percentageIncrease);
				}
			}
		} else {
			System.out.println("This id does not exist.");
		}
		
		System.out.println();
		
		System.out.println("List of employees: ");
		for (Employee emp : employees) {
			System.out.println(emp.getId() + ", " + emp.getName() + ", " + emp.getSalary());
		}
		
		sc.close();

	}

}
