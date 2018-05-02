//Készítsen a SajatKonzol osztályhoz
//kipróbáló osztályt!
package sajat;

public class SajatKonzolProba {

	public static void main(String[] args) {
		int egeszSzam;
		double valosSzam;

		egeszSzam = SajatKonzol.egeszSzamotBeolvas("Nem egesz szam lett beolvasva!");
		
		System.out.println("A beirt egesz szam: " + egeszSzam);
		
		valosSzam = SajatKonzol.valosSzamotBeolvas("Nem valos szam lett beolvasva!");
		//valosSzam = SajatKonzol.valosSzamotBeolvas2("Nem valos szam lett beolvasva!");
		
		System.out.println("A beirt valos szam: " + valosSzam);
	}

}
