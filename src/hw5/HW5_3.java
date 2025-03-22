package hw5;

// 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳，如圖： 

public class HW5_3 {
	
	
	public static void main(String[] args) {
		HW5_3 w = new HW5_3();
		
		int[][]intArr = w.intArr(10,10);
		
		double[][] doubleArr = w.doubleArr(10,10);

		System.out.println("Max int is " + w.maxElement(intArr));

		System.out.println("Max Double is " + w.maxElement(doubleArr));
	}

	public int maxElement(int[][] arr) {
		int MaxNumber = arr[0][0];
		for (int[] outter : arr) {
			for (int inner : outter) {
				if (inner > MaxNumber) {
					MaxNumber = inner;
				}
			}
		}
		return MaxNumber;
	}

	public double maxElement(double[][] arr) {
		double MaxNumber = arr[0][0];
		for (double[] outter : arr) {
			for (double inner : outter) {
				if (inner > MaxNumber) {
					MaxNumber = inner;
				}
			}
		}
		return MaxNumber;
	}
	
	
	public int[][]intArr(int outter, int inner){
		int[][] intArr = new int[outter][inner];
		for(int i = 0; i < intArr.length; i++) {
			for(int j =0; j < intArr[i].length; j++) {
				intArr[i][j] = getRandint(1001);
			}
		}
		return intArr;
	}
	
	public double[][]doubleArr(int outter, int inner){
		double[][] doubleArr = new double[outter][inner];
		for(int i = 0; i < doubleArr.length; i++) {
			for(int j =0; j < doubleArr[i].length; j++) {
				doubleArr[i][j] = getRanddouble(1001);
			}
		}
		return doubleArr;
	}
	
	
	public int getRandint(int maxNum) {
		return (int)(Math.random() * (maxNum+1));
	}
	
	public double getRanddouble(int maxNum) {
		return (Math.random() * (maxNum+1));
	}

}
