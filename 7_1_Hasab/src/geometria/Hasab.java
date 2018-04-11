/*
Készítsen saját csomagban Hasáb absztrakt osztályt!
Adattagja: magasság (int)
Konstruktora: a paraméterben kapott értékkel inicializálja a magasságot
Metódusok:
- getter metódus, amely visszaadja a magasságot,
- abstract metódus az alapterület visszaadására,
- metódus a térfogat visszaadására,
- összehasonlító metódus, amely igazat ad,
ha a hasáb nagyobb térfogatú, mint egy paraméterben kapott másik hasáb térfogata.
 */
package geometria;

public abstract class Hasab {
	private double magassag;

	public Hasab(double magassag) {
		this.magassag = magassag;
	}

	public double getMagassag() {
		return magassag;
	}

	//abstract metódus az alapterület visszaadására
	public abstract double alapterulet();

	public double terfogat() {
		return alapterulet() * magassag;
	}
	
	public boolean nagyobbTerfogatuMint(Hasab masikHasab) {
		return terfogat() > masikHasab.terfogat();

	}
}
