package Lab9.prob5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		// Implement the code		
		return stream.limit(n+1).skip(m);

	}

	public static void main(String[] args) {
		System.out.println(streamSection(nextStream(), 0, 3).collect(Collectors.joining(", ")));
		System.out.println(streamSection(nextStream(), 1, 5).collect(Collectors.joining(", ")));
		System.out.println(streamSection(nextStream(), 6, 8).collect(Collectors.joining(", ")));
	}

	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}
