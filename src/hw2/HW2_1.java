package hw2;

// 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)

public class HW2_1 {

	public static void main(String[] args) {
		int i;
		int sum =0;
		
		// method 1
		for(i =0; i <= 1000; i++) {
			if(i%2 == 0 && i !=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
		// method 2
		sum = 0;
		for(i=0; i <= 1000; i+=2) {
			sum += i;
		}
		System.out.println(sum);
	}

}
