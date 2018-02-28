import java.util.Random;

public class TombVeletlenszam {

	public static void main(String[] args) {
/*
Deklaráljon, majd foglaljon helyet egy 10 elemû int tömb számára!
Töltse fel 1 és 50 közötti véletlenszámokkal a tömböt!

1. Használja a java.util.Random osztályt!
Elsõ lépés egy ilyen típusú objektum létrehozása
a véletlenszám generátor inicializálásához:
java.util.Random rand = new java.util.Random();
Második lépés az osztály nextXXX metódusának hívása.
Ezek a metódusok 0 és az argumentumként megadott szám által határolt,
felülrõl nyitott intervallumból állítják elõ a megfelelõ típusú véletlenszámot.
int random = rand.nextInt(50)+1;

2. Használja a java.lang.Math osztály random() metódusát!
Ez a metódus a [0,1) felülrõl nyitott intervallumból
egy lebegõpontos véletlenszámot ad vissza.
A számtartományt a C-bõl ismert
(felsõhatár-alsóhatár+1)+alsóhatár
képlettel adhatjuk meg.
int random = (int)(Math.random() * 50) + 1;

Írja ki a tömbelemeket fordított sorrendben!
Keresse meg a tömbben a legnagyobb páros számot!
Figyelje meg mi a különbség, ha a for ciklust,
illetve ha a foreach ciklust használja! 
 */
		//int[] tomb = new int[10];
		int tomb[] = new int[10];
		Random veletlenobjektum = new Random();

		System.out.println("A tomb elemei:");
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = veletlenobjektum.nextInt(50) + 1;
			//tomb[i] = (int)(Math.random() * 50) + 1;
			System.out.println(tomb[i]);
		}
		
		System.out.println();
		System.out.println("A tomb elemei forditott sorrendben");
		
		for (int i = tomb.length - 1 ; i >= 0; i--) {
			System.out.println(tomb[i]);
		}
		
		/*
		for (int i = 0; i < tomb.length; i++) {
			System.out.println(tomb[tomb.length - 1 - i]);
		}
		*/

		//a legnagyobb szamanak megkeresese
		int legnagyobb_index = 0;
		for (int i = 1; i < tomb.length; i++) {
			if (tomb[i] > tomb[legnagyobb_index]) {
				legnagyobb_index = i;
			}			
		}
		
		System.out.println();
		System.out.println("A legnagyobb szam: " + tomb[legnagyobb_index]);
		
		//legnagyobb paros szamanak megkeresese
		int legnagyobb_paros_index = -1;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				if (legnagyobb_paros_index == -1) {
					legnagyobb_paros_index = i;
				} else {
					if (tomb[legnagyobb_paros_index] < tomb[i]) {
						legnagyobb_paros_index = i;
					}
				}
			} 			
		}//for

		int ciklusvaltozo = 0;
		legnagyobb_paros_index = -1;
		
		//foreach
		for (int i : tomb) {
			if (i % 2 == 0) {
				if (legnagyobb_paros_index == -1) {
					legnagyobb_paros_index = ciklusvaltozo;
				} else {
					if (tomb[legnagyobb_paros_index] < i) {
						legnagyobb_paros_index = ciklusvaltozo;
					}
				}
			} 			
			ciklusvaltozo++;
		}
		
		System.out.println();
		
		if (legnagyobb_paros_index != -1) {
			System.out.println("A legnagyobb paros szam: " + tomb[legnagyobb_paros_index]);
		} else {
			System.out.println("Nem volt az elemk kozott paros szam.");
		}		
	}
}
