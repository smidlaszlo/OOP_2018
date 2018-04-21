/*
Készítsen osztályt új csomagban KonyvEnummal néven
a korábbi saját csomagban definiált Könyv osztály
leszármazottjaként!
Legyen benne public beágyazott felsorolás típus
Stilus néven a könyv stílusának megadásához
a következõ konstansokkal:
SCIFI, SZAKACS, ROMANTIKUS, EGYEB.
Adattagja: Stilus típusú stílus adattag
Konstruktor: minden adattagot a paraméterben kapott értékekkel inicializálja
Metódusok:
- Definiálja felül a toString metódust úgy,
hogy az õsbelihez még fûzze hozzá a stílust!
- Getter metódus a stílus lekérdezésére!
 */
package negyedik;

import sajat.Konyv;

public class KonyvEnummal extends Konyv{
	public enum Stilus {
		SCIFI, SZAKACS, ROMANTIKUS, EGYEB
	}
	
	private Stilus stilus;

	public KonyvEnummal(String cim, String szerzo, int ar, int oldalszam, Stilus stilus) {
		super(cim, szerzo, ar, oldalszam);
		this.stilus = stilus;
	}

	@Override
	public String toString() {
		return super.toString() + ", stilus: " + getStilus();
	}

	public Stilus getStilus() {
		return stilus;
	}
}
