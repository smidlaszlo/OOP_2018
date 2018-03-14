/*
Készítsen egy Téglalap osztályt két adattaggal az oldalak tárolásához (egészek)!
- Írjon konstruktort, amely két paraméterként kapott értékkel inicializál!
- Írjon konstruktort, amely, amely egy paraméterként kapott értékkel inicializálja
mindkét adattagot (négyzet)!
- Írjon metódust, amely visszaadja a területet!
- Írjon metódust, amely egy String-be összefûzve adja vissza a téglalap adatait
a következõ alakban: "a_oldal, b_oldal: terület"!
- Írjon setter metódust, amely beállítja a téglalap oldalait a paraméterként kapott két értékkel!
- Írjon setter metódust, amely beállítja a téglalap oldalait a paraméterként kapott egyetlen
értéket adva mindkét oldalnak!
- Írjon metódust, amely igazat ad, ha a téglalap nagyobb területû,
mint a paraméterként kapott téglalap, hamisat ad ha nem!
- Írjon metódust, amely igazat ad, ha a téglalap oldalai megegyeznek
a paraméterként kapott téglalap oldalaival, hamisat ha nem!
 */
public class Teglalap {
	private int a_oldal;
	private int b_oldal;
	
	//konstruktorok
	public Teglalap() {
		//this(1, 1);
		this(1);
	}
	
	public Teglalap(int a_oldal, int b_oldal) {
		//this.a_oldal = a_oldal;
		//this.b_oldal = b_oldal;
		setOldal(a_oldal, b_oldal);
	}
	
	public Teglalap(int oldalhossz) {
		//this.a_oldal = b_oldal = oldalhossz;
		//setOldal(oldalhossz);
		this(oldalhossz, oldalhossz);
	}
	
	public int terulet() {
		return a_oldal * b_oldal;
	}

	@Override
	public String toString() {
		return a_oldal + ", " + b_oldal + ": " + terulet();
		/*
		return String.format("%2d", a_oldal) + ", " 
				+ String.format("%2d", b_oldal) 
				+ ": " + terulet();
		 */		
	}
	
	public void setOldal(int a_oldal, int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	
	public void setOldal(int oldalhossz) {
		//this.a_oldal = b_oldal = oldalhossz;
		setOldal(oldalhossz, oldalhossz);
	}
	
	public boolean nagyobbTeruletuMint(Teglalap masikTeglalap) {
		return terulet() > masikTeglalap.terulet();
	}
	
	public boolean egyenloE(Teglalap masikTeglalap) {
		return a_oldal == masikTeglalap.a_oldal
				&& b_oldal == masikTeglalap.b_oldal;
	}	
}
