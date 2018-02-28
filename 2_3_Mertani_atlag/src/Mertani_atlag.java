
import java.util.Scanner;

public class Mertani_atlag {
	public static void main(String[] args) {
/*
Deklaráljon, majd foglaljon helyet egy 10 elemû double tömb számára!
A tömbelemek értékét a standard inputról olvassa be!
Használja a Scanner osztályt!
Számítsa ki a tömbelemek mértani átlagát (a tömbelemek szorzata annyiadik gyök alatt,
ahány tagú a szorzat)!. Gyökvonáshoz használja a Math osztály pow() hatványozó metódusát,
amelynek elsõ paramétere a hatványalap (double),
második paramétere a hatványkitevõ (double)
és double értéket ad vissza!		
*/
		double[] valostomb = new double[10];
		Scanner bemenet = new Scanner(System.in);
		
		for (int i = 0; i < valostomb.length; i++) {
			System.out.println("Kerem adja meg a(z) " + (i + 1) + ". elem erteket!");			
			valostomb[i] = bemenet.nextDouble();			
		}
		
		double mertani_atlag = 1;

		for (int i = 0; i < valostomb.length; i++) {
			mertani_atlag *= valostomb[i];
		}
		/*
		for (double valosszam : valostomb) {
			mertani_atlag *= valosszam;
		}
		*/
		
		mertani_atlag = Math.pow(mertani_atlag, 
								1.0 / valostomb.length);

		System.out.println("A tomb elemeinek mertani atlaga:");
		System.out.println(mertani_atlag);
		
		bemenet.close();
	}
}
