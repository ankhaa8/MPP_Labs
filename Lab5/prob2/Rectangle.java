package Lab5.prob2;

final public class Rectangle implements Figure{
	private double width;
	private double height;

	Rectangle(double w, double l) {
		width = w;
		height = l;
	}
	
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return height;
	}

	@Override
	public double computeArea() {		
		return width * height;
	}
}
