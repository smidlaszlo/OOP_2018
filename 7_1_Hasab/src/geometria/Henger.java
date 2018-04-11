/*
Ugyanebben a csomagban készítsen Henger osztályt,
amely a Hasáb leszármazottja!
Adattagja: sugár (double)
Konstruktor: a paraméterben kapott sugár és magasság
értékekkel inicializálja az objektumot
Metódusok:
- definiálja felül az örökölt alapterületet visszaadó metódust,
- definiálja felül a toString() metódust:
ez összefûzve adja vissza a henger sugarát és magasságát!
 */
package geometria;

public class Henger extends Hasab {
	private double sugar;

	public Henger(double magassag, double sugar) {
		super(magassag);
		this.sugar = sugar;
	}

	@Override
	public double alapterulet() {
		return sugar * sugar * Math.PI;
	}

	@Override
	public String toString() {
		return "sugar: " + sugar + ", magassag: " + getMagassag();
	}
}
