package hw8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTrain {
	public static void main(String[] args) {
		List<Train> list = new ArrayList();
		list.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		list.add(new Train(118, "自強", "高雄", "台北", 500));
		list.add(new Train(1288, "區間", "新竹", "基隆", 400));
		list.add(new Train(122, "自強", "台中", "花蓮", 600));
		list.add(new Train(1222, "區間", "樹林", "七堵", 300));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		//1.印出不重複的Train物件
		Set<Train> setTrain = new HashSet();
		Iterator<Train> t1 = list.iterator();
		while(t1.hasNext()) {
			setTrain.add(t1.next());
		}
		Iterator<Train> ts = setTrain.iterator();
		while(ts.hasNext()) {
			System.out.println(ts.next());
		}
		System.out.println("-------------------------------------------------------");
		
		//2.讓 Train 物件印出時，以班次編號由大到小印出
		Collections.sort(list, (train1, train2) -> Integer.compare(train2.getNumber(), train1.getNumber()));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//3.能讓班次編號由大排到小印出, 還可以不重複印出Train物件
		Collection<Train> treeSetTrain = new TreeSet<>(new TrainComparator());
		for(Train t : treeSetTrain) {
			System.out.println(t);
		}
	}
}
