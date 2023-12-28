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
		
		int[] student = new int[8];
		
			for (int i = 0; i < 6; i++) {
				int maxScore = exam[i][0];
				
				for (int j = 0; j < 8; j++) {
					if(exam[i][j] > maxScore) {
						maxScore = exam[i][j];
					}
				}
				
				for(int j = 0; j < 8; j++) {
					if(exam[i][j] == maxScore) {
						student[j]++;
					}
				}
			}
			
			for(int i = 0; i < 8; i++) {
				System.out.println((i + 1) + "號同學考最高分次數=" + student[i]);
			}
	}
}
