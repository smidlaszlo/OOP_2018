/*
Készítsen saját csomagban futtatható osztályt,
amelyben létrehoz egy 5 elemû int tömböt és
megpróbálja feltölteni billentyûzetrõl beolvasott értékekkel!
Ha sikerült, írja ki a beolvasott 5 számot!

Kezelje az esetleg felmerülõ kivételeket!
Tesztelje a programot!

Megoldás változatok:
- beolvasás Scanner osztály nextInt() metódusával.
 */
package sajat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teszt1 {

	public static void main(String[] args) {
		int tombMeret = 5;
		int[] egeszTomb = new int[tombMeret];		
		Scanner beolvasas = new Scanner(System.in);

		for (int i = 0; i < egeszTomb.length; i++) {

			System.out.print("Kerem a(z) " + (i + 1) + ". egesz szamot!\nszam:");
			
			boolean rosszBeolvasas = true;

			do {
				try {
					egeszTomb[i] = beolvasas.nextInt();
					rosszBeolvasas = false;
				} catch (InputMismatchException kivetel) {
					System.out.println("Nem egesz szam lett megadva a nextInt-nel!");
					System.out.println("Kerem adja meg ujbol!\nszam:");
				} catch (Exception e) {
					System.out.println("Nem egesz szam lett megadva a nextInt-nel!");
				} finally {
					beolvasas.nextLine();
				}				
			} while (rosszBeolvasas);			
		}
		
		beolvasas.close();

		System.out.println("\nA beolvasott szamok:");
		
		for (int i : egeszTomb) {
			System.out.println(i);
		}
	}

}
