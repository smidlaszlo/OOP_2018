/*
Készítsen saját csomagban Személy osztályt (pl. szemelyek.Szemely)!
Adattagjai: név, kor
Konstruktora: két paraméterben kapott értékkel inicializálja az adattagokat!
Metódusai:
- getter metódusok az adattagok lekérdezésére,
- a Személy adatait String-ben összefûzõ és ezzel visszatérõ metódus,
- adjon vissza igazat, ha a paraméterben megadott személy életkora kisebb.
 */
package szemelyek;

public class Szemely {
	private String nev;
	private int kor;	
	
	public Szemely(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
	}

	public String getNev() {
		return nev;
	}

	public int getKor() {
		return kor;
	}

	@Override
	public String toString() {
		return "Nev: " + getNev() + ", kor: " + getKor();
	}
	
	public boolean eletkorNagyobbMint(Szemely masik_szemely) {
		return getKor() >= masik_szemely.getKor();
	}
		
}
