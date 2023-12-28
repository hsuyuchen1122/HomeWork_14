package hw9;

public class TestGame {
	public static void main(String[] args) {
		BreadMan breadMan = new BreadMan("饅頭人");
		Thread breadManThread = new Thread(breadMan);
		
		BreadMan james = new BreadMan("詹姆士");
		Thread jamesThread = new Thread(james);
		
		breadManThread.start();
		jamesThread.start();
		
		while(true) {
			if(!breadManThread.isAlive()) {
				System.out.println("饅頭人吃完了！");
				break;
			}
			
			if(!jamesThread.isAlive()) {
				System.out.println("詹姆士吃完了！");
				break;
			}
		}
	}
}
