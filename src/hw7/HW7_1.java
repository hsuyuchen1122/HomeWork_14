package hw7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HW7_1 {
	public static void main(String[] args) {
		String filePath = "Sample.txt";
		
		try (BufferedReader r = new BufferedReader(new FileReader(filePath))){
			String line;
			int byteCount = 0;
			int charCount = 0;
			int lineCount = 0;
			while((line = r.readLine()) != null) {
				byteCount += line.getBytes().length;
                charCount += line.length();
                lineCount++;
			}
			
			System.out.println(filePath + "檔案共有" + byteCount + "個位元數" + charCount + "個字元" + lineCount + "列資料");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
