/*
Készítsen ugyanebben a csomagban Téglatest osztályt,
amely a Hasáb leszármazottja!
Adattagjai: az alap két oldala (double)
Konstruktor: a három adattagot a paraméterben megkapott értékkel inicializálja
Metódusok:
- definiálja felül az örökölt alapterületet visszaadó metódus,
- definiálja felül a toString() metódust:
ez összefûzve adja vissza a téglatest alapjának oldalait és magasságát!
 */
package geometria;

public class Teglatest extends Hasab {
	private double aOldal;
	private double bOldal;	
	
	public Teglatest(double magassag, double aOldal, double bOldal) {
		super(magassag);
		this.aOldal = aOldal;
		this.bOldal = bOldal;
	}

	@Override
	public double alapterulet() {
		return aOldal * bOldal;
	}

	@Override
	public String toString() {
		return "a oldal: " + aOldal 
				+ ", b oldal: " + bOldal 
				+ ", magassag: " + getMagassag();
	}
}
