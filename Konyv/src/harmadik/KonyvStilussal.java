/*Tag 4Oroklodes

A korábbi saját csomagban definiált Könyv osztály
leszármazottjaként készítsen egy másik csomagban
KönyvStílussal osztályt!
Adattagjai: stílus (szöveg)
Konstruktora: minden adatát paraméterben kapott adatokkal inicializálja!
Metódusai:
- Adja vissza a stílust!
- Definiálja felül az õsosztálybeli String-et visszaadó metódust úgy,
hogy az õsbeli sztringhez fûzze hozzá a stílust is!
 */
package harmadik;

import sajat.Konyv;

public class KonyvStilussal extends Konyv {
	private String stilus;

	public KonyvStilussal(String cim, String szerzo, int ar, int oldalszam, String stilus) {
		super(cim, szerzo, ar, oldalszam);
		this.stilus = stilus;
	}

	public String getStilus() {
		return stilus;
	}

	@Override
	public String toString() {
		return "Konyv stilussal ["
				+ super.toString()
				+ ", stilus: "
				+ getStilus()  
				+ "]";
	}

}
