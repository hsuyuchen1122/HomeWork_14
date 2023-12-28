package hw7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class HW7_2 {
	public static void main(String[] args) {
		try(PrintWriter p = new PrintWriter(new FileWriter("Data.txt", true))){
			Random r = new Random();
			for(int i = 0; i < 10; i++) {
				int randomNumber =  r.nextInt(1000) + 1;
				System.out.println(randomNumber);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
