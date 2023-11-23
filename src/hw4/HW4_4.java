package hw4;

import java.util.Scanner;

public class HW4_4 {
	public static void main(String[] args) {
		int[][] s1 = { {25, 32, 8, 19, 27}, {2500, 800, 500, 1000, 1200} };
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入小文欲借的金額=");
		int m1 = sc.nextInt();
		System.out.println("有錢可借的員工編號:");
		for (int i = 0; i < s1[1].length; i++) {
			if(m1 <= s1[1][i]) {
				count += 1;
				System.out.print(s1[0][i]+"  ");
			}	
				
		}
		System.out.print("共"+count+"人！");
		System.out.println();
	}

}
