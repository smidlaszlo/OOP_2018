/*
Készítsen másik csomagban Pont osztályt!
Adattagja: x és y koordináta (int)
Konstruktor: két megkapott paraméterrel inicializálja az adattagokat
Metódus:
- Definiálja felül a toString() metódust,
amely Stringben összefûzve adja vissza a pont adatait!

 */
package pontok;

public class Pont {
	private double x;
	private double y;
	
	public Pont(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x: " + x + ", y: " + y;
	}	
}
