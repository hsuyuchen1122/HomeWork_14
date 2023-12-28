package hw5;

public class HW5_5 {
	public void getAuthCode() {
		char[] code = new char[8];
		int n;
		for(int i = 0; i < code.length; i++) {
			while(true) {
				n = (int)(Math.random() * 75) + 48;
				if((47 < n && n < 58) || (64 < n && n < 91) || (96 < n && n < 123)) {
					code[i] = (char) n;
					System.out.print(code[i]);
					break;
				}
			}
		}
	}

}
