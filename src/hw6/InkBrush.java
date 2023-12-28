package hw6;

public class InkBrush extends Pen {
	public InkBrush() {
		super();
	}
	
	public InkBrush(String brand, double price) {
		super(brand, price);
	}
	
	public void write() {
		System.out.println("Dip the ink brush in ink and then write.");
	}
	
	protected double getDiscountedPrice() {
		return 0.9 * getPrice();
	}
}
