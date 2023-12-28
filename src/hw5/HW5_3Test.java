package hw5;

public class HW5_3Test {
	public static void main(String[] args) {
		int[][] intArray = {
				{1, 6, 3},
				{9, 5, 2}
		};
		
		double[][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
		};
		System.out.println("兩個二維陣列的最大值回傳：");
		HW5_3 h = new HW5_3();
		System.out.println(h.maxElement(intArray));
		System.out.println(h.maxElement(doubleArray));
		
		}
}

