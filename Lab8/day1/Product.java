package Lab8.day1;

public class Product {
	final String title;
	final double price;
	final int model;

	public int getModel() {
		return model;
	}
	
	public String getTitle() {
		return title;
	}

	public Double getPrice() {
		return price;
	}
	
	public Product(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		return String.format("\n %s : %s : %s", title, price, model);
	}
}
