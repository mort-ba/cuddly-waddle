/***
 * 4. Napisati metodu koja ispisuje n x n matricu korsiteci sljedeci header:
public static void printMatrix(int n)
Svaki element u matrici je ili 0 ili 1, generisan nasumicno. Napisati test 
program koji pita korisnika da unese n te ispisuje n x n matricu.
 */
package Day2;

import java.util.*;

public class Matrica {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite dimenziju kvadratne matrice: ");
		int m = 0;
		try {
			m = unos.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Morate unijeti broj!!!");
			System.exit(0);
		}finally {
			unos.close();
		}

		if (m != 0)	printMatrix(m);
		else
			System.err.println("Dimenzije matrice nemogu biti 0.");

	}

	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int clan = (int) (Math.random() * 2);
				System.out.print(clan + " ");
			}
			System.out.println();
		}
	}
}
