package Lab3.prob4;

public class Trailer extends Property {
	private Address address;
	public static final double rent = 500;
	
	Trailer(){
		
	};
	
	Trailer(Address a){
		this.address = a;
	}
	
	public Address getAddress() {
		return address;
	}
	
	@Override
	public double computeRent() {
		return rent;
	}
	
}
