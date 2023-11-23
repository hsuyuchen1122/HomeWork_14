package hw1;

public class HW1_6 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 5;
		System.out.println(num1 + num2);
		//5 + 5 為兩個整數相加,因此會得到 5 + 5 = 10.
		
		char myChar = '5';
	    System.out.println(num1 + myChar);
		//5 +'5'是整數加字元,會將'5'轉換成相應的數字,進行相加.
	    //在ASCII編碼中,字元'5'的十進位是53,因此會表達式為5 + 53 = 58.
	    
	    String myString = "5";
	    System.out.println(num1 + myString);
	    //5 + "5"是整數加字串,字串不會和整數相加,會進行字串連接,因此5 + "5" 的結果會是字串"55".
	}
}
