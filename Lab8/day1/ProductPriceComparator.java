package Lab8.day1;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
	
	@Override
	public int compare(Product o1, Product o2) {
		return o1.getPrice().compareTo(o2.getPrice());
	}
}
