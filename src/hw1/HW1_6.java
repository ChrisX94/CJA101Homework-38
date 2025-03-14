package hw1;


/*
* 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
* 5 + 5
* 5 + ‘5’
* 5 + “5”
* 並請用註解各別說明答案的產生原因
*/
public class HW1_6 {

	public static void main(String[] args) {
		// 5 + 5 = 10, 這裡是個int 的相加,一般數學運算
		System.out.println(5 + 5);
		// 5+'5'=58, 這裡的char '5' 在Unicode的號碼是53,在這裡被轉成int使用與int5相加等於58
		System.out.println(5 + '5');
		// 5 + "5" = "55", 這裡int 5 被轉成字串與string 5 合併結果為字串的"55" 
		System.out.println(5 + "5");
	}

}
