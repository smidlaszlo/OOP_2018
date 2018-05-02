/*
Definiáljon egy futtatható osztályt (tartalyos.fut.Proba)!

Ebben hozzon létre 5 Tartaly objektumot beolvasott adatokkal!
Írja ki az összes tartály adatait!
Írja ki a legnagyobb nyomású tartályt!
Írja ki a legnagyobb térfogatú tartályt!
 */
package tartalyos.fut;

import java.util.Random;

import tartalyos.Tartaly;

public class Proba {

	public static void main(String[] args) {
		int meret = 5;
		Tartaly[] tartalyok = new Tartaly[meret];
		Random veletlenObjektum = new Random();

		//TODO InputStreamReader/BufferedReader osztalyokkal is
		
		for (int i = 0; i < tartalyok.length; i++) {
			tartalyok[i] = new Tartaly(veletlenObjektum.nextInt(20),
					veletlenObjektum.nextDouble() * 20);
		}
		
		System.out.println("A tartalyok adatai:");
		for (Tartaly tartaly : tartalyok) {
			System.out.println(tartaly);
		}
		
		int legnagyobbNyomasuIndexe = 0;
		for (int i = 1; i < tartalyok.length; i++) {
			if (tartalyok[i].nagyobbNyomasuMint(tartalyok[legnagyobbNyomasuIndexe])) {
				legnagyobbNyomasuIndexe = i;
			}
		}
		
		System.out.println();
		System.out.println("A legnagyobb nyomasu tartaly:");
		System.out.println(tartalyok[legnagyobbNyomasuIndexe]);
		
		Tartaly legnagyobbTerfogatuTartaly = tartalyok[0];
		
		for (int i = 1; i < tartalyok.length; i++) {
			legnagyobbTerfogatuTartaly = Tartaly.nagyobbTerfogatuTartaly(legnagyobbTerfogatuTartaly, tartalyok[i]);
		}
		
		System.out.println("A legnagyobb terfogatu tartaly:");
		System.out.println(legnagyobbTerfogatuTartaly);
		
	}

}
