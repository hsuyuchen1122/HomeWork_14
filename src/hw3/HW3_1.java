package hw3;

import java.util.Scanner;

public class HW3_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		double a = input.nextDouble();
		System.out.println();
		double b = input.nextDouble();
		System.out.println();
		double c = input.nextDouble();
	
		
		if(a == b && a == c && b == c) {
			System.out.println("正三角形");
		}
		else if (a == b || b == c || c == a) {
			System.out.println("等腰三角形");
		}
		else if (a + b > c && b + c > a && a + c > b ) {
			System.out.println("其他三角形");
		}
		else {
			System.out.println("不是三角形");
		}
	}
}
