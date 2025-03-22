package hw5;

import java.util.Scanner;

// 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如圖：
public class HW5_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter the width and height: ");
		int width = sc.nextInt();
		int height = sc.nextInt();

		starSquare(width,height);

	}

	public static void starSquare(int width, int height) {
		int[] WidAndHei = { width, height };

		for (int i = 0; i < height; i++) {
			
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
