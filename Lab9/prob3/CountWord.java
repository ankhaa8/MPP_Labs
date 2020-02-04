package Lab9.prob3;

import java.util.Arrays;
import java.util.List;

public class CountWord {
	public static int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream()
				.filter(word -> word.contains(""+c) && !word.contains(""+d) && word.length() == len)
				.count();
	}

	public static void main(String[] args) {
//		QFunction<List<String>, Character, Character, Integer, Long> countWords 
//			= (words, c, d, len) -> words.stream()
//			.filter(word -> word.contains(""+c) && !word.contains(""+d) && word.length() == len)
//			.count();
// 		countWords.apply(list, 'J', 'c', 4)
		
		
		List<String> list = Arrays.asList("Java", "HTML", "JavaScript", "CSS", "JQuery");
		System.out.println(countWords(list, 'J', 'c', 4)); 			
	}

}
