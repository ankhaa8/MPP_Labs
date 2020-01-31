package Lab4C;

public class Salaried extends Employee{
	private double salary;
	
	public Salaried(String id, double s) {
		super(id);
		this.salary = s;
	}
	
	@Override
	public double calcGrossPay(int month, int year){
		return salary;
	}

}
