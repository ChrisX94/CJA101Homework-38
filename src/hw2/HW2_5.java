package hw2;
// 阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式， 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

public class HW2_5 {

	public static void main(String[] args) {
		int number = 1;
		int count = 0;
		// 40 後面直接不用去計算
		for(;number<=39; number++) {
			if(number% 10 !=4){
				System.out.print(number + " ");
				count+=1;
			}
			
		}
		System.out.println("\n可以選擇的數字有 " + count + " 個");
	}

}
