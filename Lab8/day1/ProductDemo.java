package Lab8.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductDemo {
	static enum SortMethod {
		BYPRICE, BYTITLE
	};

	public static void sort(List<Product> product, final SortMethod method) {
		class ProductComparator implements Comparator<Product> {
			@Override
			public int compare(Product p1, Product p2) {
				if (method == SortMethod.BYPRICE) {
					return p1.getPrice().compareTo(p2.getPrice());
				} else {
					return p1.getTitle().compareTo(p2.getTitle());
				}
			}
		}
		Collections.sort(product, new ProductComparator());
	}

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("IPhone", 2500.0, 10));
		list.add(new Product("HUAWEI", 2100.0, 6));
		list.add(new Product("IPhone", 1800.0, 8));
		list.add(new Product("IPhone", 1900.0, 9));
		list.add(new Product("Samsung", 1500.0, 10));

		// a. Sort by implementing a comparator for price attribute and print product list.
		Collections.sort(list, new ProductPriceComparator());
		System.out.println("a. Sort by price: "+list);

		// b. Sort by implementing a comparator for title attribute and print product list
		Collections.sort(list, new ProductTitleComparator());
		System.out.println("b. Sort by title: "+list);

		// c. Implement the sort method so that only one type of Comparator is used for the task a & b in a Java 7 Way using closure.
		sort(list,SortMethod.BYPRICE);
		System.out.println("c. Sort method: BYPRICE "+list);
		sort(list,SortMethod.BYTITLE);
		System.out.println("c. Sort method: BYTITLE "+list);
		
		// d. If the title is same use model as another attribute to sort. Do this by using lambdas.(Java 8 Way)
		Collections.sort(list,(p1, p2) -> {
			if(p2.getTitle().compareTo(p1.getTitle()) == 0) 
				return p1.getModel() - p2.getModel();
			else 
				return p1.getTitle().compareTo(p2.getTitle());
			});
		System.out.println("d. Sort by title and model: "+list);
		
	}
}
