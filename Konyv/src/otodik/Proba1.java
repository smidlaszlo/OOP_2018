/*
Módosítsa a Könyv osztály definícióját úgy,
hogy a konstruktora dobjon kivételt,
ha a megadott oldalszám és az ár negatív!
Keressen hozzá megfelelõ kivételosztályt és
kezelje le a kivételt!

Ellenõrzött adatbeolvasás változatai:
a) az oldalszám és ár adatokat hátultesztelõ ciklusban
olvassuk be, amíg meg nem felelnek a kritériumnak!
 */
package otodik;

import java.util.Scanner;

import negyedik.KonyvEnummal;
import negyedik.KonyvEnummal.Stilus;
import sajat.Konyv;

public class Proba1 {

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

			boolean negativAr = true;
			boolean negativOldalszam = true;
			boolean bekertStilus = false;
			int oldalszam = 0, ar = 0, stilusszammal = 0;
			Stilus stilus = Stilus.values()[0];
			
			do {
				
				if (negativOldalszam) {
					System.out.println("Kerem adja meg a konyv oldalszamat!");
					System.out.println("oldalszam:");
					oldalszam = beolvasas.nextInt();
					beolvasas.nextLine();					
				}

				if (negativAr) {
					System.out.println("Kerem adja meg a konyv arat!");
					System.out.println("ar:");
					ar = beolvasas.nextInt();
					beolvasas.nextLine();
					
				}

				if (!bekertStilus) {
					System.out.println("Kerem adja meg a konyv stilusat!");

					// egesz szam bekerese
					System.out.println("1 - scifi\n2 - szakacs\n3 - romantikus\n4 - egyeb");
					System.out.println("stilus (1-4):");
					stilusszammal = beolvasas.nextInt();
					beolvasas.nextLine();
					bekertStilus = true;
					
					try {
						stilus = Stilus.values()[stilusszammal - 1];
					} catch (ArrayIndexOutOfBoundsException e) {
						//egyeb stilus
						stilus = Stilus.values()[3];
					}
				}

				try {
					konyvek[i] = new KonyvEnummal(cim, szerzo, ar, oldalszam, stilus);
					negativOldalszam = negativAr = false;
					
				} catch (IllegalArgumentException e) {
					if (ar < 0) {
						System.out.println("Az ar nem lehet negativ.");
					} else
						negativAr = false;
					if (oldalszam < 0) {
						System.out.println("Az oldalszam nem lehet negativ.");
					} else
						negativOldalszam = false;					
				}

			} while (negativAr || negativOldalszam);
			

		}//for

		beolvasas.close();

		System.out.println();
		System.out.println("A konyvek adatai:");

		for (Konyv konyv : konyvek) {
			System.out.println(konyv);
		}

	}

}
