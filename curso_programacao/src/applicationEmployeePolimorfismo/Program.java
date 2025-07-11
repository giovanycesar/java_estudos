package applicationEmployeePolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesEmployeePolimorfismo.Employee;
import entitiesEmployeePolimorfismo.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		List<Employee> employees = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data: ");

			System.out.print("Outsourced (y/n)? ");
			char r = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Hours: ");
			int hours = sc.nextInt();

			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (r == 'n') {
				Employee emp = new Employee(name, hours, valuePerHour);

				employees.add(emp);
			} else {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();

				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(emp);
			}

		}

		System.out.println();

		System.out.println("PAYMENTS: ");
		
		for (Employee emp : employees) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();

	}

}
