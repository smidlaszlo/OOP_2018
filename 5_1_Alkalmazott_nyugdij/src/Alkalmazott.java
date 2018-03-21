/*
Készítsen egy Alkalmazott osztályt név, kor és fizetés adatokkal!
- Legyen egy osztályszintû adattagja a nyugdíjkorhatár tárolására,
értéke kezdetben legyen 65!
- Legyen 2 konstruktora!
Az egyik a paraméterként kapott név, kor és fizetés értékekkel
inicializálja az adattagokat.
A másiknak csak a nevet és a kort kell megadni, a fizetés 10000*kor.
- Legyen metódusa, amely visszadja hány éve van még nyugdíjig!
- Legyen metódusa, amely String-be összefûzve adja vissza az Alkalmazott adatait,
hozzáfûzve a nyugdíjig hátrelevõ éveinek számát is!
- Legyen metódusa, amely a paraméterként kapott értékre állítja be a nyugdíjkorhatárt!
- Legyen metódusa, amely a paraméterként kapott két Alkalmazott közül azt adja vissza,
amelyiknek több éve van még hátra a nyugdíjig!
 */
public class Alkalmazott {

	private String nev;
	private int kor;
	private long fizetes;
	
	private static int nyugdijkorhatar = 65;

	public Alkalmazott(String nev, int kor, long fizetes) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	
	public Alkalmazott(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = 10000 * kor;
	}
	
	public int hanyEvVanHatraANyugdijig() {
		return nyugdijkorhatar - kor;
	}

	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev 
				+ ", kor=" + kor 
				+ ", fizetes=" + fizetes 
				+ ", evek szama nyugdijig="
				+ hanyEvVanHatraANyugdijig() + "]";
	}

	public static void setNyugdijkorhatar(int nyugdijkorhatar) {
		Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
	}	
	
	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}

	public static Alkalmazott tobbEveVanHatraNyugdijig(Alkalmazott elsoAlkalmazott, Alkalmazott masodikAlkalmazott) {
		if (elsoAlkalmazott.hanyEvVanHatraANyugdijig() >
			masodikAlkalmazott.hanyEvVanHatraANyugdijig()) {
			return elsoAlkalmazott;
		} else {
			return masodikAlkalmazott;
		}
	}
	
}
