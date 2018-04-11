/*
Alcsomagban készítsen futtatható osztályt,
amelyben létrehoz egy hengert majd kiírja az adatait
és a térfogatát!
Hozzon létre egy téglatestet,
írja ki az adatait és a térfogatát,
majd azt hogy melyik a nagyobb térfogatú!
 */
package geometria.proba;

import geometria.Henger;
import geometria.Teglatest;

public class HengerProba {

	public static void main(String[] args) {
		Henger henger = new Henger(6, 7);

		System.out.println("A henger adatai:\n" + henger);
		System.out.println("A henger terfogata:\n" + henger.terfogat());

		Teglatest teglatest = new Teglatest(2, 3, 5);

		System.out.println("A téglatest adatai:\n" + teglatest);
		System.out.println("A téglatest térfogata:\n" + teglatest.terfogat());

		System.out.println("henger.nagyobbTerfogatuMint(teglatest)");
		System.out.println(henger.nagyobbTerfogatuMint(teglatest));
		System.out.println("teglatest.nagyobbTerfogatuMint(henger)");
		System.out.println(teglatest.nagyobbTerfogatuMint(henger));

		if (henger.nagyobbTerfogatuMint(teglatest)) {
			System.out.println("A henger nagyobb terfogatu.");
		} else if (teglatest.nagyobbTerfogatuMint(henger)) {
			System.out.println("A teglatest nagyobb terfogatu");
		} else {
			System.out.println("Egyforma terfogatu a 2 test.");
		}
	}

}
