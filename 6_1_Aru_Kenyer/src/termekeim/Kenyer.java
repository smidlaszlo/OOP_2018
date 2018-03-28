/*
Készítsen az Áru osztállyal azonos csomagban Kenyér osztályt, amely az Áru leszármazottja!
Adattagja: mennyiség (valós, pl. 0.75)
Konstruktora: négy paraméterben kapott adattal inicializálja az objektumot!
Metódusai:
- Definiálja felül a toString metódust! Az õsosztályban definiált metódushoz képest
fûzze hozzá az egységárat (bruttóár/mennyiség)!
- Adja vissza a mennyiséget!
- Hasonlítsa össze két kenyér egységárát!
Az osztályszintû metódus akkor adjon vissza igazat,
ha a paraméterként kapott két Kenyér közül az elsõnek nagyobb az egységára!
 */
package termekeim;

public class Kenyer extends Aru {
	private double mennyiseg;

	public Kenyer(String nev, int netto_ar, int afakulcs, double mennyiseg) {
		super(nev, netto_ar, afakulcs);
		this.mennyiseg = mennyiseg;
	}

	@Override
	public String toString() {
		return "Kenyer [" + super.toString() 
				+ ", egysegar: "
				+ brutto_ar() / mennyiseg
				+ "]";
	}
	
	public double getMennyiseg() {
		return mennyiseg;
	}
	
	public static boolean elso_kenyer_nagyobb_egysegaru(
			Kenyer elso_kenyer, Kenyer masodik_kenyer) {
		return elso_kenyer.brutto_ar() / elso_kenyer.mennyiseg >
				masodik_kenyer.brutto_ar() / masodik_kenyer.brutto_ar();
	}
}
