/***
 * 5. Napisati metodu koja prima jedan argument te simulira bacanje novcica toliko puta. 
 * Nakon što se simulacija završi, program ispisuje koliko puta je novcic pokazao glavu a 
 * koliko puta pismo.
 */
package Day2;

public class pismoGlava {

	public static void main(String[] args) {
		PismoGlava(88);

	}
	public static void PismoGlava(int a){
		int pismo=0;
		int rand=0;
		
		for (int i=0;i<a;i++){
			rand = (int)(Math.random()*2);
			if (rand==0) pismo++;
		}
	System.out.println("Novcic je pao na pismo "+pismo+" puta, dok u ostalih "+(a-pismo)+" put je pokazao glavu.");
	}
	

}
