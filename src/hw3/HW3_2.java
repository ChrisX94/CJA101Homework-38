package hw3;

import java.util.Scanner;

// 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：
public class HW3_2 {

	public static void main(String[] args) {
		basic(9);
		advance(100);
	}

	public static int getRandomNumber(int maxNum) {
		return (int) (Math.random() * maxNum + 1);
	}

	public static void basic(int maxNumber) {
		Scanner sc = new Scanner(System.in);
		int randomNumber = getRandomNumber(maxNumber);
		int ans;
		int count = 1;

		while (true) {
			System.out.print("Guess a Number From 0 to " + maxNumber + " : ");
			ans = sc.nextInt();
			if ((ans < maxNumber || ans >= 0) && ans == randomNumber) {
				System.out.println("Correct!! the answer is: " + randomNumber + " (" + count + " attemps)");
				break;
			} else if (ans > maxNumber || ans < 0) {
				System.out.println("The Number " + ans + " is out of range, please re-enter again:");
			} else {
				System.out.print("Incorrect, please try again: ");
				count++;
			}
		}
	}

	public static void advance(int maxNumber) {
		Scanner sc = new Scanner(System.in);
		int randomNumber = getRandomNumber(maxNumber);
		int ans;
		int count = 1;

		while (true) {
			System.out.print("Guess a Number From 0 to " + maxNumber + " : ");
			ans = sc.nextInt();
			if ((ans <= maxNumber || ans >= 0) && ans == randomNumber) {
				System.out.println("Correct!! the answer is: " + randomNumber + " (" + count + " attemps)");
				break;
			} else if (ans > maxNumber || ans < 0) {
				System.out.println("The Number " + ans + " is out of range, please re-enter again:");
			} else if (ans > randomNumber) {
				System.out.println("Incorrect, " + ans + " is greater than the answer");
				count++;
			} else {
				System.out.println("Incorrect, " + ans + " is smaller than the answer");
				count++;
			}
		}
	}

}
