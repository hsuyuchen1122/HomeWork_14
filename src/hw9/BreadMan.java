package hw9;

import java.util.Random;

public class BreadMan implements Runnable{
	private String name;
	
	public BreadMan(String name) {
		this.name = name;
	}
	
	public void run() {
		try {
			System.out.println("-----大胃王快食比賽開始！------");
			for(int i = 1; i <= 10; i++) {
				eatBread(i);
				Thread.sleep(getRandomSleepTime());
			} 
			System.out.println("-----大胃王快食比賽結束！------");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void eatBread(int round) {
		System.out.println(name + "吃第" + round + "碗飯");
	}
	
	private int getRandomSleepTime() {
		return new Random().nextInt(2500) + 500;
	}

}

