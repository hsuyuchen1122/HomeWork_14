package hw1;

public class HW1_2 {
	public static void main(String[] args) {
		int totalEggs = 200;
		int eggsPerDozen = 12;
		
		int dozens = totalEggs / eggsPerDozen;
		int eggs = totalEggs % eggsPerDozen;
		
		System.out.println(totalEggs + "顆蛋共是" + dozens + "打" + eggs + "顆");			
	}
}