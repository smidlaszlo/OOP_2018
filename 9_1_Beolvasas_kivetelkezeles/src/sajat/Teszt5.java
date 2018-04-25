/*
Készítsen saját csomagban futtatható osztályt,
amelyben létrehoz egy 5 elemû int tömböt és
megpróbálja feltölteni billentyûzetrõl beolvasott értékekkel!
Ha sikerült, írja ki a beolvasott 5 számot!

Kezelje az esetleg felmerülõ kivételeket!
Tesztelje a programot!

Módosítsa úgy a feladatot, hogy a beolvasást külön metódus valósítsa meg!
Csak pozitív számokat fogadjon el.
A negatív számok és a 0 érvénytelen input.
 */
package sajat;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Teszt5 {

	public static void main(String[] args) {
		int tombMeret = 5;
		int[] egeszTomb = new int[tombMeret];

		for (int i = 0; i < egeszTomb.length; i++) {
			//egeszTomb[i] = pozitivEgeszetBeolvas(i + 1);
			egeszTomb[i] = pozitivEgeszetBeolvasKivetellel(i + 1);
		}

		System.out.println("\nA beolvasott szamok:");

		for (int i : egeszTomb) {
			System.out.println(i);
		}

	}

	public static int pozitivEgeszetBeolvas(int i) {
		@SuppressWarnings("resource")
		java.util.Scanner beolvasas = new java.util.Scanner(System.in);
		int egeszSzam;

		do {
			System.out.print("Kerem a(z) " + i + ". pozitiv egesz szamot!\nszam:");

			while (!beolvasas.hasNextInt()) {
				beolvasas.next();
				System.out.println("Nem egesz szam lett megadva!");
				System.out.print("Kerem adja meg ujbol!\nszam:");
			}

			egeszSzam = beolvasas.nextInt();

			if (egeszSzam <= 0)
				System.out.println("Nem pozitiv egesz szam lett megadva!");

		} while (egeszSzam <= 0);

		return egeszSzam;
	}

	public static int pozitivEgeszetBeolvasKivetellel(int i) {
		int egeszSzam = 0;
		InputStreamReader bememetiAdatfolyam = new InputStreamReader(System.in);
		BufferedReader beolvasas = new BufferedReader(bememetiAdatfolyam);
		// BufferedReader beolvasas = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.print("Kerem a(z) " + i + ". pozitiv egesz szamot!\nszam:");

			boolean rosszBeolvasas = true;

			do {
				try {
					egeszSzam = Integer.parseInt(beolvasas.readLine());
					if (egeszSzam <= 0) {
						throw new IllegalArgumentException();
					}
					rosszBeolvasas = false;
				} catch (NumberFormatException kivetel) {
					System.out.println("Nem egesz szam lett megadva a readLine-nal!");
					System.out.println("Kerem adja meg ujbol!\nszam:");
				} catch (IllegalArgumentException kivetel) {
					System.out.println("Nem pozitiv szam lett megadva a readLine-nal!");
					System.out.println("Kerem adja meg ujbol!\nszam:");
				}
			} while (rosszBeolvasas);

		} catch (IOException ioKivetel) {
			ioKivetel.printStackTrace();
		}

		return egeszSzam;
	}
}
