package precoMedio;

import java.util.Locale;
import java.util.Scanner;

import entitiesPrecoMedio.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos produtos?");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.println((i + 1) + ": Escreva o nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println((i + 1) + ": Escreva o preço do produto: ");
			double price = sc.nextDouble();

			vect[i] = new Product(name, price);
		}

		double sum = 0;

		for (int i = 0; i < vect.length; i++) {

			sum += vect[i].getPrice();
		}

		double avg = sum / vect.length;

		System.out.printf("Average price: %.2f.%n", avg);

		sc.close();
	}

}
