package hw3;

import java.util.Arrays;
import java.util.Scanner;

// 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果：
// 三條邊邊長皆不相等的三角形稱為不等邊三角形。, 等腰三角形是三條邊中有兩條邊相等, 三條邊邊長皆不相等的三角形稱為不等邊三角形。
// 三角形任意兩邊的和大於第三邊，任意兩邊的差小於第三邊。
public class HW3_1 {

	public static void main(String[] args) {
		int[] lengths = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("請輸入第" + (i + 1) + "個數字:");
			lengths[i] = sc.nextInt();
		}
		Arrays.sort(lengths);
		printArray(lengths);
		
		Boolean condition1 = testTriangle(lengths);
		testTriangle2(condition1,lengths);

	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// 三角形任意兩邊的和大於第三邊，任意兩邊的差小於第三邊。
	public static Boolean testTriangle(int[] array) {
		if ((array[2] > array[1] -array[0]) && (array[0] + array[1] > array[2])) {

			return true;
		} else {
			return false;
		}
	}
	
	public static void testTriangle2(Boolean condition1, int[] lengths) {
		if (condition1 == true) {
			if (lengths[0] == lengths[1] && lengths[0] == lengths[2]) {
				System.out.print("正三角形");
			} else if (lengths[0] == lengths[1] || lengths[0] == lengths[2] || lengths[0] == lengths[2]) {
				System.out.print("等腰三角形");
			} else if (lengths[0] != lengths[1] || lengths[0] != lengths[2] || lengths[0] != lengths[2]) {
				System.out.print("其它三角形");
			} else if (Arrays.binarySearch(lengths, 0) > 0) {
				System.out.print("不是三角形");
			} else {
				System.out.print("不是三角形");
			}
		}else {
			System.out.print("不是三角形");
		}
	}

}
