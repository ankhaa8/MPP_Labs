package Lab10.prob3;

public class CheckingAccount extends Account {
	final double PENALTY = 5.00;
	public CheckingAccount(int id, double startBalance) {
		super(id, startBalance);
	}
	
	@Override
	public double getBalance() {
		return super.getBalance() - PENALTY;
	}
}

