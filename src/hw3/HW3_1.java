package hw3;

import java.util.Scanner;

public class HW3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] i = new int[3];
		System.out.println("請輸入三邊長：");
		i[0] = sc.nextInt();
		i[1] = sc.nextInt();
		i[2] = sc.nextInt();
		
		if(i[0] * i[1] * i[2] != 0) {
			if(i[0] == i[1] && i[1] == i[2]) {
				System.out.println("正三角形");	
			}
			else if(i[0] == i[1] || i[0] == i[2] || i[1] == i[2]) {
				System.out.println("等腰三角形");
			}
			else if(i[0] + i[1] > i[2] && i[1] + i[2] > i[0] && i[0] + i[2] > i[1]) {
				System.out.println("其他三角形");
			}
			else {
				System.out.println("不是三角形");
			}
		}
		
		
		
	}

}
