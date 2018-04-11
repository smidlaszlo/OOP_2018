/*
Készítsen új csomagban egy olyan osztályt,
amely hasábokat képes tárolni!
Adattagja: Hasáb típusú tömb adattag
Konstruktor: paraméterben megkapja a hasábok maximális számát
és ezzel a mérettel hozza létre a tömböt!
Metódusok:
- setter metódus, amely paraméterben megkap egy indexet és egy hasábot,
majd a tömb adott indexû elemének értékül adja a kapott hasáb referenciáját,
- getter metódus, amely visszaadja a tömb méretét,
azaz a hasábok maximális számát,
- getter metódus, amely paraméterként egy indexet kap
és visszaadja a tömb adott indexû elemét,
- getter metódus, amely visszaadja,
hogy hány darab nem null értékû tömbelem van,
- getter metódus, amely visszaadja a hasábok átlagos térfogatát,
- getter metódus, amely visszadja a Henger típusú hasábok számát!
 */
package hasznalo;

import geometria.*;

public class Hasabok {
	Hasab[] hasabtomb;

	public Hasabok(int meret) {
		hasabtomb = new Hasab[meret];
	}

	public void setHasab(int index, Hasab hasab) {
		hasabtomb[index] = hasab;
	}
	
	public int meret() {
		return hasabtomb.length;
	}

	public Hasab getHasab(int index) {
		if (index >= 0 && index < meret()) {
			return hasabtomb[index];
		} else
			return null;
	}

	public int nemNullHasab() {
		int darab = 0;
		
		for (int i = 0; i < meret(); i++)
			if (hasabtomb[i] != null)
				darab++;

		return darab;
	}

	public double atlagosTerfogat() {
		double szumma = 0;
		int darab = 0;
		
		for (int i = 0; i < meret(); i++) {
			if (hasabtomb[i] != null) {
				szumma += hasabtomb[i].terfogat();
				darab++;
			}
		}
		
		if (darab != 0) {
			return szumma / darab;
		} else {
			return 0;
		}
	}
	
	public int hengerekSzama() {
		int darab = 0;
		
		for (int i = 0; i < meret(); i++) {
			if (hasabtomb[i] instanceof Henger) {
				darab++;
			}
		}
		
		return darab;
	}
}
