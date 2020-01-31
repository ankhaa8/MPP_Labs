package Lab3.prob4;

public class Condo extends Property{
	private int numFloors;
	
	Condo(int nf){
		numFloors = nf;	
	}
	
	@Override
	public double computeRent() {
		return 400*numFloors;
	}

}
