package applicationTax;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesTax.Company;
import entitiesTax.Individual;
import entitiesTax.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");

			System.out.print("Individual or company(i/c)? ");
			char r = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (r == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();

				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();

				list.add(new Company(name, anualIncome, numberOfEmployees));
			}

		}

		System.out.println();

		System.out.println("TAXES PAID: ");

		double sum = 0;

		for (TaxPayer obj : list) {
			System.out.println(obj.getName() + ": $ " + String.format("%.2f", obj.tax()));

			sum += obj.tax();
		}
		
		System.out.println();

		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}

}
