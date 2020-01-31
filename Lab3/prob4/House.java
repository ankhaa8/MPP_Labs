package Lab3.prob4;

public class House extends Property{
	private double lotSize;
	
	House(double ls){
		lotSize = ls;
	}
	
	@Override
	public double computeRent() {		
		return 0.1 * lotSize;
	}
}
