package Lab7.prob3;

public interface MuteQuack extends QuackBehavior {
	default void quack() {
		System.out.println("  cannot quack");
	}

}
