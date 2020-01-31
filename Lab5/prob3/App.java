package Lab5.prob3;

public class App {

	public static void main(String[] args) {
		Vehicle v = VehicleFactory.getVehicle("Bus");
		v.startEngine();
		
		v = VehicleFactory.getVehicle("Car");
		v.startEngine();

	}

}
