/***
 * 2. Napisati metodu koja prima jedan argument, broj pitanja, te generiše toliko nasumicnih, 
 * jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“. Metoda treba da broji broj tacnih 
 * i netacnih odgovora te ih ispiše korisniku.
 */
package Day2;

import java.util.Scanner;

public class Nasumicno {

	public static void main(String[] args) {
		nasumice(6);

	}
	public static void nasumice(int a){
		Scanner unos = new Scanner(System.in);
		int tacni=0;
		for(int i=0;i<a;i++){
			int n1 = (int) (Math.random()*10);
			int n2 = (int) (Math.random()*10);
			System.out.print("Koliko je "+n1+"-"+n2+" ? ");
			if (unos.nextInt()==n1-n2) tacni++;
		}
		unos.close();
		System.out.println("Imali ste "+tacni+" tacnih i "+ (a-tacni)+" netacnih odgovora.");
	}

}
