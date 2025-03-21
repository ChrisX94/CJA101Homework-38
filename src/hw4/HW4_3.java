package hw4;

/*  有個字串陣列如下(八大行星)：
* {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
* 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
* (提示：字元比對，String方法) 
*/
public class HW4_3 {

	static String vowels = "aeiou";
	static String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

	public static int compareLists(String vowels, String[] planets) {
		int count = 0;
		for (int i = 0; i < planets.length; i++) {
			for (int j = 0; j < planets[i].length(); j++) {
				String ch = String.valueOf(planets[i].charAt(j));
				if (vowels.contains(ch)) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		
		System.out.println(compareLists(vowels, planets));
	
	}
}
