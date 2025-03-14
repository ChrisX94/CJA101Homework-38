package hw1;

// 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
public class HW1_2 {
	public static void main(String[] args) {
		int dozen = 200 / 12; 
		int separated =  200 % 12;
		
		System.out.println("200顆蛋是" + dozen + "打"+ separated +"顆");
	}

}
