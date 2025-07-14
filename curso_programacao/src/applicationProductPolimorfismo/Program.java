package applicationProductPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesProductPolimorfismo.ImportedProduct;
import entitiesProductPolimorfismo.Product;
import entitiesProductPolimorfismo.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		List<Product> products = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");

			System.out.print("Common, used or imported(c/u/i)? ");
			char r = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (r == 'u') {

				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String manufactureDate = sc.nextLine();

				Product product = new UsedProduct(name, price, sdf.parse(manufactureDate));

				products.add(product);

			} else if (r == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();

				Product product = new ImportedProduct(name, price, customsFee);

				products.add(product);
			} else {
				Product product = new Product(name, price);

				products.add(product);
			}

		}

		System.out.println();

		System.out.println("PRICE TAGS: ");

		for (Product product : products) {
			System.out.println(product.priceTag());
		}

		sc.close();

	}

}
