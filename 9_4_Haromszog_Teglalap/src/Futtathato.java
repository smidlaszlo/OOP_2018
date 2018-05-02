/*
Készítsen hozzá kipróbáló osztályt!
Deklaráljon 2 db 10 elemû síkidom tömböt!
Az egyikben háromszögeket,
a másikban téglalapokat tároljon!

Az objektumok létrehozásához használt értékeket
véletlenszerûen állítsa elõ!

Ha egy elõállított számhármas, ill. számpár nem felel meg
a szabályoknak, új értékeket állítson elõ!

Készítsen statisztikát a tömbök feltöltésérõl:
lépések száma, elõállt kivételek!
Végül irassa ki a feltöltött tömbök tartalmát!
 */

import java.util.Random;

public class Futtathato {

	public static void main(String[] args) {
		int meret = 10;
		Sikidom[] haromszogTomb = new Sikidom[meret];
		Sikidom[] teglalapTomb = new Sikidom[meret];
		
		Random veletlenObjektum = new Random();
		int haromszogLepesekSzama = 0;
		int teglalapLepesekSzama = 0;
		int haromszogEloalltKivetelekSzama = 0;
		int teglalapEloalltKivetelekSzama = 0;
		
		for (int i = 0; i < meret; i++) {
			boolean rosszAdat = true;
			
			do {
				try {
					haromszogTomb[i] = new Haromszog(veletlenObjektum.nextDouble() * 10,
							veletlenObjektum.nextDouble() * 10, veletlenObjektum.nextDouble() * 10);
					rosszAdat = false;
				} catch (IllegalArgumentException e) {
					//System.out.println("rossz szamharmas");
					haromszogEloalltKivetelekSzama++;
				}
				haromszogLepesekSzama++;
			} while (rosszAdat);

			rosszAdat = true;
			
			do {
				try {
					teglalapTomb[i] = new Teglalap(veletlenObjektum.nextDouble() * 10,
							veletlenObjektum.nextDouble() * 10);
					rosszAdat = false;
				} catch (IllegalArgumentException e) {
					//System.out.println("rossz szampar");
					teglalapEloalltKivetelekSzama++;
				}
				teglalapLepesekSzama++;
			} while (rosszAdat);
		
		}
		
		System.out.println("Haromszognel a lepesek szama:");
		System.out.println(haromszogLepesekSzama);
		System.out.println("Haromszognel az eloallt kivtelek szama:");
		System.out.println(haromszogEloalltKivetelekSzama);
		System.out.println("Teglalapnal a lepesek szama:");
		System.out.println(teglalapLepesekSzama);
		System.out.println("Teglalapnal az eloallt kivtelek szama:");
		System.out.println(teglalapEloalltKivetelekSzama);
		
		

		System.out.println("A haromszogek adatai:");
		for (Sikidom sikidom : haromszogTomb) {
			System.out.println(sikidom);
		}

		System.out.println("A teglalapok adatai:");
		for (Sikidom sikidom : teglalapTomb) {
			System.out.println(sikidom);
		}
	
	}

}
