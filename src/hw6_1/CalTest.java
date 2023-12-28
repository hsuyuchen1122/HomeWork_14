package hw6_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入x");
        x = sc.nextInt();
        System.out.println("請輸入y");
        y = sc.nextInt();
        
        Calculator c = null;
		try {
			c = new Calculator(x, y);
			c.setterxy(x, y);
			System.out.println(c.powerXY());
		} catch (CalException ca) {
			ca.printStackTrace();
        } finally {
            sc.close();
        }
    }
}