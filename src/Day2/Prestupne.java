/***
 * 1. Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od godine 101 do 2100, 
 * odvojene jednim spaceom. Takoder ispisati i ukupan broj prijestupnih godina u ovom vremenskom periodu.
 */

package Day2;

public class Prestupne {

	public static void main(String[] args) {
		int b = 0;
		for (int i = 101; i <= 2100; i++) {
			if (prestupna(i)) {
				System.out.print(i + " ");
				b++;
			}
			if (b == 9) {
				System.out.println();
				b = 0;
			}
		}
	}

	public static boolean prestupna(int a) {
		if (a % 4 == 0) {
			if (a % 100 != 0) {
				return true;
			} else if (a % 400 == 0)
				return true;
		}
		return false;
	}

}
