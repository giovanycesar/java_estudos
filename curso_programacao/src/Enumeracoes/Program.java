package Enumeracoes;

import java.util.Date;

import entities.enums.OrderStatus;
import entitiesEnumeracoes.OrderEnumeracoes;

public class Program {

	public static void main(String[] args) {

		OrderEnumeracoes order = new OrderEnumeracoes(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
