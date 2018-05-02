/*
Definiáljon egy tartalyos.Tarolo nevû osztályt!

Definiáljon benne a térfogat (egész) tárolásához adattagot!
Legyen konstruktora, amely paraméterként kapott adattal inicializálja az adattagot!
Legyen egy absztrakt metódusa, amelynek nincs paramétere és visszaadja,
hogy a Tarolo veszélyes-e!
Legyen metódusa, amely visszaadja a térfogatot!
 */
package tartalyos;

public abstract class Tarolo {

	private int terfogat;

	public Tarolo(int terfogat) {
		this.terfogat = terfogat;
	}
	
	public abstract boolean veszelyesE();

	public int getTerfogat() {
		return terfogat;
	}
	
}
