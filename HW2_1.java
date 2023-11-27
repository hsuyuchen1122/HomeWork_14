package hw2;

public class HW2_1 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			int j = 1;
			while(j <= 9) {
				j++;
				System.out.print(i + "*" + j + "=" + i * j + "\t"); }
			System.out.println();
		}
		System.out.println("-------------------------");
		
		for(int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			    j++;
			}while(j <= 9);
			System.out.println();
	   }
		System.out.println("-------------------------");
		
		int i = 1;
		while(i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}while(j <= 9);
			System.out.println();
			
			i++;
		}

	}
}
