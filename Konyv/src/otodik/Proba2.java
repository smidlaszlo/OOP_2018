/*
Módosítsa a Könyv osztály definícióját úgy,
hogy a konstruktora dobjon kivételt,
ha a megadott oldalszám és az ár negatív!
Keressen hozzá megfelelõ kivételosztályt és
kezelje le a kivételt!

Ellenõrzött adatbeolvasás változatai:
b) hibás input esetén az oldalszámot és az árat
vegye 0-nak (jelentése: nem ismert adat)!
 */
package otodik;

import java.util.Scanner;

import negyedik.KonyvEnummal;
import negyedik.KonyvEnummal.Stilus;
import sajat.Konyv;

public class Proba2 {

	public static void main(String[] args) {
		int konyvekDarabszama = 2;
		KonyvEnummal[] konyvek = new KonyvEnummal[konyvekDarabszama];

		Scanner beolvasas = new Scanner(System.in);

		for (int i = 0; i < konyvek.length; i++) {

			System.out.println("Kerem adja meg a konyv szerzojet!");
			System.out.println("szerzo:");
			String szerzo = beolvasas.nextLine();

			System.out.println("Kerem adja meg a konyv cimet!");
			System.out.println("cim:");
			String cim = beolvasas.nextLine();

			System.out.println("Kerem adja meg a konyv oldalszamat!");
			System.out.println("oldalszam:");
			int oldalszam = beolvasas.nextInt();
			beolvasas.nextLine();

			System.out.println("Kerem adja meg a konyv arat!");
			System.out.println("ar:");
			int ar = beolvasas.nextInt();
			beolvasas.nextLine();

			System.out.println("Kerem adja meg a konyv stilusat!");

			// egesz szam bekerese
			System.out.println("1 - scifi\n2 - szakacs\n3 - romantikus\n4 - egyeb");
			System.out.println("stilus (1-4):");
			int stilusszammal = beolvasas.nextInt();
			beolvasas.nextLine();
			
			Stilus stilus ;
			try {
				stilus = Stilus.values()[stilusszammal - 1];
			} catch (ArrayIndexOutOfBoundsException e) {
				//egyeb stilus
				stilus = Stilus.values()[3];
			}

			boolean rosszAdatok = true;
			
			do {
				try {
					konyvek[i] = new KonyvEnummal(cim, szerzo, ar, oldalszam, stilus);
					rosszAdatok = false;

				} catch (IllegalArgumentException e) {
					if (ar < 0) {
						System.out.println("Az ar nem lehet negativ.");
						ar = 0;
					}
					
					if (oldalszam < 0) {
						System.out.println("Az oldalszam nem lehet negativ.");
						oldalszam = 0;
					}
				}
				
			} while (rosszAdatok);
			

		} // for

		beolvasas.close();

		System.out.println();
		System.out.println("A konyvek adatai:");

		for (Konyv konyv : konyvek) {
			System.out.println(konyv);
		}

	}

}
