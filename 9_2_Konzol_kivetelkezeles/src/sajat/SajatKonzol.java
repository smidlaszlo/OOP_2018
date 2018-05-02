/*
Készítsen a sajat csomagban SajatKonzol osztályt,
amelynek van egy
public static int egeszSzamotBeolvas(String uzenet)
metódusa, amelyben beolvas a konzolról a Scanner osztály
nextLine() metódusával egy egész számot,
de ha NumberFormatException merül fel az átalakítás során,
akkor kiír egy üzenetet, majd újra kéri a számot!

Egészítsük ki egy double számot beolvasó metódussal,
amely hasonlóan mûködik, mint az egészet beolvasó,
de most a beolvasáshoz használja a Console osztályt
és dobjon NemTamogatottConsoleException-t,
ha a Console nem támogatott!
*/
package sajat;

import java.io.Console;
import java.util.Scanner;
import kivetelek.NemTamogatottConsoleException;

public class SajatKonzol {
	public static int egeszSzamotBeolvas(String uzenet) {
		int egeszSzam = 0;
		boolean rosszBeolvasas = true;

		@SuppressWarnings("resource")
		Scanner beolvasas = new Scanner(System.in);

		do {
			try {
				System.out.println("Kerek egy egesz szamot!");
				System.out.print("szam:");
				
				String szamString = beolvasas.nextLine();
				egeszSzam = Integer.parseInt(szamString);

				rosszBeolvasas = false;
			}
			catch (NumberFormatException kivetel) {
				System.out.println(uzenet);
			}
		} while (rosszBeolvasas);

		return egeszSzam;
	}

	//Egészítsük ki egy double számot beolvasó metódussal,
	//amely hasonlóan mûködik mint az egészet beolvasó metódus,
	//de most a beolvasáshoz használja a Console osztályt,
	//és dobjon NemTamogatottConsoleException-t, ha a Console nem támogatott!
	public static double valosSzamotBeolvas(String uzenet) {
		double valosSzam;
		Console konzol;

		try {
        	konzol = System.console();
			
			if (konzol == null)
				throw new NemTamogatottConsoleException();
			
			do {
				try {
					System.out.println("Kerek egy valos szamot!");
					
					String szamString = konzol.readLine("szam:");				
					valosSzam = Double.parseDouble(szamString);
					
					return valosSzam;
				}
				catch (java.lang.NumberFormatException kivetel) {
					System.out.println(uzenet);
				} 
			} while (true);
		} 
		catch (NemTamogatottConsoleException sajatKivetel) {
			System.out.println(sajatKivetel.getMessage());
			throw new RuntimeException();
		}

	}

	
	public static double valosSzamotBeolvas2(String uzenet) {
		double valosSzam;
		Console konzol;

        konzol = System.console();
			
		do {
			try {
				System.out.println("Kerek egy valos szamot!");
					
				String szamString = konzol.readLine("szam:");				
				valosSzam = Double.parseDouble(szamString);
					
				return valosSzam;
			}
			catch (java.lang.NumberFormatException kivetel) {
				System.out.println(uzenet);
			}				
			catch (NullPointerException kivetel) {
				
				System.out.println("Nincs konzol objektum!");
				try {
					throw new NemTamogatottConsoleException();
				} catch (NemTamogatottConsoleException e) {
					//System.out.println(kivetel.getMessage());
					//e.printStackTrace();
					throw new RuntimeException();
				}
			}				
		} while (true); 

	}
	
}
