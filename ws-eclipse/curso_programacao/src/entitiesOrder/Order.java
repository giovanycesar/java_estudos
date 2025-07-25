package entitiesOrder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.enumsOrder.OrderStatus;
import entitiesPost.Comment;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

	private Date moment;
	private OrderStatus status;

	private List<OrderItem> items = new ArrayList<>();
	private Client client;

	Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public double total() {
		double sum = 0;

		for (OrderItem i : items) {
			sum += i.subTotal();
		}

		return sum;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " - (" + sdf2.format(client.getBirthDate()) + ") - "
				+ client.getEmail() + "\n");
		sb.append("Order items: " + "\n");

		for (OrderItem i : items) {
			sb.append(i.getProduct().getName() + ", $" + String.format("%.2f", i.getPrice()) + ", " + i.getQuantity()
					+ ", Subtotal: " + i.subTotal() + "\n");
		}

		sb.append("Total price: $" + String.format("%.2f", total()));

		return sb.toString();

	}

}
