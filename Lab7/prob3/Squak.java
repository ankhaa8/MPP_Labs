package Lab7.prob3;

public interface Squak extends QuackBehavior {
	default void quack() {
		System.out.println("  squeaking");
	}
	
}
