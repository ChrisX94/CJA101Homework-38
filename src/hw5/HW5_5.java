package hw5;

import java.lang.reflect.Array;
import java.util.Scanner;

/*
身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
與數字的亂數組合，如圖
* 
* */

public class HW5_5 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the AuthCode Length: ");
//		int AuthCodeLen = sc.nextInt();
//		System.out.println(genAuthCode(AuthCodeLen));
		
//		for(int i = 0 ; i < 100; i++)
			System.out.println(genAuthCode(8));

	}
	
	public static String genAuthCode(int length) {
		int [] typeArr =  typeArr(length);
		String authCode = "";
		
		for(int i =0 ; i <typeArr.length; i++ ) {
			if (typeArr[i] == 0) {
				authCode += ((char)getRandNum());
			}else if(typeArr[i] == 1) {
				authCode += ((char)getRandLetterLower());
			}else {
				authCode += ((char)getRandLetterUpper());
			}
		}
		return authCode;
	}
	
	// 這裡先去決定每個字元的型別
	public static int[] typeArr(int len) {
		int[] TypeArr = new int[len];
		int zero, one, two; // 這三個變數用來計算每一個種字元的數量
		int randType;
		
		while (true) {
			zero=0; // 0 用數字
			one=0; // 1 用小寫
			two=0; // 2 用大寫
			for(int i =0; i < TypeArr.length; i++) {
				randType = getRandType();
				TypeArr[i] = randType;
				if(randType == 0) {
					zero++;
				}else if(randType == 1){
					one++;
				}else {
					two++;
				}
			}
			//這裡設定大小寫數字最少要有1才可以
			if(zero> 0 && one>0 && two > 0) 
				break;
		}
		return TypeArr;
	}
	

	// generate the random number in range 
	public static int getRandint(int minNum, int maxNum) {
		return (int) (minNum + (Math.random() * ((maxNum + 1) - minNum)));
	}
	
	// decide which char to use
	public static int getRandType() {
		return getRandint(0, 2);
	}
	
	// Unicode numbers
	public static int getRandNum() {
		return getRandint(48, 57);
	}
	// Unicode lower case
	public static int getRandLetterLower() {
		return getRandint(65, 90);
	}
	// Unicode upper case
	public static int getRandLetterUpper() {
		return getRandint(97, 112);
	}


}

// 48 - 57
// 65 - 90
// 97 - 122
// ((i >= 48 && i <= 57) || (i >= 65 && i <= 90) || (i >= 97 && i <= 122))