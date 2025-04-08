package hw9;

/*
*	• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
*	• 每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
*	Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
*	• 參考範例：CounterRunnable.java
*	• 需留意主執行緒執行順序
*/

public class HW9_1 {

	public static void main(String[] args) {
		Eater p1 = new Eater("饅頭人");
		Thread player1 = new Thread(p1);
		

		Eater p2 = new Eater("詹姆士");
		Thread player2 = new Thread(p2);
		
		player1.start();
		player2.start();
		
	}

}

class Eater implements Runnable {
	private int count = 0;
	private String name;
	// 實體變數觀察每次隨機數固定的變化
	int randSleepTime = RandNum.getRandint(500, 3000);
	public Eater() {
	};
	
	public Eater(String name) {
		this.name = name;
	}

	public void run() {
		
		while (count <= 20) {
			
			System.out.println(name + "吃第" + count + "碗飯");
			count++;
			try {
				// 區域變數觀察每次隨機不同的變化
//				int randSleepTime = RandNum.getRandint(500, 3000);
				System.out.println(randSleepTime);
//				Thread.sleep(randSleepTime);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class RandNum {
	public static int getRandint(int minNum, int maxNum) {
		return (int) (minNum + (Math.random() * ((maxNum + 1) - minNum)));

	}
}
