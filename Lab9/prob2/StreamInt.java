package Lab9.prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInt {

	public static void main(String[] args) {
		Stream<Integer> myIntStream = Stream.of(1,2,3,4,5);
		IntSummaryStatistics summary = myIntStream.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Max: "+summary.getMax()+" Min: "+summary.getMin());
	}

}
