/*
Készítsen egy Hanglemez osztályt, melynek adattagjai az elõadó, a cím és a hossz (egész)!
- Írjon konstruktort, amely a paraméterként kapott értékekkel inicializálja az adattagokat!
- Írjon metódust, amely egy String-ben összefûzve adja vissza a lemez adatait
a következõ alakban "Elõdó: Cim, hossz perc"!
- Írjon metódust, amely 1-t ad vissza, ha a lemez hosszabb,
mint a paraméterként kapott lemez,
-1-et ad vissza, ha a paraméterként kapott a hosszabb
és 0-t ad, ha egyforma hosszúak!
- Írjon metódust, amely paraméterként egy elõadót kap (String)
és igazat ad, ha a lemeznek õ az elõadója!
(A String-ek tartalmi egyezõségének vizsgálatára használja
a String osztály equals() vagy equalsIgnoreCase() metódusát!)
- Az adattagok értékének lekérdezésére írjon getter metódusokat!
 */
public class Hanglemez {
	private String eloado;
	private String cim;
	private int hossz;

	//konstruktor
	public Hanglemez(String eloado, String cim, int hossz) {
		this.eloado = eloado;
		this.cim = cim;
		this.hossz = hossz;
	}

	public String toString() {
		return eloado + ": " + cim + ", " + hossz + " perc";
	}

	public short hosszabbMint(Hanglemez masikLemez) {
		if (hossz > masikLemez.hossz)
			return 1;
		else if (masikLemez.hossz > hossz) {
			return -1;
		} else {
			return 0;
		}
	}

	public boolean eloado(String eloado) {
		//a kis- es nagybetu kulonbozik
		return this.eloado.equals(eloado);
		//nincs kis- es nagybetuerzekenyseg
		//return this.eloado.equalsIgnoreCase(eloado);
	}

	public String getEloado() {
		return eloado;
	}

	public String getCim() {
		return cim;
	}

	public int getHossz() {
		return hossz;
	}	
}
