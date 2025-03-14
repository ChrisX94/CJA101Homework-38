package hw2;

/*
• 請建立一個TestNineNine.java程式，可輸出九九乘法表 
• 一：使用for迴圈+ while迴圈
• 二：使用for迴圈+ do while迴圈
• 三：使用while迴圈+ do while迴圈  
 */
public class HW2_8 {

	public static void main(String[] args) {
		int i, j;
		// 一：使用for迴圈+ while迴圈
		System.out.println("一：使用for迴圈+ while迴圈");
		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + '\t');
				j++;
			}
			System.out.println("");
		}

		// 二：使用for迴圈+ do while迴圈
		System.out.println("二：使用for迴圈+ do while迴圈");
		for (i = 1; i <= 9; i++) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + '\t');
				j++;
			} while (j <= 9);
			System.out.println("");
		}

		// 三：使用while迴圈+ do while迴圈
		System.out.println("三：使用while迴圈+ do while迴圈");
		i = 1;
		while (i <= 9) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + '\t');
				j++;
			} while (j <= 9);
			System.out.println("");
			i++;
		}

	}

}
