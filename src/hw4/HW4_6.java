package hw4;

public class HW4_6 {
	public static void main(String[] args) {
		int[][]exam = {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75},
				};
		int count1;
		int hs = 0;	
		int[] student = new int[8];
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 8; j++) {
					count1 = 0;
					for (int k = 0; k < 8; k++) {
						if(exam[i][j] > exam[i][k]) {
							count1 = count1 + 1;
							if (count1 == 7) {
								hs = j;
								student[hs] += 1;
							}
						}
					}
				}
				
			}
		System.out.println("1號同學考最高分次數=" + student[0]);
		System.out.println("2號同學考最高分次數=" + student[1]);
		System.out.println("3號同學考最高分次數=" + student[2]);
		System.out.println("4號同學考最高分次數=" + student[3]);
		System.out.println("5號同學考最高分次數=" + student[4]);
		System.out.println("6號同學考最高分次數=" + student[5]);
		System.out.println("7號同學考最高分次數=" + student[6]);
		System.out.println("8號同學考最高分次數=" + student[7]);
	}
}
