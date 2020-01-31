package Lab4C;

public abstract class Employee {
	private String empID;

	public Employee(String id) {
		this.empID = id;
	}

	public String getEmployeeID() {
		return empID;
	}

	public void print(int month, int year) {
		Paycheck p = calcCompensation(month, year);
		p.print();
	}

	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		return new Paycheck(grossPay, Tax.FICA, Tax.State, Tax.Local, Tax.Medicare, Tax.SocialSecurity);
	}

	abstract public double calcGrossPay(int month, int year);
}
