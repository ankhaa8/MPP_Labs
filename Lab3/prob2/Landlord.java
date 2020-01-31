package Lab3.prob2;

import java.util.List;

public class Landlord {
	
	private List<Building> buildings;
	
	public Landlord(List<Building> b){
		buildings = b;
	}
	
		
	public List<Building> getBuilding() {
		return buildings;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();	
		
		int i = 0, j = 0;
		for(Building b : buildings) {
			sb.append("\nBuilding: " + i + ", maintenance cost: " + b.getMaintenanceCost() +"\n");
			j = 0;
			for(Apartment a : b.getApartments()) {
				sb.append("   Apartment: " + j + ", rent: " + a.getRent() +"\n");	
				j++;
			}
			i++;
		}	
		
		return sb.toString();		
	}
	
	public double calculateProfit() {
		double profit = 0.0;
		for(Building b : buildings) profit += b.calculateProfit();
		return profit;
	}
}
