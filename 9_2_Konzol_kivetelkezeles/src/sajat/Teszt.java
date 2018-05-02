/*
Oldja meg a 9_1 feladatot a Console osztály használatával!
Kezelje le azt az esetet is, amikor a konzol nem elérhetõ!
Készítsen kivetelek csomagban saját kivétel osztályt
NemTamogatottConsoleException néven
(legyen kötelezõen lekezelendõ)!
*/
package sajat;

import java.io.Console;
import kivetelek.NemTamogatottConsoleException;

public class Teszt {
	public static void main(String[] args) {
		int tombMeret = 5;
		int[] egeszTomb = new int[tombMeret];

		for (int i = 0; i < egeszTomb.length; i++) {
			egeszTomb[i] = egeszSzamotBeolvas(i + 1);
		}

		System.out.println("\nA beolvasott szamok:");

		for (int i : egeszTomb) {
			System.out.println(i);
		}

	}

	public static int egeszSzamotBeolvas(int i) {
		int egeszSzam = 0;
		boolean rosszBeolvasas = true;

		do {
			try {
				//Eclipse-ben nincs Console
				//NullPointerException kivétel keletkezik
				Console konzol = System.console();
				
				System.out.print("Kerem a(z) " + i + ". egesz szamot!\n");
				String szamString = konzol.readLine("szam (konzol):");
				
				egeszSzam = Integer.parseInt(szamString);
				rosszBeolvasas = false;
			} catch (NumberFormatException kivetel) {
				System.out.println("Nem egesz szam lett megadva a parseInt-nel!");
			} catch (NullPointerException kivetel) {
				System.out.println("Nincs konzol objektum!");
				try {
					throw new NemTamogatottConsoleException();
				} catch (NemTamogatottConsoleException sajatKivetel) {
					System.out.println(sajatKivetel.getMessage());
					//System.out.println(sajatKivetel);
					//sajatKivetel.printStackTrace();
					
					//throw new RuntimeException();
					egeszSzam = SajatKonzol.egeszSzamotBeolvas("Nem egesz szam lett beolvasva!");
					rosszBeolvasas = false;
				}
			} catch (Exception kivetel) {
				System.out.println(kivetel.getMessage());
			}
		} while (rosszBeolvasas);

		return egeszSzam;
	}

}
