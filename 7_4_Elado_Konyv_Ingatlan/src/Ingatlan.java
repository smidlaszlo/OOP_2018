/*
Készítsen Ingatlan osztályt,
amely implementálja az IElado interfészt!

Adattagjai: ár, devizanem, méret (int), hely (város)
Konstruktor: négy paraméter megadásával inicializálja az adatokat
Metódusok:
- Az ingatlan méretébõl és árából számítsa ki a négyzetméter árat!
- Átszámítja az ingatlan árát euróra!
- Definiálja felül a toString() metódust!
 */
public class Ingatlan implements IElado {

	private int ar;
	private String devizanem;
	private int meret;
	private String hely;

	public Ingatlan(int ar, String devizanem, int meret, String hely) {
		this.ar = ar;
		this.devizanem = devizanem;
		this.meret = meret;
		this.hely = hely;
	}

	public int negyzetmeterenkentiAr() {
		return ar / meret;
	}

	@Override
	public String toString() {
		return "Ingatlan [" 
				+ hely
				+ ", "
				+ meret 
				+ " m2, "
				+ getAr() 
				+ ", " 
				+ negyzetmeterenkentiAr()
				+ " "
				+ devizanem
				+ "/m2]";
	}

	public void atvaltEurora(int arfolyam) {
		setAr(ar / arfolyam, "EUR");
	}
	
	@Override
	public String getAr() {
		return ar + " " + devizanem;
	}

	@Override
	public void setAr(int ar, String devizanem) {
		this.ar = ar;
		this.devizanem = devizanem;
	}
}
