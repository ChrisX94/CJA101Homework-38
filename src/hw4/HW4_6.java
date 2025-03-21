package hw4;
/*
 * 班上有8位同學，他們進行了6次考試結果如下
 * 請算出每位同學考最高分的次數
 * */

public class HW4_6 {

	private static int[][] testResults = { { 10, 35, 40, 100, 90, 85, 75, 70 }
							, { 37, 75, 77, 89, 64, 75, 70, 95 }
							, {100, 70, 79 , 90, 75, 70, 79, 90}
							, {77, 95, 70, 89, 60, 75, 85, 89}
							, {98, 70, 89, 90, 75, 90, 89, 90}
							, {90, 80, 100, 75, 50, 20, 99, 75}};
	
	public static int getHighestScore(int[] score){
		int hightestScore=0;
		int student =0;
		for(int i =0; i < score.length; i++) {
			if(hightestScore< score[i]){
				hightestScore = score[i];
				student = i ;
			}
		}
//		System.out.println(hightestScore);
//		System.out.println(student);
		return student;
	}
	
	public static int[] studentResult(int[][] testResults){
		int[] highestCount = new int[8];
		
		for(int i = 0; i < testResults.length; i++){
			int bestStudentIndex = getHighestScore(testResults[i]);
			highestCount[bestStudentIndex]++ ;
		}
		return highestCount;
	}
	
	public static void main(String[] args) {
		int[] studentResult = studentResult(testResults);
		for(int i = 0; i < studentResult.length; i++) {
			int count = studentResult[i];
			int id = i+1;
			System.out.println(id + "號同學考最高分的次數: " + count + " 次");
		}
		
	}

}
