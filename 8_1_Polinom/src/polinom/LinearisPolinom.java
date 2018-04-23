/*
Definiáljon egy polinom.LinearisPolinom osztályt,
amely egy elsõfokú egyváltozós polinomot reprezentál
(képlete: y=ax+b)!
Adattagjai: a polinom együtthatói (a és b), valós számok
Konstruktor: két paraméterben megadott értékkel
inicializálja az adattagokat
Metódusai:
- Implementálja a IPolinom interfész metódusait!
- Definiálja felül a toString metódust,
amely a polinom képletét adja vissza egy string-ben
a konkrét együtthatókkal (Pl.: y=2x-3)!
 */
package polinom;

import matematika.IPolinom;

public class LinearisPolinom implements IPolinom {

	//a polinom egyutthatoi
	//y = ax + b
	private double a;
	private double b;
	
	public LinearisPolinom(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double szamol(double valosSzam) {
		return a * valosSzam + b;
	}

	@Override
	public int getPolinomFoka() {
		if (a == 0)
			return 0;
		else
			return 1;
	}

	@Override
	public String toString() {
		return "y=" + a + "x" 
				+ (b < 0 ? "" : "+") + b;
	}

}
