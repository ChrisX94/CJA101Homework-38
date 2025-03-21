package hw4;

// • 有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

public class HW4_1 {
	
	static int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
	
	public static double avg(int[] array) {
		int sum = 0;
		for (int i=0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum/array.length;
		
	}
	
	public static void main(String[] args) {
		
		double avg = avg(array);
		System.out.println("陣列所有元素的平均值: " +avg);
		System.out.println("元素大於平均值: " +avg);
		for(int i = 0; i < array.length ; i++) {
			if(array[i] > avg) {
				System.out.print(array[i]+ "\t");
			}
		}


	
	}
	
	
	
	

}
