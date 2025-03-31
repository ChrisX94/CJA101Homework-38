package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

// 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用append功能讓每次執行結果都能被保存起來)

public class HW7_2 {

	public static void main(String[] args) {
		String numList = getNumList();
		System.out.println(numList);
		
		try {
			FileWriter fw = new FileWriter("./src/hw7/Data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println(numList);
			
			pw.close();
			bw.close();
			fw.close();
			
			
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

	
	public static String getNumList() {
		List<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int rand = RandNum.getRandint(1, 1000);
			numList.add(rand);
		}
		return numList.toString();
	}

}

class RandNum {
	public static int getRandint(int minNum, int maxNum) {
		return (int) (minNum + (Math.random() * ((maxNum + 1) - minNum)));

	}

}