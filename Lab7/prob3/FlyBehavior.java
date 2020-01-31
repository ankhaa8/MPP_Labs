package Lab7.prob3;

public interface FlyBehavior {
	default public void fly() {
		System.out.println("  flying");
	};
}
