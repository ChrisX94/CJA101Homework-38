package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) throws Exception {
		Calculator cal = new Calculator();

		try {
			setpowerXY(cal); 
		} catch (InputMismatchException e) { // 出現InputMismatchException時呼叫setpowerXY
			setpowerXY(cal);
		} catch (CalException e) {  // 出現CalException時呼叫setpowerXY
			setpowerXY(cal);
		} catch (Exception e) { //出現Exception(除上述以外則拋出 Exception)
			e.printStackTrace();
		}
	}

	// 這裡設定 setpowerXY拋出 CalException 和 InputMismatchException, 並用用遞回方式呼叫自己,直到輸入到正確的引數將方法執行完才會停止
	public static void setpowerXY(Calculator cal) throws CalException, InputMismatchException {

		try {
			Scanner sc = new Scanner(System.in);
			int x, y;
			System.out.println("請輸入x的值:");
			x = sc.nextInt();
			cal.setX(x);
			System.out.println("請輸入y的值:");
			y = sc.nextInt();
			cal.setY(y);
			cal.powerXY(x, y);

		} catch (InputMismatchException e) {  // 出現InputMismatchException 印出輸入格式不正確再呼叫自己
			System.out.println("輸入格式不正確");
			setpowerXY(cal);
		} catch (CalException e) {
			System.out.println(e.getMessage()); // 出現CalException 印出輸錯誤內容再呼叫自己
			setpowerXY(cal);
		}
	}

}
