package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle m = new MyRectangle();
		m.setWidth(10);
		m.setDepth(20);
		
		System.out.println(m.getArea());
		
		
		System.out.println("===============");
		
		MyRectangle m1 = new MyRectangle(10, 20);
		
		System.out.println(m1.getArea());
	}
	
	
}
