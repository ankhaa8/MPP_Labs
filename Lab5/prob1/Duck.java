package Lab5.prob1;

public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;

	abstract public void display();

	public void fly() {
		flyBehavior.fly();
	}

	public void quack() {
		quackBehavior.quack();
	}

	protected void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	protected void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	public void swim() {
		System.out.println("  swimming");
	}

}
