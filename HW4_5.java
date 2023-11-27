package hw4;

import java.util.Scanner;

public class HW4_5 {
	public static void main(String[] args) {
		int[] d1 = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner dsc = new Scanner(System.in);
		
		System.out.println("請輸入西元年(yyyy)=");
		int year = dsc.nextInt();
		System.out.println("請輸入月(mm)=");
		int month = dsc.nextInt();
		
		int day;
		if (month != 2) {
			System.out.println("請輸入日(dd)=");
			day = dsc.nextInt();
		} else {
			for (day = 0; day == 0;) {
			System.out.println("請輸入日(dd)=");
			day = dsc.nextInt();
			if(day > 28) {
				day = 0;
				System.out.println("2月日期應小於29日，請重新輸入");
			} else break;
			}
		}	
		
		int dnum = 0;
		for (int i = 0; i < month -1; i++) {
				dnum += d1[i];
			}
		dnum += day;
		
		if(month > 2) {
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			dnum += 1;
		
		System.out.println("西元" + year + "年，第" + dnum + "天");
			}
		}
	}
}
