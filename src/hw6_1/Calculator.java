package hw6_1;

public class Calculator {
	private int x = 0;
	private int y = 0;
	
	Calculator(int x, int y) throws CalException {
		setterxy(x, y);
	}
	public void setterxy(int x, int y) throws CalException{
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		}
		else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		}
		else {
			setterx(x);
			settery(y);
		}
	}
	public void setterx(int x) {
		this.x = x;
	}
	public void settery(int y) {
		this.y = y;
	}
	public int getterx() {
		return x;
	}
	public int gettery() {
		return y;
	}
	public double powerXY() {
		double ans;
		ans = Math.pow(x, y); 
		return ans;
	}
}
