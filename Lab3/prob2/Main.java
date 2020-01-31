package Lab3.prob2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Apartment[] apartments1 = {new Apartment(700), new Apartment(680), new Apartment(620)}; 
		Apartment[] apartments2 = {new Apartment(550), new Apartment(350)};
		Apartment[] apartments3 = {new Apartment(800), new Apartment(950), new Apartment(850)};
		
		Building[] buildings1 = { 
				new Building(700, Arrays.asList(apartments1)),
				new Building(300, Arrays.asList(apartments2))
		};
		
		Building[] buildings2 = { 
				new Building(500, Arrays.asList(apartments3))
		};
		
		Landlord ld1 = new Landlord(Arrays.asList(buildings1));		
		Landlord ld2 = new Landlord(Arrays.asList(buildings2));
		
		System.out.println("LandLord1===========>" + ld1);
		System.out.println("Profit: " + ld1.calculatesProfit() +"\n");
		System.out.println("LandLord2===========>" + ld2);
		System.out.println("Profit: " + ld2.calculateProfit());

	}
	
	
}
