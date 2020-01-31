package Lab4C;

public class Hourly extends Employee{
	private double hourlyWage;
	private double hoursPerWeek;
	private static final int WEEKS_PER_MONTH = 4;
	
	public Hourly(String id, double hourlyWage, int hoursPerWeek) {
		super(id);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	@Override
	public double calcGrossPay(int month, int year) {	
		return WEEKS_PER_MONTH*hourlyWage*hoursPerWeek;
	}

}
