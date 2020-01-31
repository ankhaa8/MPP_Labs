package Lab8.day2.prob2;

import java.util.function.Supplier;

public class MethodReference {
	public static void main(String[] args) {
		Supplier<Double> supp= Math::random;
		System.out.println(supp.get());

	}

}
