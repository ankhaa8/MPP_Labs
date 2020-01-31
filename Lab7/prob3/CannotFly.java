package Lab7.prob3;

public interface CannotFly extends FlyBehavior {
	default public void fly() {
		System.out.println("  cannot fly");
	}

}
