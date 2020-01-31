package Lab3.prob4;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		
		Property[] p = { new House(9000), 
						new Condo(2), 
						new Trailer() };
		double totalRent = Admin.computeTotalRent(Arrays.asList(p));		
		System.out.println("Total Rent: "+totalRent);
		
		
		Address[] a = new Address[3];		
		a[0] = new Address("1000 n 4","Fairfield","Iowa","52557");
		a[1] = new Address("1000 n 68","Fairfield","Iowa","52557");
		a[2] = new Address("68 w 8","Des Monnes","Iowa","52556");
		
		Trailer[] p1 = { new Trailer(a[0]), new Trailer(a[1]),	new Trailer(a[2]) };
		
		double cityTotalRentforTrailer = Admin.computeTrailerTotalRentInCity(Arrays.asList(p1), "Fairfield");		
		System.out.println("Fairfield city's total amount: "+cityTotalRentforTrailer);
	}
}
