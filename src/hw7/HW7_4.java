package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	String name;
	
	public Dog(String name) {
		this.name = name;
	}
}
class Cat implements Serializable {
	String name;
	
	public Cat(String name) {
		this.name = name;
	}
}
public class HW7_4 {
	public static void main (String[] args) {
		String directoryPath = "/Users/hsupinchieh/Desktop/data/";
		String fileName = "Object.ser";
		String filePath = directoryPath + fileName;
		
		Dog dog = new Dog("Willy");
		Cat cat = new Cat("Wendy");
		
		try {
			File directory = new File("/Users/hsupinchieh/Desktop/data/");
			if(! directory.exists() || !directory.isDirectory()) {
				directory.mkdirs();
			}
				
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))){
				outputStream.writeObject(dog);
				outputStream.writeObject(cat);
				
				System.out.println("物件成功寫入");
		} catch (IOException e) {
			e.printStackTrace();
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


