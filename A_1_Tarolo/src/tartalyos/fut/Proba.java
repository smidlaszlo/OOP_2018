/*
Definiáljon egy futtatható osztályt (tartalyos.fut.Proba)!

Ebben hozzon létre 5 Tartaly objektumot beolvasott adatokkal!
Írja ki az összes tartály adatait!
Írja ki a legnagyobb nyomású tartályt!
Írja ki a legnagyobb térfogatú tartályt!
 */
package tartalyos.fut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import tartalyos.Tartaly;

public class Proba {

	public static final boolean 
		MANUALIS_ADATBEVITEL = true;
		//MANUALIS_ADATBEVITEL = false;	
	
	public static void main(String[] args) {
		int meret = 5;
		Tartaly[] tartalyok = new Tartaly[meret];
		Random veletlenObjektum = new Random();
		BufferedReader beolvasas = new BufferedReader(new InputStreamReader(System.in));
		int terfogat = 0;
		double nyomas = 0;
		
		for (int i = 0; i < tartalyok.length; i++) {
			if (MANUALIS_ADATBEVITEL) {
				
				boolean rosszNyomas, rosszTerfogat;
				rosszNyomas = rosszTerfogat = true;
				
				/*
				do {
					
					if (rosszTerfogat) {
						try {
							System.out.println("Kerem adja meg a(z) " + (i + 1) + ". tartaly terfogatat!");
							System.out.print("terfogat:");
							terfogat = Integer.parseInt(beolvasas.readLine());
							rosszTerfogat = false;
						} catch (NumberFormatException e) {
							System.out.println("Terfogatra nem egesz szam lett megadva!");
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

					if (rosszNyomas) {
						try {
							System.out.println("Kerem adja meg a(z) " + (i + 1) + ". tartaly nyomasat!");
							System.out.print("nyomas:");
							nyomas = Double.parseDouble(beolvasas.readLine());
							rosszNyomas = false;
						} catch (NumberFormatException e) {
							System.out.println("Nyomasra nem valos szam lett megadva!");
						} catch (IOException e) {
							e.printStackTrace();
						}
					}					
					
				} while (rosszNyomas || rosszTerfogat);
				*/

				do {
						try {
							System.out.println("Kerem adja meg a(z) " + (i + 1) + ". tartaly terfogatat!");
							System.out.print("terfogat:");
							terfogat = Integer.parseInt(beolvasas.readLine());
							rosszTerfogat = false;
						} catch (NumberFormatException e) {
							System.out.println("Terfogatra nem egesz szam lett megadva!");
						} catch (IOException e) {
							e.printStackTrace();
						}					
				} while (rosszTerfogat);

				do {
						try {
							System.out.println("Kerem adja meg a(z) " + (i + 1) + ". tartaly nyomasat!");
							System.out.print("nyomas:");
							nyomas = Double.parseDouble(beolvasas.readLine());
							rosszNyomas = false;
						} catch (NumberFormatException e) {
							System.out.println("Nyomasra nem valos szam lett megadva!");
						} catch (IOException e) {
							e.printStackTrace();
						}
				} while (rosszNyomas);				
				
				tartalyok[i] = new Tartaly(terfogat, nyomas);
				
			} else {//Nem MANUALIS_ADATBEVITEL, veletlenszamgeneralas
				tartalyok[i] = new Tartaly(veletlenObjektum.nextInt(20),
						veletlenObjektum.nextDouble() * 20);				
			}
			
		}
		
		System.out.println();
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
