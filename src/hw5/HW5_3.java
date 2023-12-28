package hw5;

public class HW5_3 {
	public int maxElement(int[][] x) {
		int max = x[0][0];
		for(int[] row : x) {
			for(int element : row) {
				max = Math.max(max, element);
			}
		}
		return max;
	
	}
	public double maxElement(double[][] x) {
		double max = x[0][0];
		for(double[] row :x) {
			for(double element : row) {
				max = Math.max(max, element);
			}
		}
		return max;
	}

}
