package hw1;

//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
public class HW1_4 {

	public static void main(String[] args) {
		final double PI = 3.1415;
		double radius = 5;
		double area = Math.pow(radius, 2) * PI;
		double circumference = radius * 2 * PI; 
		System.out.printf("圓面積: %.2f %n",area);
		System.out.printf("圓周長: %.2f %n",circumference);
	}

}
