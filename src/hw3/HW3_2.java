package hw3;

import java.util.Random;
import java.util.Scanner;

public class HW3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int lowerBound = 0;
		int upperBound = 9;
		int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
		
		System.out.println();
		
		while (true) {
			System.out.print("開始猜數字吧！（" + lowerBound + " 到 " + upperBound + "）：");
			int userGuess = scanner.nextInt();
			
			if (userGuess == randomNumber) {
				System.out.println("答對了！答案就是 " + randomNumber);
				break;
			}
			else {
				System.out.println("猜錯了！提示：答案比你猜的" + (userGuess < randomNumber ? "大" : "小"));
			}
		}
	}

}
