package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* 請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
*  Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
*/

public class HW7_1 {
	public static void main(String[] arg) {
		String filePath = "./src/hw7/Sample.txt";
		int countChar = 0;
		int countLine = 0;
		File file = new File(filePath);
		try {

			FileReader fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);

			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				countLine++;
				countChar += str.length();

			}

			br.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(
				"\n" + file.getName() + "檔案共有" + file.length() + "個位元組，" + countChar + "個字元，" + countLine + "列資料");

	}

}
