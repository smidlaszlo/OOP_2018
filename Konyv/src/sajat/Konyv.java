/*
Készítsen Könyv osztályt és egy Könyv osztályt használó osztályt!
a) A Könyv osztály adattagjai: cím, szerző, megjelenés éve, ára.
Legyen egy metódusa, amely a paraméterként kapott
százalékos értékkel növeli a könyv árát!
Legyen egy metódusa, ami egy String-be összefűzi az adatokat
és ezt adja vissza!
b) Írjunk setter metódusokat az adatok beállításához,
és getter metódusokat az adatok lekérdezéséhez
(adatrejtés → ellenőrzött adathozzáférés). 
 */

/* Tag 1Konstruktor
	//Egészítse ki a Könyv osztályt 2 konstruktorral!
	//Az egyik konstruktornak a könyv minden adatát meg kell adni,
	//a másiknak csak a szerzőt és a címet,
	//az ár 2500 Ft, a megjelenés éve pedig az aktuális év. 
 */

/* Tag 2Csomag
A Könyv osztályt helyezze át saját csomagba!
- A szerző, cím és ár adattagok változatlanok.
- Egészítse ki egy oldalszám adattaggal
és egy kiadó osztályszintű adattaggal, melynek értéke “Móra”!
- A megjelenés éve adattag legyen konstans, az objektum létrehozásának éve!
- Módosítsa a 2 konstruktort ennek megfelelően!
- Módosítsa azt a metódust, amely String-ben összefűzve adja vissza a könyv adatait!
- Írjon metódust, amely két paraméterként kapott könyv közül a hosszabbat adja vissza!
- Írjon metódust, amely igazat ad vissza, ha a könyv oldalszáma páros!
 */
package sajat;

import java.util.*;
import java.time.LocalDate;

public class Konyv {
	private String cim;
	private String szerzo;
	//modositas konstanssa, final modosito hozzaadasa
	private final int megjelenes_eve;
	private int ar;
	private int oldalszam;
	//osztalyszintu adattag
	private static String kiado = "Mora Kiado";

	public Konyv(String cim, String szerzo, int ar, int oldalszam) {
		this.cim = cim;
		this.szerzo = szerzo;
		//this.megjelenes_eve = megjelenes_eve;
		this.megjelenes_eve = LocalDate.now().getYear();

		if (ar < 0 || oldalszam < 0)
			throw new IllegalArgumentException();			

		this.ar = ar;
		this.oldalszam = oldalszam;
	}	

	public Konyv(String cim, String szerzo, int oldalszam) {
		//Java 6, 7
		//this(cim, szerzo, 1900 + new Date().getYear(), 2500);
		//this(cim, szerzo, Calendar.getInstance().get(Calendar.YEAR), 2500);

		//Java 8
		//this(cim, szerzo, LocalDate.now().getYear(), 2500);
		//this(cim, szerzo, LocalDate.now().getYear(), 2500);
		this(cim, szerzo, 2500, oldalszam);
		
		//Date mai_nap = new Date();		
		//this.megjelenes_eve = mai_nap.getYear();
		
		//Calendar kalendarium = java.util.Calendar.getInstance();
		//kalendarium.setTime(mai_nap);
		//this.megjelenes_eve = kalendarium.get(Calendar.YEAR);
		
		//LocalDate aktualis_datum = java.time.LocalDate.now();
		//this.megjelenes_eve = aktualis_datum.getYear();
		
		//this.ar = 2500;
	}	
	
	public void arat_szazalekkal_novel(int szazalek) {
		ar *= (1 + szazalek / 100.0);
	}
	
	@Override
	public String toString() {
		return szerzo + ": " + cim 
				+ " (" 
				+ kiado 
				+ ", " 
				+ megjelenes_eve 
				+ ", " 
				+ oldalszam
				+ " old., "
				+ ar 
				+ " Ft)";
	}

	public String getCim() {
		return cim;
	}

//	public void setCim(String cim) {
//		this.cim = cim;
//	}

	public String getSzerzo() {
		return szerzo;
	}

//	public void setSzerzo(String szerzo) {
//		this.szerzo = szerzo;
//	}

	public int getMegjelenes_eve() {
		return megjelenes_eve;
	}

//	public void setMegjelenes_eve(int megjelenes_eve) {
//		this.megjelenes_eve = megjelenes_eve;
//	}

	public int getAr() {
		return ar;
	}

	public void setAr(int ar) {
		this.ar = ar;
	}
	
	//Írjon metódust, amely igazat ad, ha a könyv címe megegyezik
	//a paraméterként kapott könyv címével, hamisat ha nem!
	public boolean cimEgyezikE(Konyv masikKonyv) {
		return cim.equals(masikKonyv.cim);
	}
	
	//Írjon metódust, amely két paraméterként kapott könyv közül a hosszabbat adja vissza!
	public static Konyv hosszabbKonyv(Konyv egyik_konyv, Konyv masik_konyv) {
		if (egyik_konyv.oldalszam > masik_konyv.oldalszam) {
			return egyik_konyv;
		} else {
			return masik_konyv;
		}
	}
	
	//Írjon metódust, amely igazat ad vissza, ha a könyv oldalszáma páros!
	public boolean oldalszamParosE() {
		return oldalszam % 2 == 0;
	}

}