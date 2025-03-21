package hw4;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
 * 例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
 * 需將閏年條件加入
 * 擋下錯誤輸入：例如月份輸入為2，則日期不該超過29
 *１.不可被4整除者為平年。
  ２.可被4整除且不為100整除者為閏年。
  ３.可被400整除為閏年。
  ４.可被1000整除為閏年
 * */

public class HW4_5 {

	public static void main(String[] args) {

		int[] dateArr = getDateArr();
		int dayOfYear = dayOfYear(dateArr);
		String dateStr = dateArr[0] + "-" + dateArr[1] + "-" + dateArr[2];
		System.out.println("輸入的日期: " + dateStr + " 為該年第 " + dayOfYear + " 天");
	}

	public static int[] getDateArr() {
		Scanner sc = new Scanner(System.in);
		int[] dateList = new int[3];
		System.out.print("輸入西元yyyy年: ");
		int year = sc.nextInt();
		System.out.print("\n輸入mm月: ");
		int month = sc.nextInt() - 1;
		System.out.print("\n輸入dd日: ");
		int day = sc.nextInt();

		boolean leapYear = false;

		if (year % 100 == 0 && year % 400 != 0 && year % 1000 != 0) {
			leapYear = false;
		} else if (year % 4 != 0) {
			leapYear = false;
		} else {
			leapYear = true;
		}
		
		if(leapYear == true)
			System.out.println(year + " 年是閏年");
		else
			System.out.println(year + " 年是平年");
		
		boolean dayCondition = false;
		while (dayCondition == false) {
			if (month == 1 && day >= 30) {
				System.out.println("2月沒有超過29號");
				System.out.print("輸入dd日: ");
				day = sc.nextInt();
			} else if (month == 1 && day >= 29 && leapYear == false) {
				System.out.println(year + "是平年, 2月沒有超過28號");
				System.out.print("輸入dd日: ");
				day = sc.nextInt();
			} else if ((month == 3 || month == 5 || month == 9 || month == 10) && day >= 31) {
				System.out.println(month + "月沒有超過30號");
				System.out.print("輸入dd日: ");
				day = sc.nextInt();
			} else if (day > 31) {
				System.out.println(month + "月沒有超過31號");
				System.out.print("輸入dd日: ");
				day = sc.nextInt();
			} else {
				dayCondition = true;
			}
		}

		dateList[0] = year;
		dateList[1] = month;
		dateList[2] = day;
		return dateList;
	}

	public static int dayOfYear(int[] dateArr) {
		Calendar date = Calendar.getInstance();
		date.set(dateArr[0], dateArr[1], dateArr[2]);
		return date.get(date.DAY_OF_YEAR);

	}

}
