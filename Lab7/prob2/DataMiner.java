package Lab7.prob2;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
	List<ClosedCurve> objects = new ArrayList<>();
	public static void main(String[] args) {
		DataMiner dm = new DataMiner();
		dm.objects.add(new Rectangle(5,7));
		dm.objects.add(new Ellipse(1,3));
		dm.objects.add(new EQTriangle(9));
		dm.objects.add(new Circle(11));
		System.out.printf("%.2f",dm.computeAveragePerimeter());
	}
	
	//OO (good) way of performing computation
	public double computeAveragePerimeter() {
		if(objects == null || objects.isEmpty()) return 0.0;
		double sum = 0.0;
		for(int i = 0; i < objects.size(); ++i) {
			sum += objects.get(i).computePerimeter();
			//System.out.println(objects.get(i).computePerimeter());
		}
		return sum/objects.size();
	}

}
