package Lab7.prob2;

public class EQTriangle implements Polygon{
	private double side;
	public EQTriangle(double s) {
		side = s;
	}
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double[] getLengths() {
		double[] sideLength = new double[3];
		sideLength[0] = sideLength[1] = sideLength[2] = this.side;
		return sideLength;
	}
	
}
