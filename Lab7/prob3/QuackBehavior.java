package Lab7.prob3;

public interface QuackBehavior {
	default public void quack() {
		System.out.println("  quacking");
	}
}
