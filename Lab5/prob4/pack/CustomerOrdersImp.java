package Lab5.prob4.pack;

import java.util.List;

public class CustomerOrdersImp implements CustomerOrders {
	private Customer customer;
	private List<Order> orders;

	CustomerOrdersImp(Customer c, List<Order> o) {
		customer = c;
		orders = o;
	}

	@Override
	public List<Order> getOrders() {
		return orders;
	}

	@Override
	public Customer getCustomer() {
		return customer;
	}

}
