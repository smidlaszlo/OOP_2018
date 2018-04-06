/*
A Felnõtt osztály kiterjesztéseként
hozzon létre ugyanabban a csomagban
egy Alkalmazott osztályt!
Adattagja: fizetés (egész), nyugdíjkorhatár (osztályszintû, egész: értéke 65)
Konstruktora: négy paraméterben kapott értékkel inicializálja az adattagokat
Metódusai:
- Adja vissza a fizetést!
- Definiálja felül az adatokat String-ben összefûzõ öröklött metódust!
 */
package szemelyek;

public class Alkalmazott extends Felnott {
	private static int nyugdijkorhatar = 65;
	private long fizetes;

	public Alkalmazott(String nev, int kor, String munkahely, long fizetes) {
		super(nev, kor, munkahely);
		this.fizetes = fizetes;
	}

	public long getFizetes() {
		return fizetes;
	}

	@Override
	public String toString() {
		return "Alkalmazott [" 
				+ super.toString()
				+ ", fizetes: " 
				+ getFizetes() 
				+ " Ft, evek szama nyugdijig: "
				+ (nyugdijkorhatar - getKor())
				+ "]";
	}

	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}	

}
