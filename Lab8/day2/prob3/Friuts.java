package Lab8.day2.prob3;

import java.util.Arrays;
import java.util.List;

public class Friuts {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple","Banana","Orange","Cherries","Blums");
		//a. Print the given list using forEach with Lambdas
		System.out.println("Lambda:");
		fruits.forEach(n->System.out.println(n));
		
		//b. Print the given list using method reference
		System.out.println("\nMethod reference:");
		fruits.forEach(System.out::println);
	}

}
