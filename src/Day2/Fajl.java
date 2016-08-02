/***
 * 3. Napišite program koji ce brojati broj karaktera, rijeci i linija teksta u nekom fileu.
 *  Rijeci trebaju biti odvojene jednim spaceom. Ime file proslijediti kao argument u vaš program.
 */
package Day2;

import java.io.*;
import java.util.Scanner;

public class Fajl {

	public static void main(String[] args) {
		int bl=0;
		int bk=0;
		int br=0;
		Scanner unos=new Scanner (System.in);
		System.out.print("Unesite ime fajla: ");
		File file= new File(unos.nextLine());
		unos.close();
		
		try {
		     BufferedReader buffer = new BufferedReader(new FileReader(file));
		        String line;
		        while ((line = buffer.readLine()) != null) {
		            line = line.trim();
		            bl++;
		            for(int i=0;i<line.length();i++){
		            	if(line.charAt(i)==' ') br++;
		            	else bk++;
		            	}
		            br++;
		            
		            }
		        buffer.close();
						
		} catch (FileNotFoundException e) {
			System.err.println("Vas fajl nije pronadjen!");
			System.exit(0);
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Vas fajl ima "+bk+" karaktera, "+br+" rijeci i "+bl+" linija");

	}

}
