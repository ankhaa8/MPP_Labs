package Lab4C;

import java.time.LocalDate;
import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(String id, double commission, double baseSalary, List<Order> orders) {
		super(id);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = orders;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		LocalDate CurrentMonth = LocalDate.of(year, month, 1);
		double sumOrderAmount = 0.0;
		for (Order o : orders) {
			if (isPreviousMonth(CurrentMonth, o.getOrderDate())) {
				sumOrderAmount += o.getOrderAmount();
			}
		}
		return baseSalary + commission * sumOrderAmount;
	}

	private boolean isPreviousMonth(LocalDate current, LocalDate previous) {
		int currentMonth = current.getMonthValue();
		int preiousMonth = previous.getMonthValue();
		int currentYear = current.getYear();
		int previosYear = previous.getYear();
		
		if ((currentMonth - preiousMonth == 1 && currentYear == previosYear) || 
			(currentMonth == 1 && preiousMonth == 12 && currentYear - previosYear == 1)) {
			return true;
		}
		return false;
	}
}
