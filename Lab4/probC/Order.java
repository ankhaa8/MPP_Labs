package Lab4C;

import java.time.LocalDate;

public class Order {
	private String orderNo;
	private LocalDate orderDate;
	private double orderAmount;

	public Order(String no, LocalDate oDate, double oAmount) {
		this.orderNo = no;
		this.orderDate = oDate;
		this.orderAmount = oAmount;
	}

	public void setOrderNo(String s) {
		orderNo = s;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

}
