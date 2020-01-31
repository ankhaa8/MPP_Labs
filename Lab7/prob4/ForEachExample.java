package Lab7.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		//implement a Consumer
		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String arg0) {
				System.out.println(arg0.toUpperCase());				
			}			
		};
		
		list.forEach(con);
		
	}
	
	
	
	
}