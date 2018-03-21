//import java.util.Random;
//import java.util.Scanner;
//ha sok osztaly van egy csomagbol, hasznalhato a *
import java.util.*;
import java.time.LocalDate;

public class Futtathato {
/*
Készítsen egy futtatható osztályt,
amely beolvas n számú alkalmazottat egy tömbbe!
- Írja ki az alkalmazottak adatait,
majd módosítsa a nyugdíjkorhatárt
és újra írja ki az alkalmazottak adatait!
- Írja ki azon alkalmazottak adatait,
akiknek 5 évnél kevesebb van még hátra nyugdíjig!
- Írja ki azoknak az alkalmazottaknak az adatait,
akiknek az átlagnál több éve van még hátra nyugdíjig!
- Rendezze az alkalmazottak tömbjét
a nyugdíjig hátralévõ évek alapján növekvõ,
majd pedig csökkentõ sorrendbe!
*/
	public static void main(String[] args) {

		//int meret = 5;
		Scanner beolvasas = new Scanner(System.in);
		
		System.out.println("Kerem adja meg az alkalmazottak szamat!");
		System.out.println("alkalmazottak szama:");
		int meret = beolvasas.nextInt();
		//int meret = Integer.parseInt(beolvasas.nextLine());
		
		Alkalmazott alkalmazottak[] = new Alkalmazott[meret];
		Random veletlenszam = new Random();

		System.out.println("Az alkalmazottak adatai:");
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			int aktualis_evszam = LocalDate.now().getYear();
			int szuletes_eve = aktualis_evszam - Alkalmazott.getNyugdijkorhatar()
							+ veletlenszam.nextInt(Alkalmazott.getNyugdijkorhatar() - 17); 
			int szuletes_honapja = veletlenszam.nextInt(12) + 1;		
			
			alkalmazottak[i] = new Alkalmazott("XY" + (i + 1),
					szuletes_eve, szuletes_honapja,
					szuletes_napja(szuletes_eve, szuletes_honapja));

			System.out.println(alkalmazottak[i].szuletesnap());
		}
		
		/*
		//alkalmazottak[0].setNyugdijkorhatar(68);
		Alkalmazott.setNyugdijkorhatar(68);
		
		System.out.println("Adatok a nyugdijkorhatar valtoztatasa utan:");

		//foreach-es szerkezet
		for (Alkalmazott alkalmazott : alkalmazottak) {
			System.out.println(alkalmazott);
		}
		
		System.out.println("Alkalmazottak, akiknek 5 evnel kevesebb eve van meg hatra a nyugdijig:");

		double atlag = 0;
		
		for (Alkalmazott alkalmazott : alkalmazottak) {
			if (alkalmazott.hanyEvVanHatraANyugdijig() < 5) {
				System.out.println(alkalmazott);
			}
			atlag += alkalmazott.hanyEvVanHatraANyugdijig();
		}

		atlag /= alkalmazottak.length;
		
		System.out.println("Alkalmazottak, akiknek az atlagnal tobb eve van meg hatra a nyugdijig:");

		for (Alkalmazott alkalmazott : alkalmazottak) {
			if (alkalmazott.hanyEvVanHatraANyugdijig() > atlag) {
				System.out.println(alkalmazott);
			}
		}

		//rendezes tobbEveVanHatraNyugdijig() metodus segitsegevel
		for (int i = 0; i < alkalmazottak.length - 1; i++) {
			int max_index = i;
			for (int j = i + 1; j < alkalmazottak.length; j++) {
				Alkalmazott max_hatralevo_ideju = Alkalmazott.tobbEveVanHatraNyugdijig(alkalmazottak[max_index], alkalmazottak[j]);
				if (max_hatralevo_ideju == alkalmazottak[j]) {
					max_index = j;
				}
			}
			
			Alkalmazott ideiglenes = alkalmazottak[max_index];
			alkalmazottak[max_index] = alkalmazottak[i];
			alkalmazottak[i] = ideiglenes;
		}

		System.out.println("Csokkeno sorrend nyugdijig hatralevo ido alapjan");
		
		for (Alkalmazott alkalmazott : alkalmazottak) {
			System.out.println(alkalmazott);
		}

		//rendezes hanyEvVanHatraANyugdijig() metodus segitsegevel
		for (int i = 0; i < alkalmazottak.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < alkalmazottak.length; j++) {
				if (alkalmazottak[j].hanyEvVanHatraANyugdijig() <
						alkalmazottak[min_index].hanyEvVanHatraANyugdijig()) {
					min_index = j;
				}
			}
			
			Alkalmazott ideiglenes = alkalmazottak[min_index];
			alkalmazottak[min_index] = alkalmazottak[i];
			alkalmazottak[i] = ideiglenes;
		}

		System.out.println("Novekvo sorrend nyugdijig hatralevo ido alapjan");
		
		for (Alkalmazott alkalmazott : alkalmazottak) {
			System.out.println(alkalmazott);
		}		
		*/
		
		beolvasas.close();
	}
	
	public static int szuletes_napja(int ev, int honap) {
		int nap;
		
		switch (honap) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				nap = 31;
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				nap = 30;
				break;

			case 2:
				if ((ev % 4 == 0 && ev % 100 != 0) || ev % 400 == 0) {
					nap = 29;
				} else {
					nap = 28;
				}				
				break;				
				
			default:
				nap = -1;
				break;
		}
		
		Random veletlenszam = new Random();		
		
		return veletlenszam.nextInt(nap) + 1;
	}

}
