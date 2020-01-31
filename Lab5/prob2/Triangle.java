package Lab5.prob2;

final public class Triangle implements Figure {
	private double base;
	private double height;

	Triangle(double b, double h) {
		base = b;
		height = h;
	}

	@Override
	public double computeArea() {
		return 1/2 * base * height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

}
