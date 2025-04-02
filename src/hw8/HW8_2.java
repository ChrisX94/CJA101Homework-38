package hw8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*請設計一個Train類別，並包含以下屬性：- 班次number，型別為int-車種type，型別為String-出發地start，型別為String- 目的地dest，型別為String-票價price，型別為double
 * 請寫一隻程式，能印出不重複的Train物件
 * 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
 * 承上，不僅能讓班次編號由大排到小印出，還可以不重複印出Train物件
 * (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)
 * */

public class HW8_2 {

	public static void main(String[] args) {
		// 請寫一隻程式，能印出不重複的Train物件
		Set<Train> trainHashSet = getTrainHashSet();
		iterator(trainHashSet);

		// 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出(含重複)
		List<Train> trainList = getTrainList();
		Collections.sort(trainList); // sort
		iterator(trainList);

		// 不僅能讓班次編號由大排到小印出，還可以不重複印出Train物件
		Set<Train> trainTreeSet = getTrainTreeSet();
		iterator(trainTreeSet);

	}

	public static void iterator(Set<Train> set) {
		System.out.println("Iterator");
		Iterator<Train> s = set.iterator();
		while (s.hasNext()) {
			s.next().showInfo();
		}

		System.out.println("ForEach");
		for (Train t : set)
			t.showInfo();

		System.out.println("Lambda");
		set.forEach(t -> t.showInfo());

	}

	public static void iterator(List<Train> list) {
		System.out.println("Iterator");
		Iterator<Train> s = list.iterator();
		while (s.hasNext()) {
			s.next().showInfo();
		}

		System.out.println("ForEach");
		for (Train t : list)
			t.showInfo();

		System.out.println("Lambda");
		list.forEach(t -> t.showInfo());

		System.out.println("for loop");
		for (int i = 0; i < list.size(); i++)
			list.get(i).showInfo();

	}

	public static Set<Train> getTrainHashSet() {
		Set<Train> trainHashSet = new HashSet<>();
		trainHashSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainHashSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainHashSet.add(new Train(118, "自強", "高雄", "台北", 500));
		trainHashSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainHashSet.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainHashSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainHashSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
		return trainHashSet;
	}

	public static Set<Train> getTrainTreeSet() {
		Set<Train> trainTreeSet = new TreeSet<>();
		trainTreeSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainTreeSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainTreeSet.add(new Train(118, "自強", "高雄", "台北", 500));
		trainTreeSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainTreeSet.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainTreeSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainTreeSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
		return trainTreeSet;
	}

	public static List<Train> getTrainList() {
		List<Train> trainList = new ArrayList<>();
		trainList.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainList.add(new Train(118, "自強", "高雄", "台北", 500));
		trainList.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainList.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainList.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
		return trainList;
	}

}
