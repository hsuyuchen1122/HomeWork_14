package hw3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class HW3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }

        System.out.print("請輸入你不想要的數字（1 到 9）：");
        int unwantedNumber = scanner.nextInt();

        numbers.removeIf(number -> number % 10 == unwantedNumber);

        System.out.println("可以選擇的號碼有：" + numbers);
        System.out.println("總共有 " + numbers.size() + " 個號碼。");

    }
}
