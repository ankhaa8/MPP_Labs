package Lab3.prob4;

import java.util.List;

public class Admin {
	public static double computeTotalRent(List<Property> properties) {
		double totalRent = 0;
		for (Property p : properties) {				
				totalRent += p.computeRent();		
		}
		return totalRent;
	}
	
	public static double computeTrailerTotalRentInCity(List<Trailer> trailers, String city) {
		double totalRent = 0;
		for (Trailer t : trailers) {			
			if(t.getAddress().getCity().equals(city))
				totalRent += t.computeRent();		
		}
		return totalRent;
	}
}
