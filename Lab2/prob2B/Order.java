package Lab2.prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
	private LocalDate orderDate;
	private List<OrderLine> orderlines;
	
	public Order(LocalDate d, int linenum, double price, int quantity) {
		this.orderDate = d;
		orderlines = new ArrayList<>();
		addOrderLine(linenum, price, quantity);		
	}
	
	public void addOrderLine(int num, double p, double q) {
		OrderLine ol = new OrderLine(num, p, q, this);
		orderlines.add(ol);
	}
	
	public List<OrderLine> getOrderLine() {
		return orderlines;
	}
	
	public int getOrderNum() {
		return orderNum;
	}
	
	public LocalDate getOrderDate() {
		return orderDate;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(orderDate+"->\n");
		for(OrderLine ol : orderlines) {
			sb.append(ol + "\n");			
		}
		return sb.toString();
	}
	
}
