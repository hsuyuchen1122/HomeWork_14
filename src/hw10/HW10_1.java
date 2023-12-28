package hw10;

public class HW10_1 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			int randomNumber = getRandomNumber(1, 100);
			System.out.println("整數為：" + randomNumber);
			
			if(isPrime(randomNumber)) {
				System.out.println("質數");
		} else {
			System.out.println("不是質數");
		}
	}
}
	private static int getRandomNumber(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}
	
	private static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;

	}
}
