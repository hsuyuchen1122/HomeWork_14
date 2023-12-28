package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HW8_1 {
	public static void main(String[] args) {
		Collection list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		//1.印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		//Iterator
		Iterator r1 = list.iterator();
		while(r1.hasNext()) {
			System.out.print(r1.next() + " ");
		}
		System.out.println();
		
		//傳統for
		for(int i = 0; i < list.size(); i++) {
			System.out.print(((ArrayList)list).get(i) + " ");
		}
		System.out.println();
		
		//foreach
		for(Object r2 : list) {
			System.out.print(r2 + " ");
		}
		System.out.println();
		
		//2.移除不是java.lang.Number相關的物件
		Set<Number> listNumOnly = new HashSet();
		Iterator<Object> r3 = list.iterator();
		
		while(r3.hasNext()) {
			Object value = r3.next();
			if(value instanceof Number) {
				listNumOnly.add((Number) value);
			}
		}
		System.out.println("數字只有：" + listNumOnly);
		
		//3.再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
		for(Object r4 : listNumOnly) {
			System.out.print(r4 + " ");
		}
		System.out.println();
	}
}
