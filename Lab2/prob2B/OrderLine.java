package Lab2.prob2B;

public class OrderLine {
	private int linenum;
	private double price;
	private double quantity;
	OrderLine(int num, double p, double q, Order o){
		this.linenum = num;
		this.price = p;
		this.quantity = q;
	}
	
	@Override
	public String toString() {
		return "{OrderLine:  linenum = " + linenum + " price = " + price + " quantity = "+ quantity+"}";
	}
}
