package applicationAccountExceptions;

import java.util.Locale;
import java.util.Scanner;

import entitiesAccountExceptions.Account;
import modelExceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		

		try {
			System.out.println("Enter account data");

			System.out.print("Number: ");
			int number = sc.nextInt();

			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();

			System.out.print("Inicial balance: ");
			double balance = sc.nextDouble();

			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account acc = new Account(number, holder, balance, withdrawLimit);

			System.out.println();

			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
			acc.withdraw(amount);

			System.out.print("New balance: " + String.format("%.2f", acc.getBalance()));

		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();
	}

}
