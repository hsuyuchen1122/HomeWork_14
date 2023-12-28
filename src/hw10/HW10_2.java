package hw10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HW10_2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double number = 0;
		
		while(true) {
			System.out.println("請輸入數字：");
			if(scanner.hasNextDouble()) {
				number = scanner.nextDouble();
				break;
		} else {
			System.out.println("數字格式不正確，請再輸入一次！");
			scanner.next();
		}
		}
		
			System.out.println("選擇要顯示的格式：");
            System.out.println("(1) 千分位");
            System.out.println("(2) 百分比");
            System.out.println("(3) 科學記號");
            
            int choose = scanner.nextInt();
            
            switch(choose) {
            case 1:
                formatWithThousandSeparator(number);
                break;
            case 2:
                formatAsPercentage(number);
                break;
            case 3:
                formatWithScientificNotation(number);
                break;
            default:
                System.out.println("無效的選擇。");
                break;
            }
			
		}
	
	private static void formatWithThousandSeparator(double number) {
		DecimalFormat formatter = new DecimalFormat("#,###");
		String formattedNumber = formatter.format(number);
		System.out.println("千分位表示：" + formattedNumber);
	}
	
	private static void formatAsPercentage(double number) {
		DecimalFormat formatter = new DecimalFormat("#%");
		String formattedNumber = formatter.format(number);
		System.out.println("百分比表示：" + formattedNumber);
	}
	private static void formatWithScientificNotation(double number) {
		DecimalFormat formatter = new DecimalFormat("0.###E0");
		String formattedNumber = formatter.format(number);
		System.out.println("科學記號表示：" + formattedNumber);
	}
}
