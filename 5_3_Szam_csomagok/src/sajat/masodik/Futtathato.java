/*
Készítsen egy futtatható osztályt a sajat.masodik nevû csomagban,
amelyben létrehoz egy Számot, melynek értéke 0-1 közötti intervallumba esik,
és eltárolja egy final lokális változóban!
Generáljon ciklusban 0-1 közötti valós számokat
és írja ki azokat addig, amíg egyezõt nem talál
a létrehozott Számmal (különbségük a tûrésen belül van)!
Írja ki hányadiknak állította elõ ezt a számot!
- Próbálja ki, hogy meg tudja-e változtatni a Szám adattagjának értékét!
- Próbálja ki, hogy meg tudja-e változtatni a referenciájának az értékét!
 */

//az elso mindig a package (csomagdeklaracio),
//utana az import (importdeklaraciok)
//legvegen a tipusdeklaraciok (osztaly, vagy interface)
package sajat.masodik;

import sajat.elso.Szam;

public class Futtathato {

	public static void main(String[] args) {
		//ha nincs import
		//final sajat.elso.Szam valosSzam = new sajat.elso.Szam(Math.random());
		final Szam valosSzam = new Szam(Math.random());
		double valosVeletlenSzam;
		int darabszam = 0;

		System.out.println("Valos szam objektumunk adatai:");
		//Object osztaly toString() metodusanak eredmenye
		System.out.println(valosSzam);
		
		do {
			darabszam++;
			valosVeletlenSzam = Math.random();
			//System.out.println(valosVeletlenSzam);
		} while (!valosSzam.szamTuresenBelulVanE(valosVeletlenSzam));

		System.out.println("Az objektum valosSzam adattagjanak erteke:\n" 
				+ valosSzam.getValosSzam()); 
		
		System.out.println("A generalt valos szam:\n" 
				+ valosVeletlenSzam); 
		
		System.out.println("A generalasok szama: " + darabszam);		

		//Próbálja ki meg tudja-e változtatni 
		//a Szam adattagjának értékét!
		//igen, megvaltoztathato,
		//mert az adattag modosithato setter-rel, nem final, nem konstans
		valosSzam.setValosSzam(3.14);
		System.out.println("Az uj adattag erteke: " 
					+ valosSzam.getValosSzam());
		
		//Próbálja ki meg tudja-e változtatni 
		//a referenciájának értékét!
		//nem valtoztathato meg, mert a referencia final
		//valosSzam = null;
		//valosSzam = new Szam(5.67);
	}
}
