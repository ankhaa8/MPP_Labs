package Lab10.prob2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class SecondSmallest {
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
		T first = list.get(0);
		T second = list.get(1);
		if(first.compareTo(second)>0) {
			T temp = first;
			first = second;
			second = temp;
		}
		for(int i = 2; i < list.size(); i++) {
			T next = list.get(i);
			if(next.compareTo(first) < 0) {
				second = first;
				first = next;
			}
			else if(next.compareTo(second)<0) {
				second = next;
			}
			
		}		
		return second;
		
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4,5);
		System.out.println(secondSmallest(list));
		
		List<LocalDate> dlist = Arrays.asList(LocalDate.of(2019, 2, 3), LocalDate.of(2018,2,3), LocalDate.of(2020, 2, 3));
		System.out.println(secondSmallest(dlist));
		
		List<String> slist = Arrays.asList("Tom", "John", "Smith");
		System.out.println(secondSmallest(slist));
	}

}
