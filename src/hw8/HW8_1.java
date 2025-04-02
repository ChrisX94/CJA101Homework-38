package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/*
 * 請建立一個Collection物件並將以下資料加入：
 * Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、Object物件、“Snoopy”、BigInteger(“1000”)
 * 
 *  • 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
 *  • 移除不是java.lang.Number相關的物件
 *  • 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
 * 
 * */
public class HW8_1 {

	public static void main(String[] arg) {
		List<Object> list = new ArrayList<>();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add(new String("Kitty"));
		list.add(new Integer(100));
		list.add(new Object());
		list.add(new String("Snoopy"));
		list.add(new BigInteger("1000"));

		iterate(list);

		for (int i = 0; i < list.size(); i++) {
			if (!(list.get(i) instanceof Number)) {
				list.remove(i);
				i--; // 這裡是遇到非Number相關index要-1因為原本位置的被移除了後面的會補上來
			}
		}

		System.out.println("移除非Number相關");
		
		iterate(list);
	}

	public static void iterate(List<Object> list) {
		 System.out.println("Iterator");
		Iterator<Object> objs = list.iterator();
		while (objs.hasNext())
			System.out.print(objs.next() + " ");

		System.out.println("\nfor loop");
		// 傳統for
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");

		System.out.println("\nforeach");


		for (Object e : list)
			System.out.print(e + " ");

		System.out.println("\nforEach with Lambda");

		// forEach with Lambda
		list.forEach(e -> System.out.print(e + " "));

		System.out.println();
	}

}
