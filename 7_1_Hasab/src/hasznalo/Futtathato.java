/*
Készítsen ugyanebben a csomagban futtatható osztályt,
amelyben létrehoz egy 5 elemû hasábtömb objektumot!

A tömb elemeinek adjon értéket úgy,
hogy legyen null értékû tömbelem is!
Két henger és egy téglatest adatait olvassa be!

Írja ki az összes hasáb adatát,
majd a hasábok átlagos térfogatát,
és a hengerek számát!
 */
package hasznalo;

import geometria.*;

public class Futtathato {

	public static void main(String[] args) {
		Hasabok hasabtomb = new Hasabok(5);

		Hasab henger1 = new Henger(1, 2);
		Hasab henger2 = new Henger(3, 4);
		Hasab teglatest = new Teglatest(1, 2, 3);

		//hasabtomb.setHasab(0, new Henger(1, 2));
		hasabtomb.setHasab(0, henger1);
		hasabtomb.setHasab(1, henger2);
		hasabtomb.setHasab(2, teglatest);

		System.out.println("A hasabok adatai:");
		//for (int i = 0; i < hasabtomb.nemNullHasab(); i++) {
		for (int i = 0; i < hasabtomb.meret(); i++) {	
			System.out.println(hasabtomb.getHasab(i));
		}

		System.out.printf("\nA hasabok atlagos terfogata: %.2f\n",
				hasabtomb.atlagosTerfogat());
		System.out.println("A hengerek szama: "
				+ hasabtomb.hengerekSzama());
	}

}
