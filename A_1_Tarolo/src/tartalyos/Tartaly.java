/*
Definiáljon egy tartalyos.Tartaly osztályt, amely egy valamilyen gázt tárol nagy nyomáson!
Legyen a tartalyos.Tarolo osztály leszármazottja!

Legyen adattagja a tartály nyomásának (valós) tárolására;
valamint egy konstruktora, amely paraméterben kapott adatokkal inicializálja az objektumot!

Definiálja felül a veszélyességet visszaadó metódust úgy,
hogy akkor adjon igazat, ha a térfogat*nyomás>100!

Legyen egy toString felüldefiniálás, amely a tartály térfogatát,
nyomását és hogy „veszélyes” vagy „nem veszélyes” adja vissza egy string-be összefûzve!

Legyen egy metódusa, amely igazat ad, ha a tartály nagyobb nyomású,
mint egy paraméterként kapott tartály!

Legyen egy osztályszintû metódusa,
amely két paraméterként kapott tartály közül a nagyobb térfogatút adja vissza!
 */
package tartalyos;

public class Tartaly extends Tarolo {
	private double nyomas;

	public Tartaly(int terfogat, double nyomas) {
		super(terfogat);
		this.nyomas = nyomas;
	}

	@Override
	public boolean veszelyesE() {
		if (getTerfogat() * nyomas > 100) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Tartaly terfogata=" + getTerfogat() 
			+ ", nyomasa=" + String.format("%.2f", nyomas)
			+ ", " + (veszelyesE() ? "veszelyes" : "nem veszelyes");
	}
	
	public boolean nagyobbNyomasuMint(Tartaly masikTartaly) {
		return nyomas > masikTartaly.nyomas;
	}
	
	public static Tartaly nagyobbTerfogatuTartaly(Tartaly elsoTartaly, Tartaly masodikTartaly) {
		if (elsoTartaly.getTerfogat() > masodikTartaly.getTerfogat()) {
			return elsoTartaly;
		} else {
			return masodikTartaly;
		}
	}
}
