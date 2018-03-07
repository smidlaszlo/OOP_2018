
//Készítsen egy futtatható osztályt,
//amelyben beolvassa egy személy adatait és kiírja!

import java.util.Scanner;

public class Szemely_futtathato {

	public static void main(String[] args) {

		Scanner adatBekeres = new Scanner(System.in);
		// java.util.Scanner adatBekeres = new java.util.Scanner(System.in);

		System.out.println("Kérem adja meg a nevet!\nnév:");
		String nev = adatBekeres.nextLine();

		System.out.println("Kérem adja meg a testtömeget!\ntesttömeg [kg]:");
		String testtomeg = adatBekeres.nextLine();

		System.out.println("Kérem adja meg a magasságot!\nmagasság [m]:");
		String magassag = adatBekeres.nextLine();

		int egeszTomeg = Integer.parseInt(testtomeg);
		double valosMagassag = Double.parseDouble(magassag);

		Szemely szemely = new Szemely();
		szemely.setNev(nev);
		szemely.setTesttomeg(egeszTomeg);
		szemely.setMagassag(valosMagassag);

		System.out.println(szemely);
		
		System.out.println("Módosított index:");
		System.out.println(szemely.modositott_testTomegIndex());
		
		adatBekeres.close();
	}
	
}
