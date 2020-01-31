package Lab8.day2.prob4;

import java.util.Arrays;

public class MethodRef {

	public static void main(String[] args) {
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		Arrays.sort(names, String::compareToIgnoreCase);
		for(String s: names) System.out.println(s);
	}

}
