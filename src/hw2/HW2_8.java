package hw2;

public class HW2_8 {
	public static void main(String[] args) {
		char currentChar = 'A';
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(currentChar);
			}
			System.out.println();
			currentChar++;
		}
	}

}
