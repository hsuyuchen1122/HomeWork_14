package hw1;

public class HW1_5 {
	public static void main(String[] args) {
		double principal = 1500000;
		double rate = 0.02;
		int compounding = 1;
		int years = 10;
		double amount = principal * Math.pow(1 + rate / compounding ,compounding * years);
		System.out.println("10年後的本金加利息總額" + amount);
	}
}
