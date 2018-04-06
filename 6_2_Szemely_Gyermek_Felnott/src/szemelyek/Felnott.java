/*
Készítsen ugyanebben a csomagban Gyermek és Felnõtt osztályokat
a Személy osztály leszármaztatásával!
Adattagjaik: munkahely (a Felnõtt osztályban, String)
Konstruktoraik: három paraméterben kapott értékkel
inicializálják az adattagokat
Metódusaik:
- Mindkét osztályban definiálja felül az adatokat String-ben összefûzõ öröklött metódust!
- Adja vissza a Felnõtt munkahelyét!

 */
package szemelyek;

public class Felnott extends Szemely {
	private String munkahely;

	public Felnott(String nev, int kor, String munkahely) {
		super(nev, kor);
		this.munkahely = munkahely;
	}

	@Override
	public String toString() {
		return "Felnott [" 
				+ super.toString()
				+ ", munkahely: " 				
				+ getMunkahely()
				+ "]";
	}
	
	public String getMunkahely() {
		return munkahely;
	}	
}
