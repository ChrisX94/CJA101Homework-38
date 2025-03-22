package hw5;

import java.util.Arrays;

// 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

public class HW5_2 {

	public static void main(String[] args) {
		randAvg();

	}
	
	public static void randAvg() {
		int sum = 0;
		int randNum; 
		for(int i = 0; i < 10; i++) {
			randNum = getRandint();
			sum += randNum;	
			System.out.print(randNum + " ");
		}
		double avg = sum/10.0;
		System.out.println("\nAverage is: " + avg);
	}
	
	
	public static void randAvgWithoutDuplicated() {
		int[] pickedNumbers = new int[10]; 
		
		for(int i = 0 ; i < pickedNumbers.length; i++)
			pickedNumbers[i] = -1;
		
		int index = 0;
		int randNum;
		int[] check = new int[10];
		
		while(index < 10) {
			randNum = getRandint();
			check = Arrays.copyOf(pickedNumbers, 10);
			Arrays.sort(check);
			if(Arrays.binarySearch(check, randNum) < 0) {
				pickedNumbers[index] = randNum;
				index++;			
			}
		}
		double avg=0;
		for(int i : pickedNumbers) {
			System.out.print(i + " ");
			avg += i;
		}
		avg = avg/pickedNumbers.length;
		System.out.println("\n Average is: " + avg);
		
	}


	public static int getRandint() {
		return (int)(Math.random() *101);
	}
	

}
