package Lab5.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Figure> l = new ArrayList<Figure>();
		l.add(new Rectangle(15, 18));
		l.add(new Circle(17));
		l.add(new Triangle(10, 13));

		double sum = 0.0;
		for (int i = 0; i < l.size(); i++)
			sum += l.get(i).computeArea();

		System.out.println("Sum of areas:" + sum);

	}

}
