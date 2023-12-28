package hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class HW7_3 {
	public static void copyFile(String firstPath, String secondPath){
		try (InputStream inputStream = new FileInputStream(firstPath);
			OutputStream outputStream = new FileOutputStream(secondPath)) {
			
			System.out.println("File copied successfully.");
		}catch (IOException e) {
			e.printStackTrace();
		}  
		
	}
	
	public static void main(String[] args) {
		String firstPath = "/Users/hsupinchieh/Desktop/path/first/file.txt";
		String secondPath = "/Users/hsupinchieh/Desktop/path/second/file_copy.txt";		
		
		copyFile(firstPath, secondPath);
	}

}
