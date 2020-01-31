package Lab3.prob2;

import java.util.List;

public class Building {	
	private double maintenanceCost;
	private List<Apartment> apartments;
	
	Building(double m, List<Apartment> a){
		this.maintenanceCost = m;
		apartments = a;
	}
	
	public double getMaintenanceCost() {
		return maintenanceCost;
	}
	
	public List<Apartment> getApartments() {
		return apartments;
	}
	
	public double calculateProfit() {
		double profit = 0.0;
		for(Apartment a : apartments) profit += a.getRent();
		return profit - maintenanceCost;
	}
}
