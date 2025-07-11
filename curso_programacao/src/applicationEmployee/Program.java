package applicationEmployee;

import java.util.Locale;
import java.util.Scanner;

import entitiesEmployee.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		Employee x;
		
		x = new Employee();

		System.out.print("Name: ");
		x.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		x.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		x.tax = sc.nextDouble();

		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", x.name, x.netSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double p =  sc.nextDouble();
		
		x.increaseSalary(p);
		
		System.out.println();
		System.out.printf("Update date: %s, $ %.2f%n", x.name, x.netSalary());
		
		sc.close();

	}

}
