package applicationBank;

import java.util.Locale;
import java.util.Scanner;

import entitiesBank.Bank;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there a inicial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		Bank x;

		if (response == 'y') {

			System.out.print("Enter inicial deposit value: ");
			double inicialDeposit = sc.nextDouble();

			x = new Bank(number, holder, inicialDeposit);

		} else {

			x = new Bank(number, holder);

		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(x.toString());

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		x.deposit(amount);

		System.out.println("Updated account data: ");
		System.out.println(x.toString());

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		x.withdraw(amount);

		System.out.println("Updated account data: ");
		System.out.println(x.toString());

		sc.close();

	}

}
