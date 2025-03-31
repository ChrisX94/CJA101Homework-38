package hw4;

import java.util.Scanner;

// 請建立一個字串，經過程式執行後，輸入結果是反過來的
// 例如String s = “Hello World”，執行結果即為dlroW olleH
public class HW4_2 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter text: ");
		String text = sc.nextLine();
		StringBuffer stringBuffer = new StringBuffer(text);
		
		System.out.println("\n" + stringBuffer.reverse());
		

	}
	
}
