package hw6;

public class Pencil extends Pen {
    public Pencil() {
		super();
	}
	
	public Pencil(String brand, double price) {
		super(brand, price);
	}
	
	public void write() {
		System.out.println("Use pencil to write.");
	}
	protected double getDiscountedPrice() {
		return 0.8 * getPrice();
	}
}