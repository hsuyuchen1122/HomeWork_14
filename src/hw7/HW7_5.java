package hw7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class HW7_5 {
	class Animal implements Serializable {
		public void speak() {
			System.out.println("Animal speaks");
		}
	}
	
	class Dog extends Animal {
		public void speak() {
			System.out.println("Dog");
		}
	}
	
	class Cat extends Animal {
		public void speak() {
			System.out.println("Cat");
		}
	}
	
	public class Object {
		public static void main(String[] args) {
			try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/Users/hsupinchieh/Desktop/data/Object.ser"))){
				for (int i = 0; i < 2; i++) {
					Animal animal = (Animal) inputStream.readObject();
					animal.speak();
				}
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}
