package hw1;

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class HW1_3 {
	public static void main(String[] args) {
		int total = 256559;
		// 1min = 60sec, 1hr=60min, 1day= 24hr 
		int min = 60;
		int hour = 60 * min;
		int day = 24 * hour;

		int totalDays = total / day;
		System.out.println(totalDays);
		
		int leftSec = total % day;
		System.out.println(leftSec);

		int totalHours = leftSec / hour;
		System.out.println(totalHours);
		
		leftSec %= hour;
		System.out.println(leftSec);
		
		int totalMins = leftSec / min;
		System.out.println(totalMins);
		
		leftSec %= min;
		System.out.println(leftSec);
		
		System.out.println("256559秒為: " + totalDays + " 天 "
				+ totalHours + " 小時 " 
				+ totalMins + " 分 "
				+ leftSec + " 秒");
		


		
		
	}
}
