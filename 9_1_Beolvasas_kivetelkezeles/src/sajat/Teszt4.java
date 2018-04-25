/*
Készítsen saját csomagban futtatható osztályt,
amelyben létrehoz egy 5 elemû int tömböt és
megpróbálja feltölteni billentyûzetrõl beolvasott értékekkel!
Ha sikerült, írja ki a beolvasott 5 számot!

Kezelje az esetleg felmerülõ kivételeket!
Tesztelje a programot!

Megoldás változatok:
- beolvasás InputStreamReader és BufferedReader osztályok felhasználásával
és a readLine() metódussal és típus konverzióval.
 */
package sajat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teszt4 {

	public static void main(String[] args) {
		int tombMeret = 5;
		int[] egeszTomb = new int[tombMeret];
		InputStreamReader bememetiAdatfolyam = new InputStreamReader(System.in);
		BufferedReader beolvasas = new BufferedReader(bememetiAdatfolyam);
		// BufferedReader beolvasas = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < egeszTomb.length; i++) {

			try {

				System.out.print("Kerem a(z) " + (i + 1) + ". egesz szamot!\nszam:");

				boolean rosszBeolvasas = true;

				do {
					try {
						egeszTomb[i] = Integer.parseInt(beolvasas.readLine());
						rosszBeolvasas = false;
					} catch (NumberFormatException kivetel) {
						System.out.println("Nem egesz szam lett megadva a readLine-nal!");
						System.out.println("Kerem adja meg ujbol!\nszam:");
					}
				} while (rosszBeolvasas);
			} catch (IOException ioKivetel) {
				ioKivetel.printStackTrace();
			}
		}

		System.out.println("\nA beolvasott szamok:");

		for (int i : egeszTomb) {
			System.out.println(i);
		}

	}
}
