package hw1;

public class HW1_3 {
	public static void main(String[] args) {
		int totalSeconds = 256559;
		int days = totalSeconds / (24 * 3600);
		int remainingSeconds = totalSeconds % (24 * 3600);
		remainingSeconds %= 3600;
		int hours = remainingSeconds / 3600;
		int minutes = remainingSeconds / 60;
		int seconds = remainingSeconds % 60;
		
		System.out.println(totalSeconds + "秒為" + days + "天" + hours + "小時" + minutes + "分鐘" + seconds + "秒");
	}
}
