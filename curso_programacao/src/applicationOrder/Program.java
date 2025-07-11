package applicationOrder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enumsOrder.OrderStatus;
import entitiesOrder.Client;
import entitiesOrder.Order;
import entitiesOrder.OrderItem;
import entitiesOrder.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter cliente data: ");

		System.out.print("Name: ");
		String nameClient = sc.nextLine();

		System.out.print("Email: ");
		String emailClient = sc.nextLine();

		System.out.print("Birthdate (DD/MM/YYYY): ");
		Date birthDate = sdf2.parse(sc.nextLine());
		
		Client client = new Client(nameClient, emailClient, birthDate);

		System.out.println("Enter order data: ");

		System.out.print("Status: ");
		String status = sc.nextLine();

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data: ");
			
			System.out.print("Product name: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantityProduct = sc.nextInt();
			
			Product product = new Product(nameProduct, priceProduct);
			
			OrderItem item = new OrderItem(quantityProduct, priceProduct, product);
			
			order.addItem(item);
		}

		
		System.out.println();
		
		System.out.println("ORDER SUMMARY: ");
		
		System.out.println(order);
		
		sc.close();
	}

}
