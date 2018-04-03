/*
Készítsen futtatható osztályt
az elõbb definiált osztályokat magába foglaló csomag
alcsomagjában (pl. szemelyek.teszt.SzemelyTeszt)!

Ebben deklaráljon két személy típusú referenciát!
Olvassa be az adataikat (név, kor)!

A referenciák dinamikus típusát ellenõrzött módon határozza meg
(ha 18 év alatti akkor Gyermek, egyébként Felnõtt),
majd értelemszerûen olvassa be a Gyermek iskoláját,
ill. a Felnõtt munkahelyét és hozza létre az objektumokat!

Kérdezze le a létrejött objektumok típusát
(instanceof) és irassa ki az adataikat!
 */

/*
Egészítse ki a futtatható osztályt!
Amikor meghatározza a Személy típusúra deklarált referenciák dinamikus típusát,
a Felnõttek esetén ellenõrizze a munkahely értékét:
csak akkor lehet Alkalmazott, ha a munkahely nem "null"
(nem minden felnõtt alkalmazott)!

Ezek után kérdezze le a létrejött objektumok típusát (instanceof)
és irassa ki az adataikat!

A String-ek egyezésének vizsgálatára használja a String osztály
boolean equalsIgnoreCase(String anotherString)
metódusát!

Módosítsa úgy a futtatható osztályban a main metodus kódját,
hogy hozzon létre egy n elemû Személy tömböt!

Az adatok beolvasásakor dõljön el,
hogy az adott személy Gyermek, Felnõtt, vagy Alkalmazott!

Majd életkoruk szerint növekvõen rendezve írja ki az adataikat!
Használja a minimum kiválasztásos rendezõ eljárást!
 */

package szemelyek.teszt;

import java.util.Scanner;

//import szemelyek.Szemely;
//import szemelyek.Felnott;
//import szemelyek.Gyermek;
import szemelyek.*;

public class SzemelyTeszt {

	public static void main(String[] args) {
		//hazi feladat megvalositani tombbel is
		Szemely elso_szemely;
		Szemely masodik_szemely;
		
		String nev;
		int kor;
		String iskola_munkahely;
		
		Scanner beolvasas = new Scanner(System.in);

		//elso szemely
		System.out.println("Kerem adja meg az elso szemely nevet!");
		System.out.println("nev: ");
		nev = beolvasas.nextLine();

		System.out.println("Kerem adja meg az elso szemely korat!");
		System.out.println("kor: ");
		kor = beolvasas.nextInt(); beolvasas.nextLine();
		
		if (kor < 18) {
			System.out.println("Kerem adja meg az elso szemely iskolajat!");
			System.out.println("iskola: ");
			iskola_munkahely = beolvasas.nextLine();
			elso_szemely = new Gyermek(nev, kor, iskola_munkahely);
		} else {
			System.out.println("Kerem adja meg az elso szemely munkahelyet!");
			System.out.println("munkahely: ");
			iskola_munkahely = beolvasas.nextLine();

			if (iskola_munkahely.equalsIgnoreCase("null")) {
				elso_szemely = new Felnott(nev, kor, iskola_munkahely);
			} else {
				System.out.println("Kerem adja meg az elso alkalmazott fizeteset!");
				System.out.println("fizetes: ");
				long fizetes = beolvasas.nextLong(); beolvasas.nextLine();
				elso_szemely = new Alkalmazott(nev, kor, iskola_munkahely, fizetes);
			}			
		
		}
		
		//masodik szemely
		System.out.println("Kerem adja meg a masodik szemely nevet!");
		System.out.println("nev: ");
		nev = beolvasas.nextLine();

		System.out.println("Kerem adja meg a masodik szemely korat!");
		System.out.println("kor: ");
		kor = beolvasas.nextInt(); beolvasas.nextLine();
		
		if (kor < 18) {
			System.out.println("Kerem adja meg a masodik szemely iskolajat!");
			System.out.println("iskola: ");
			iskola_munkahely = beolvasas.nextLine();
			masodik_szemely = new Gyermek(nev, kor, iskola_munkahely);
		} else {
			System.out.println("Kerem adja meg a masodik szemely munkahelyet!");
			System.out.println("munkahely: ");
			iskola_munkahely = beolvasas.nextLine();
			
			if (iskola_munkahely.equalsIgnoreCase("null")) {
				masodik_szemely = new Felnott(nev, kor, iskola_munkahely);
			} else {
				System.out.println("Kerem adja meg a masodik alkalmazott fizeteset!");
				System.out.println("fizetes: ");
				long fizetes = beolvasas.nextLong(); beolvasas.nextLine();
				masodik_szemely = new Alkalmazott(nev, kor, iskola_munkahely, fizetes);
			}			
			
		}
		
		//Kérdezze le a létrejött objektumok típusát,
		//és irassa ki az adataikat!

		System.out.println("elso szemely tipusa:");
		System.out.println(elso_szemely.getClass());
		System.out.println("elso szemely Szemely? Gyermek? Felnott? Alkalmazott?");
		System.out.println(elso_szemely instanceof Szemely);
		System.out.println(elso_szemely instanceof Gyermek);
		System.out.println(elso_szemely instanceof Felnott);
		System.out.println(elso_szemely instanceof Alkalmazott);
		
		System.out.println(elso_szemely);

		System.out.println();
		System.out.println("masodik szemely tipusa:");		
		System.out.println(masodik_szemely.getClass());
		System.out.println("masodik szemely Szemely? Gyermek? Felnott? Alkalmazott?");
		System.out.println(masodik_szemely instanceof Szemely);
		System.out.println(masodik_szemely instanceof Gyermek);
		System.out.println(masodik_szemely instanceof Felnott);
		System.out.println(masodik_szemely instanceof Alkalmazott);

		System.out.println(masodik_szemely);
				
		beolvasas.close();

/*
Hozzon létre egy n elemû Személy tömböt!

Az adatok beolvasásakor dõljön el,
hogy az adott személy Gyermek, Felnõtt, vagy Alkalmazott!

Majd életkoruk szerint növekvõen rendezve írja ki az adataikat!
Használja a minimum kiválasztásos rendezõ eljárást!
 */
	
	}

}
