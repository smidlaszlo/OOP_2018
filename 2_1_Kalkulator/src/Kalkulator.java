
import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
/*
 Írja meg a 4 alapmûveletet megvalósító Kalkulátor programot Java nyelven!
 Az elvégzendõ mûveletet és az operandusokat a felhasználó adja meg.
 A program a megadott mûvelettõl függõen végzi el a számítási feladatot.
 A mûvelet vizsgálatához használja a switch utasítást.
 Az osztás mûvelet végrehajtásakor ügyeljen az operandusok típusára,
 és ne engedje a 0-val való osztást.

A felhasználói input megadását próbálja meg kétféleképpen:
1. Külön olvassa be a két operandust (számok) és külön az operátort (char)!
Használja a Scanner osztály nextXXX metódusait!
*/
		Scanner bemenet = new Scanner(System.in);
		//vagy import vagy kiirjuk a csomagok neveit
		//java.util.Scanner bemenet2 =  new java.util.Scanner(System.in);		
		
		System.out.println("Kerem adja meg az 1. operandust!");
		System.out.println("1. operandus:");
		double elso_operandus = bemenet.nextDouble();

		System.out.println("Kerem adja meg a 2. operandust!");
		System.out.println("2. operandus:");
		double masodik_operandus = bemenet.nextDouble();

		System.out.println("Kerem adja meg a muveletet (az operatort)!");
		System.out.println("a muvelet:");
		//.next() space-ig olvas, .nextLine() space-t is olvas, es az ujsor karakter is 
		String operator = bemenet.nextLine();//a megmaradt ujsort olvassa be
		operator = bemenet.nextLine();//operator beolvasasa

/*		
		//1.7-tol a switch-ben lehet sztring is
		switch (operator) {////ez egy sztring
			case "+":
				System.out.println("az osszeadas eredmenye");
				System.out.println(elso_operandus + " + " + masodik_operandus + " = " +
						(elso_operandus + masodik_operandus));
				break;

			case "-":
				System.out.println("a kivonas eredmenye");
				System.out.println(elso_operandus + " - " + masodik_operandus + " = " +
						(elso_operandus - masodik_operandus));
				break;

			case "*":
				System.out.println("a szorzas eredmenye");
				System.out.println(elso_operandus + " * " + masodik_operandus + " = " +
						(elso_operandus * masodik_operandus));
				break;

			case "/":
				
				if (masodik_operandus == 0) {
					System.out.println("0-val nem lehet osztani! Vegtelent fog adni eredmenyul.");
				}

				System.out.println("az osztas eredmenye");
				System.out.println(elso_operandus + " / " + masodik_operandus + " = " +
						(elso_operandus / masodik_operandus));
				break;
				
			default:
				System.out.println("Nem a 4 alapmuvelet (+, -, *, /) egyiket adta meg!");
				break;
		}
*/
		
		//1.7 alatt a switch-ben csak egesz kifejezes lehet
		switch (operator.charAt(0)) {//ez egy karakter
			case '+':
				System.out.println("az osszeadas eredmenye");
				System.out.println(elso_operandus + " + " + masodik_operandus + " = " +
						(elso_operandus + masodik_operandus));
				break;

			case '-':
				System.out.println("a kivonas eredmenye");
				System.out.println(elso_operandus + " - " + masodik_operandus + " = " +
						(elso_operandus - masodik_operandus));
				break;

			case '*':
				System.out.println("a szorzas eredmenye");
				System.out.println(elso_operandus + " * " + masodik_operandus + " = " +
						(elso_operandus * masodik_operandus));
				break;

			case '/':
				
				if (masodik_operandus == 0) {
					System.out.println("0-val nem lehet osztani! Vegtelent fog adni eredmenyul.");
				}

				System.out.println("az osztas eredmenye");
				System.out.println(elso_operandus + " / " + masodik_operandus + " = " +
						(elso_operandus / masodik_operandus));
				break;
				
			default:
				System.out.println("Nem a 4 alapmuvelet (+, -, *, /) egyiket adta meg!");
				break;
		}

/*
2. Egyetlen sztringként olvassa be az inputot space-el elválasztva a tagokat (pl.: 3 + 5)!
A beolvasott sztringet a space-ek mentén szét kell bontani tagokra a split metódussal,
melynek paramétere egy sztring (a tagoló karaktersorozat).
Az eredmény egy sztring tömb, melynek egyes elemeit a megfelelõ típusra konvertálva
kapjuk meg az operandusokat (a csomagoló osztályok parseXXX metódusait használva) és az operátort. 		
 */
		
		System.out.println("Kerem adja meg a kiszamitando kifejezest!");
		System.out.println("a kifejezes:");
		String kifejezes = bemenet.nextLine();//space-t is olvas
		
		//String[] eredmenytomb = kifejezes.split(" ");
		String eredmenytomb[] = kifejezes.split(" ");
		
		elso_operandus = Double.parseDouble(eredmenytomb[0]);
		masodik_operandus = Double.parseDouble(eredmenytomb[2]);
		operator = eredmenytomb[1];
		
		alapmuveletek(elso_operandus, masodik_operandus, operator);

		bemenet.close();
	}//public static void main
	
	public static void alapmuveletek(double elso_operandus, double masodik_operandus, String operator) {

		switch (operator.charAt(0)) {
			case '+':
				System.out.println("az osszeadas eredmenye");
				System.out.println(elso_operandus + " + " + masodik_operandus + " = " +
						(elso_operandus + masodik_operandus));
				break;
	
			case '-':
				System.out.println("a kivonas eredmenye");
				System.out.println(elso_operandus + " - " + masodik_operandus + " = " +
						(elso_operandus - masodik_operandus));
				break;
	
			case '*':
				System.out.println("a szorzas eredmenye");
				System.out.println(elso_operandus + " * " + masodik_operandus + " = " +
						(elso_operandus * masodik_operandus));
				break;
	
			case '/':
				
				if (masodik_operandus == 0) {
					System.out.println("0-val nem lehet osztani!");
				} else {
					System.out.println("az osztas eredmenye");
					System.out.println(elso_operandus + " / " + masodik_operandus + " = " +
							(elso_operandus / masodik_operandus));
				}				
				break;
				
			default:
				System.out.println("Nem a 4 alapmuvelet (+, -, *, /) egyiket adta meg!");
				break;
		}//switch
	}//public static void alapmuveletek

}//class
