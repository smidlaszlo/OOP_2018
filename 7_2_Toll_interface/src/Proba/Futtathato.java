/*
Készítsen egy futtatható osztályt,
amelyben egy Színezhetõ típusú referenciának 
Szinespont példányt ad értékül,
kiírja az adatait, majd átszinezi
és újra kiírja az adatait!
Ugyanezt próbálja ki egy Toll objektummal is!

Készítsen az osztályba egy statikus metódust,
amely paraméterként egy Színezhetõ objektumot vár
és az objektumot átszinezi alapszínre!

A main-t is egészítse ki úgy,
hogy használja a metódust egy Szinespont példánnyal
és egy Toll példánnyal is!

Készítsen saját Szín osztály, ami ugyanazt tudja,
mint a java.awt.Color osztály, csak a toString()
metódus a színek magyar nevét írja ki!
Használja ezt az objektumok színének kiírásához!
 */
package Proba;

import java.awt.Color;
import sajat.ISzinezheto;
import pontok.SzinesPont;
import termekeim.Toll;
import sajat.Szin;
import sajat.Szin.Szinek;;

public class Futtathato {

	public static void main(String[] args) {

		//ISzinezheto szinesPont = new SzinesPont(Color.BLUE);
		ISzinezheto szinesPont = new SzinesPont(1.0, 1.0, Color.BLUE);

		System.out.println(szinesPont);
		szinesPont.setSzin(Color.GREEN);
		System.out.println(szinesPont);

		Futtathato.setAlapertelmezettSzin(szinesPont);
		System.out.println(szinesPont);

		ISzinezheto toll = new Toll(Color.YELLOW, "parker", 1, 2);
		
		System.out.println(toll);
		toll.setSzin(Color.BLUE);
		System.out.println(toll);

		Futtathato.setAlapertelmezettSzin(toll);
		System.out.println(toll);		
		
		//Szin szin = new Szin(Szinek.valueOf("BLACK"));
		//Szin szin = new Szin(Color.BLACK);
		Szin szin = new Szin(Szinek.BLACK);
		System.out.println(szin);
		
		SzinesPont szinesPont2 = new SzinesPont(Color.WHITE);
		System.out.println(szinesPont2);		
	}

	static void setAlapertelmezettSzin(ISzinezheto obj) {
		//obj.setSzin(obj.alapertelmezettSzin);
		obj.setSzin(ISzinezheto.alapertelmezettSzin);
	}
}
