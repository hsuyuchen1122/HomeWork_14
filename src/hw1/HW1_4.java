package hw1;

public class HW1_4 {
	private static final double PI = 3.1415;
	public static void main(String[] args) {
		double radius = 5.0;
		double area = PI * radius *radius;
		double circunference = 2 * PI * radius;
		
		System.out.println("半徑為" + radius + "的圓面積為" + area);
		System.out.println("半徑為" + radius + "的圓周長為" + circunference);
	}
}
