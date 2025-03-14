package hw1;

//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
// Formula FV ＝ PV×（1 ＋ R）^n 
public class HW1_5 {

	public static void main(String[] args) {
		double pv = 1_500_000;
		double rate = 0.02;
		double n = 10;
		double fv = pv *Math.pow(( 1 + rate),n);
		
		System.out.println("10年後本金加利息: " + (int)fv);
	}

}
