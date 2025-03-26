package hw3;

import java.util.Arrays;
import java.util.Scanner;

// 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數，如圖
public class HW3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hi 阿文 which number you would like to remove(only 1 to 9):");
		int removedNumber = sc.nextInt();

//		System.out.println("With int type:");
//		int[] intFilteredLottryList = getFilteredLottryList(removedNumber);
//		printArray(intFilteredLottryList);
//		System.out.println("Available total numbers: " + intFilteredLottryList.length);
//		int[] sixNumbers = intRandomList(intFilteredLottryList);
//		System.out.print("Random Available list: ");
//		printArray(sixNumbers);
//
//		System.out.println("=====================================");
//		
		String[] strFilteredLottryList = filteredLottryListString(removedNumber);
		System.out.println("With String type:");
		printArray(strFilteredLottryList);
		System.out.println("Available total numbers: " + strFilteredLottryList.length);
		String[] sixNumbersStr = strRandomList(strFilteredLottryList);
		System.out.print("Random Available list: ");
		printArray(sixNumbersStr);
	}

	public static int[] getFilteredLottryList(int removedNumber) {
		int count = getArrayLen(removedNumber);
		int[] filteredLottryList = new int[count];
		int index = 0;
		for (int i = 0; i < 49; i++) {
			int number = i + 1;
			if ((number < removedNumber * 10 || number >= (removedNumber + 1) * 10) && number % 10 != removedNumber) {
				filteredLottryList[index] = number;
				index++;
			}
		}

		return filteredLottryList;
	}

	public static String[] getLottryList() {
		String[] lottryList = new String[49];
		for (int i = 0; i < lottryList.length; i++) {
			lottryList[i] = String.valueOf((i + 1));
		}
		return lottryList;
	}

	public static String[] filteredLottryListString(int removedNumber) {
		int count = getArrayLen(removedNumber);
		String[] filteredLottryList = new String[count];
		String intStr = Integer.toString(removedNumber);
		String[] lottryList = getLottryList();

		int index = 0;
		for (int i = 0; i < lottryList.length; i++) {
			if (lottryList[i].contains(intStr) == false) {
				filteredLottryList[index] = lottryList[i];
				index++;
			}
		}

		return filteredLottryList;

	}

	public static int getArrayLen(int removedNumber) {
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if ((i < removedNumber * 10 || i >= (removedNumber + 1) * 10) && i % 10 != removedNumber) {
				count++;
			}
		}
		return count;
	}

	public static int[] intRandomList(int[] array) {

		int[] RandNumList = new int[6];
		int[] check = new int[6];
		int index = 0;
		int randNum;
		while (index < 6) {
			randNum = getRandomNumber(49);
			check = Arrays.copyOf(RandNumList, 6);
			Arrays.sort(check);
			if (Arrays.binarySearch(check, randNum) < 0 && Arrays.binarySearch(array, randNum) > 0) {
				RandNumList[index] = randNum;
				index++;
			}
		}

		return RandNumList;

	}
	
	public static String[] strRandomList(String[] array) {

		String[] RandNumList = new String[6];
		int[] numberIndex = {-1,-1,-1,-1,-1,-1};
		int[] check = new int[6];
		int index = 0;
		int randNum;
		while (index < 6) {
			randNum = getRandomNumber((array.length)-1);
			check = Arrays.copyOf(numberIndex, 6);
			Arrays.sort(check);
			if (Arrays.binarySearch(check, randNum) < 0) {
				RandNumList[index] = array[randNum];
				index++;
			}
		}

		return RandNumList;

	}

	public static int getRandomNumber(int maxNum) {
		return (int) (Math.random() * maxNum + 1);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}

	public static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}

}
