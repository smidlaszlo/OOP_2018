/* Tag 2Csomag
Ugyanebben a csomagban készítsen egy futtatható osztályt,
amelyben beolvas n darab könyvet egy tömbbe!
- Írja ki a leghosszabb könyv adatait!
- Írja ki a leghosszabb páros oldalszámú könyv adatait!
- Írja ki, hogy melyik szerzõnek hány darab könyve jelent meg!
 */
/* Tag 3KulonbozoCsomagok
Ugyanezeket a feladatokat oldja meg úgy,
hogy a futtatható osztályt másik csomagban definiálja!
 */

package masik;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*;
import sajat.Konyv;

public class Konyvtar {
	public static void main(String[] args) {
		
		Scanner beolvasas = new Scanner(System.in);
		Random veletlenszamobjektum = new Random();

		int meret;
		meret = 5;
//		System.out.println("Hany darab konyvet szeretne tarolni?");
//		System.out.println("darabszam:");
//		meret = Integer.parseInt(beolvasas.nextLine());

		Konyv konyvek[] = new Konyv[meret];

		System.out.println("A konyvek adatai:");		
		
		for (int i = 0; i < konyvek.length; i++) {
			/*
			System.out.println("Kerem adja meg a(z) " + (i + 1) + ". konyv szerzojet!\nszerzo:");
			String szerzo = beolvasas.nextLine();

			System.out.println("Kerem adja meg a konyv cimet!\ncim:");
			String cim = beolvasas.nextLine();

			System.out.println("Kerem adja meg a konyv oldalszamat!\noldalszam:");
			int oldalszam = beolvasas.nextInt();
			
			System.out.println("Kerem adja meg a konyv arat!\nar:");
			int ar = beolvasas.nextInt();
			//puffer uritese
			beolvasas.nextLine();
			
			konyvek[i] = new Konyv(cim, szerzo, ar, oldalszam);
			*/
			
			konyvek[i] = new Konyv("Cim" + (i + 1),
					(char)(veletlenszamobjektum.nextInt('Z' - 'A' + 1) + 'A')
					+ "" + (char)(veletlenszamobjektum.nextInt('Z' - 'A' + 1) + 'A'),
					veletlenszamobjektum.nextInt(10000) + 1,
					veletlenszamobjektum.nextInt(1500) + 1);
			System.out.println(konyvek[i]);
			
		}

		//Írja ki a leghosszabb könyv adatait!
		Konyv leghosszabb_konyv = konyvek[0];
		
		for (int i = 1; i < konyvek.length; i++) {
			leghosszabb_konyv = Konyv.hosszabbKonyv(konyvek[i], leghosszabb_konyv);			
		}

		System.out.println("A leghosszabb konyv adatai:");
		System.out.println(leghosszabb_konyv);
		
		//Írja ki a leghosszabb páros oldalszámú könyv adatait!
		Konyv leghosszabb_paros_oldalszamu_konyv = null;
		for (int i = 0; i < konyvek.length; i++) {
			if (konyvek[i].oldalszamParosE()) {
				if (leghosszabb_paros_oldalszamu_konyv == null) {
					leghosszabb_paros_oldalszamu_konyv = konyvek[i];
				} else {
					leghosszabb_paros_oldalszamu_konyv = Konyv.hosszabbKonyv(konyvek[i], leghosszabb_paros_oldalszamu_konyv);
				}						
			}
		}

		System.out.println("A leghosszabb paros oldalszamu konyv adatai:");
		System.out.println(leghosszabb_paros_oldalszamu_konyv);
		
		//Írja ki, hogy melyik szerzõnek hány darab könyve jelent meg!
		int darabszamok[] = new int[konyvek.length];
		
		for (int i = 0; i < konyvek.length; i++) {
			String szerzo = konyvek[i].getSzerzo();

			if (darabszamok[i] == 0) {
				darabszamok[i]++;

				for (int j = i + 1; j < konyvek.length; j++) {
					if (szerzo.equals(konyvek[j].getSzerzo())) {
						darabszamok[i]++;
						darabszamok[j] = -1;
					}				
				}
				
				System.out.println(szerzo + "konyveinek darabszama: " + darabszamok[i]);			
			}
		}		
		
		beolvasas.close();
	}
}