package Lab7.prob2;

public class Ellipse implements ClosedCurve{
	private double semiaxis;
	private double elateral;
	
	Ellipse(double a, double E ){
		semiaxis = a;
		elateral = E;
	}
	public double getSemiaxis() {
		return semiaxis;
	}
	public void setSemiaxis(double semiaxis) {
		this.semiaxis = semiaxis;
	}
	public double getElateral() {
		return elateral;
	}
	public void setElateral(double elateral) {
		this.elateral = elateral;
	}
	@Override
	public double computePerimeter() {
		return 4 *semiaxis* elateral;
	}
	
}
