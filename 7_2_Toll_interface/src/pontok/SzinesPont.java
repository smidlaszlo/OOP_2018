/*
Készítsen Szinespont osztályt a Pont osztályból származtatva!
Adattagja: szín
Konstruktor:
- Csak a szín paraméter megadásával inicializálja az adatokat!
- Három megkapott paraméterrel inicializálja az adatokat!
Metódus:
- Definiálja felül az Object osztálytól örökölt toString() metódust!
- Implementálja a Színezhetõ interfészt!
 */
package pontok;

import java.awt.Color;
import sajat.ISzinezheto;
import sajat.Szin;

public class SzinesPont extends Pont implements ISzinezheto {
	private Color szin;
	private Szin szinkod;
		
	public SzinesPont(Color szin) {
		this(0, 0, szin);
	}

	public SzinesPont(double x, double y, Color szin) {
		super(x, y);
		this.szin = szin;
		szinkod = new Szin(szin);
	}

	@Override
	public String toString() {
		//return super.toString() + ", szin: " + szin;
		return super.toString() + ", szin: " + szinkod;
	}

	@Override
	public Color getSzin() {
		return szin;
	}

	@Override
	public void setSzin(Color szin) {
		this.szin = szin;
		szinkod.setSzinKod(szin);
	}
}
