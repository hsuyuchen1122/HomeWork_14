package hw4;

public class HW4_3 {
	public static void main(String[] args) {
		String[] s1 = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int aeiou = 0;
		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s1[i].length(); j++) {
				switch(s1[i].charAt(j)) {
				case 'a' :
						aeiou = aeiou + 1;
						break;
				case 'e' :
						aeiou = aeiou + 1;
						break;
				case 'i' :
						aeiou = aeiou + 1;
						break;
				case 'o' :
						aeiou = aeiou + 1;
						break;
				case 'u' :
						aeiou = aeiou + 1;
						break;
						
				}
			}
		}
		System.out.println("陣列共有"+aeiou+"個母音(a,e,i,o,u)");
	}

}
