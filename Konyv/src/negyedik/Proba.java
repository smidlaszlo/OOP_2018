/*
Ugyanebben a csomagban készítsen egy futtaható osztályt,
amelyben
a) legyen egy osztályszintû metódus,
amely megkap egy könyv tömböt
és minden könyv adatát kiírja,
b) legyen egy osztályszintû metódus,
amely megkap egy KonyvEnummal tömböt
és egy Stilus-t és visszaadja azon könyvek tömbjét,
amelyek a megadott stílusúak,
c) legyen main metódus, amelyben létrehoz egy könyv tömböt
az adatok billentyûzetrõl történõ beolvasásával,
kiírja a könyvek adatait,
majd kiválogatja és kiírja a scifi stílusúakat!
 */
package negyedik;

import java.util.Random;
import java.util.Scanner;
import negyedik.KonyvEnummal.Stilus;
import sajat.Konyv;

public class Proba {

	public static final boolean 
		MANUALIS_ADATBEVITEL = true;
		//MANUALIS_ADATBEVITEL = false;
	
	//manualis adatbevitelnel
	//a stilus bekerese szammal, vagy sztringgel tortenjen
	public static final boolean
		STILUS_BEKER_SZAMMAL = true;
		//STILUS_BEKER_SZAMMAL = false;
	
	public static void konyvKiir(Konyv[] konyvek) {
		for (Konyv konyv : konyvek) {
			System.out.println(konyv);
		}
	}
	
	public static KonyvEnummal[] adottStilusuKonyvKiir(
							KonyvEnummal[] konyvek,
							Stilus stilus) {
		KonyvEnummal[] adottStilusuKonyvek;
		int darab = 0;

		for (KonyvEnummal konyv : konyvek) {
			if (konyv.getStilus().equals(stilus)) {
				darab++;
			}
		}

		adottStilusuKonyvek = new KonyvEnummal[darab];
		darab = 0;
		
		for (KonyvEnummal konyv : konyvek) {
			if (konyv.getStilus().equals(stilus)) {
				adottStilusuKonyvek[darab] = konyv;
				darab++;
			}
		}

		return adottStilusuKonyvek;
	}
	
	public static void main(String[] args) {

		int konyvekDarabszama = 5;
		Random rnd = new Random();
		KonyvEnummal[] konyvek = new KonyvEnummal[konyvekDarabszama];
		KonyvEnummal[] scifiKonyvek;

		//ordinal es valueOf pelda
		//enum ertekeinek kiiratasa
		System.out.println("Stilus.SCIFI.ordinal()");
		System.out.println(Stilus.SCIFI.ordinal());
		System.out.println("Stilus.valueOf(\"SCIFI\")");
		System.out.println(Stilus.valueOf("SCIFI"));
		System.out.println("Stilus.valueOf(\"SCIFI\").ordinal()");
		System.out.println(Stilus.valueOf("SCIFI").ordinal());
		
		Scanner beolvasas = new Scanner(System.in);
		
		for (int i = 0; i < konyvek.length; i++) {
			if (MANUALIS_ADATBEVITEL) {				
				System.out.println("Kerem adja meg a konyv szerzojet!");
				System.out.println("szerzo:");
				String szerzo = beolvasas.nextLine();
	
				System.out.println("Kerem adja meg a konyv cimet!");
				System.out.println("cim:");
				String cim = beolvasas.nextLine();
	
				System.out.println("Kerem adja meg a konyv oldalszamat!");
				System.out.println("oldalszam:");
				int oldalszam = beolvasas.nextInt(); beolvasas.nextLine();
	
				System.out.println("Kerem adja meg a konyv arat!");
				System.out.println("ar:");
				int ar = beolvasas.nextInt(); beolvasas.nextLine();
	
				System.out.println("Kerem adja meg a konyv stilusat!");
				if (STILUS_BEKER_SZAMMAL) {
					//egesz szam bekerese
					System.out.println("1 - scifi\n2 - szakacs\n3 - romantikus\n4 - egyeb");
					System.out.println("stilus (1-4):");
					int stilusszammal = beolvasas.nextInt(); beolvasas.nextLine();
					
					konyvek[i] = new KonyvEnummal(
							cim, szerzo, ar, oldalszam,
							//egesz szam bekerese
							Stilus.values()[stilusszammal - 1]);
				} else {
					//string bekerese
					System.out.println("stilus (scifi, szakacs, romantikus, egyeb):");
					String stilus = beolvasas.nextLine();

					konyvek[i] = new KonyvEnummal(
							cim, szerzo, ar, oldalszam,
							//string bekerese
							Stilus.valueOf(stilus.toUpperCase()));
				}	
			} else {
				//szamitogep altal generalt konyvek
				konyvek[i] = new KonyvEnummal(
						"Cim" + (i + 1), 
						"XY" + (i + 1),
						100 + rnd.nextInt(5900),
						rnd.nextInt(950) + 50,
						Stilus.values()[rnd.nextInt(4)]);
			}
		}
		
		beolvasas.close();

		System.out.println();
		System.out.println("A konyvek adatai:");

		//Proba.konyvKiir(konyvek);
		konyvKiir(konyvek);

		//scifiKonyvek = Proba.adottStilusuKonyvKiir(konyvek, Stilus.SCIFI);
		scifiKonyvek = adottStilusuKonyvKiir(konyvek,
				KonyvEnummal.Stilus.SCIFI);
		
		if (scifiKonyvek.length > 0) {
			System.out.println("\nSCIFI-konyvek:");
			konyvKiir(scifiKonyvek);
		} else {
			System.out.println("\nNincsenek SCIFI-konyvek.");
		}
	}
}
