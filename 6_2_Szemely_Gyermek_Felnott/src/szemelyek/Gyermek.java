/*
Készítsen ugyanebben a csomagban Gyermek és Felnõtt osztályokat
a Személy osztály leszármaztatásával!
Adattagjaik: iskola (a Gyermek osztályban, String)
Konstruktoraik: három paraméterben kapott értékkel
inicializálják az adattagokat
Metódusaik:
- Mindkét osztályban definiálja felül az adatokat String-ben összefûzõ öröklött metódust!
- Adja vissza a Gyermek iskoláját!
 */
package szemelyek;

public class Gyermek extends Szemely {
	private String iskola;

	public Gyermek(String nev, int kor, String iskola) {
		super(nev, kor);
		this.iskola = iskola;
	}	
	
	@Override
	public String toString() {
		return "Gyermek [" 
				+ super.toString()
				+ ", iskola: " 				
				+ getIskola() 
				+ "]";
	}

	public String getIskola() {
		return iskola;
	}	
}
