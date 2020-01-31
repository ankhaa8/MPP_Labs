package Lab7.prob2;

public interface Polygon extends ClosedCurve{
	default double computePerimeter() {
		double[] side = getLengths();
		double sum = 0;
		for(int i = 0; i < side.length; i++) {
			sum += side[i];
		}
		return sum;		
	}
	
	double[] getLengths();
}
