package hw10;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HW10_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入日期(年月日，例如: 20110131):");
		String userInput = scanner.nextLine();
		
		if(isValidDate(userInput)) {
			try {
				SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");
				Date date = inputFormat.parse(userInput);
				
				System.out.println("選擇要顯示的日期格式:");
				System.out.println("(1) 年/月/日");
                System.out.println("(2) 月/日/年");
                System.out.println("(3) 日/月/年");
				
                System.out.print("請輸入選擇(1/2/3): ");
                
                int choose = scanner.nextInt();
                
                switch(choose) {
                case 1:
                	displayFormattedDate(date, "yyyy/MM/dd");
                	break;
                	
                case 2:	
                	displayFormattedDate(date, "MM/dd/yyyy");
                	break;
                	
                case 3:
                	displayFormattedDate(date, "dd/MM/yyyy");
                	break;
                default:
                	System.out.println("無效的選擇");
                	break;
                	
                }
			} catch(ParseException e) {
				System.out.println("日期解析錯誤，請重新執行並輸入有效日期。");
			}
		} else {
			System.out.println("日期格式不正確，請再輸入一次！");
		}
	}

	
	private static void displayFormattedDate(Date date, String format) {
		SimpleDateFormat outputFormat = new SimpleDateFormat(format);
		String formattedDate = outputFormat.format(date);
		System.out.println("格式化日期為：" + formattedDate);
		}


	private static boolean isValidDate(String input) {
		return Pattern.matches("^\\d{8}$", input);
	}
}
