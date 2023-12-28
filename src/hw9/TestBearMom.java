package hw9;

public class TestBearMom {
	public static void main(String[] args) {
		Mom mom = new Mom();
		Bear bear = new Bear(mom, 1000);
		MomDeposit momDeposit = new MomDeposit(mom, 2000);
		
		bear.start();
		momDeposit.start();
	}

}
