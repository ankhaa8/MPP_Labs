package Lab5.prob2;

final public class Circle implements Figure {
	private double radius;

	Circle(double r) {
		radius = r;
	}

	@Override
	public double computeArea() {

		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}
}
