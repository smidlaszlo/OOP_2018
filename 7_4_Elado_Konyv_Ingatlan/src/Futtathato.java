/*
Készítsen egy futtatható osztályt,
amelyben egy IElado típusú referenciának 
Ingatlan példányt ad értékül,
kiírja az adatait,
majd átszámítja az árát euróra 
és újra kiírja az adatait!
Ugyanezt próbálja ki egy Könyv objektummal is!
 */
public class Futtathato {
	public static void main(String[] args) {
		int euroarfolyam = 311;
		IElado ingatlan = new Ingatlan(500000, "Ft", 50, "Miskolc");

		System.out.println(ingatlan);
		((Ingatlan)ingatlan).atvaltEurora(euroarfolyam);;
		System.out.println(ingatlan);

		IElado konyv = new Konyv("Cim", "Szerzo", 3500, 250);
		System.out.println(konyv);
		//konyv.setAr(((Konyv)konyv).brutto_ar() / euroarfolyam, "EUR");
		konyv.setAr(((Aru)konyv).brutto_ar() / euroarfolyam, "EUR");
		System.out.println(konyv);
	}
	
}
