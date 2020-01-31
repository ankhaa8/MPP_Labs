package Lab2.prob2B.Main;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import Lab2.prob2B.Order;

public class Main {

	public static void main(String[] args) {
		Order order1 = new Order(LocalDate.of(2020, 1, 14), 1, 18.00, 3);
		order1.addOrderLine(2, 19.00, 5);
		Order order2 = new Order(LocalDate.of(2020, 1, 15), 1, 19.00, 5);
		order2.addOrderLine(2, 20.00, 10);
		order2.addOrderLine(3, 5.50, 15);
		Order order3 = new Order(LocalDate.of(2020, 1, 16), 1, 6.80, 8);		
		List<Order> orders = Arrays.asList(order1, order2, order3);
		System.out.println(orders);

	}

}
