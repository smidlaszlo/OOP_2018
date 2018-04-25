/*
Készítsen saját csomagban futtatható osztályt,
amelyben létrehoz egy 5 elemû int tömböt és
megpróbálja feltölteni billentyûzetrõl beolvasott értékekkel!
Ha sikerült, írja ki a beolvasott 5 számot!

Kezelje az esetleg felmerülõ kivételeket!
Tesztelje a programot!

Módosítsa úgy a feladatot, hogy a beolvasást külön metódus valósítsa meg!
Módosítsa úgy a feladatot, hogy csak prímszámokat fogadjon el beolvasáskor!

Készítsen hozzá saját kivételosztályt (legyen kötelezõen lekezelendõ)!
 */
package sajat;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import kivetelek.NemPrimszamException;

public class Teszt7 {

	public static void main(String[] args) {
		int tombMeret = 5;
		int[] egeszTomb = new int[tombMeret];

		for (int i = 0; i < egeszTomb.length; i++) {
			egeszTomb[i] = primszamotBeolvas(i + 1);
		}

		System.out.println("\nA beolvasott primszamok:");

		for (int i : egeszTomb) {
			System.out.println(i);
		}

	}

	public static int primszamotBeolvas(int i) {
		int egeszSzam = 0;
		InputStreamReader bememetiAdatfolyam = new InputStreamReader(System.in);
		BufferedReader beolvasas = new BufferedReader(bememetiAdatfolyam);
		// BufferedReader beolvasas = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.print("Kerem a(z) " + i + ". primszamot!\nszam:");

			boolean rosszBeolvasas = true;

			do {
				try {
					egeszSzam = Integer.parseInt(beolvasas.readLine());
					if (!primszamE(egeszSzam)) {
						throw new NemPrimszamException();
					}
					rosszBeolvasas = false;
				} catch (NumberFormatException kivetel) {
					System.out.println("Nem egesz szam lett megadva a readLine-nal!");
					System.out.print("Kerem adja meg ujbol!\nszam:");
				} catch (NemPrimszamException kivetel) {
					System.out.println(kivetel.getMessage());
					//System.out.println(kivetel);
					System.out.print("Kerem adja meg ujbol!\nszam:");
				}
			} while (rosszBeolvasas);

		} catch (IOException ioKivetel) {
			ioKivetel.printStackTrace();
		}

		return egeszSzam;
	}
	
	public static boolean primszamE(int szam) {
		if (szam < 2) {
			return false;
		}
		
		for (int i = 2; i <= szam / 2; i++) {
			if (szam % i == 0) {
				return false;
			}
		}
		
		return true;
	}	
}
