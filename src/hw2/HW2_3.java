package hw2;

//請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
public class HW2_3 {

	public static void main(String[] args) {
			int i = 1;
			int ans = 1;
			while(i <= 10) {
				ans *= i;
				i++;
			}
			System.out.println(ans);
		}

	}


