package hw5;

import java.util.Scanner;

public class HW5_1Test {
	public static void main(String[] args) {
		int height;
		int width;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入高度");
		height = sc.nextInt();
		System.out.println("請輸入寬度");
		width = sc.nextInt();
		
		HW5_1 h = new HW5_1();
		h.starSquare(height, width);
	}
}
