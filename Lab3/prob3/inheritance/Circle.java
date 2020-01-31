package Lab3.prob3.inheritance;

public class Circle extends Cylinder {
	public Circle(double radius) {
		super(radius, 0);
	}

	public double computeArea() {
		return getRadius() * getRadius() * Math.PI;
	}
}
