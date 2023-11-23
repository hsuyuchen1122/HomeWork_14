package hw4;

import java.util.Scanner;

public class HW4_5 {
	public static void main(String[] args) {
		int[] d1= {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner dsc = new Scanner(System.in);
		System.out.println("請輸入西元年(yyyy)=");
		int yy=dsc.nextInt();
		System.out.println("請輸入月(mm)=");
		int mm=dsc.nextInt();
		int dd;
		if (mm!=2) {
			System.out.println("請輸入日(dd)=");
			dd=dsc.nextInt();}
		else {
			for (dd=0; dd==0;) {
			System.out.println("請輸入日(dd)=");
			dd=dsc.nextInt();
			if(dd>28) {
				dd=0;
				System.out.println("2月日期應小於29日，請重新輸入");
			} else break;
			}
		}	
		int dnum = 0;
		for (int i=0;i<mm-1;i++) {
				dnum += d1[i];
			}
		dnum += dd;
		
		if(mm>2) {
			if((yy%4==0 && yy%100!=0)||yy%400==0) {
			dnum+=1;
		
		System.out.println("西元"+yy+"年，第"+ dnum +"天");
			}
		}
	}
}
