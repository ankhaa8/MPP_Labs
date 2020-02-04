package Lab9.prob4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Square {
	public static void printSquares(int num) {
		IntStream n = IntStream
				.iterate(1, y->y+1)
				.map(y->y*y)
				.limit(num);
		
		String str = n.mapToObj(Integer::toString)
				.collect(Collectors.joining(", "));		
		
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		printSquares(4);
	}

}
