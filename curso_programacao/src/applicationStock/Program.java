package applicationStock;

import java.util.Locale;
import java.util.Scanner;

import entitiesStock.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		Product x = new Product(name, price);

		x.setName("Computer");
		System.out.println("Updated name: " + x.getName());
		
		x.setPrice(1200.00);
		System.out.println("Updated price: " + x.getPrice());

		System.out.println();
		System.out.println("Product data: " + x.toString());

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int add = sc.nextInt();
		x.addProducts(add);
		System.out.println("Updated data: " + x.toString());

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		int remove = sc.nextInt();
		x.removeProducts(remove);
		System.out.println("Updated data: " + x.toString());

		sc.close();

	}

}
