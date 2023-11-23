package hw2;

public class HW2_6 {
	public static void main(String[] args) {
		int count = 0;
		
		System.out.print(" ");
		
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != 4 && i / 10 != 4) {
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.println(" " + count + " ");
	}

}
