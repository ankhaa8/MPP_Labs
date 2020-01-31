package Lab7.prob2;

public class Rectangle implements Polygon {
	private double length, width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double[] getLengths() {
		double[] sideLength = new double[4];
		sideLength[0] = sideLength[2] = this.length;
		sideLength[1] = sideLength[3] = this.width;
		return sideLength;
	}
}
