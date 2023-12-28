package hw5;

public class HW5_2 {
	public void randAvg() {
		int r;
		int[] rArray = new int[10];
		int sum = 0;
		
		System.out.println("本次亂數結果：");
		
		for(int i = 0; i < 10; i++) {
			r = (int) (Math.random() * 101);
			rArray[i] = r;
			System.out.print(r + " ");
			sum += rArray[i];
		}
		System.out.println();
		System.out.print("平均值：" + (sum / rArray.length));
	}
	

}
