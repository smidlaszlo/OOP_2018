/*
A polinom.Teszt futtatható osztály main függvényében
hozzon létre 5 másodfokú polinomot beolvasott együtthatókkal
és tárolja egy tömbbe!
Majd írja ki az összes polinom képletét 
és számítsa ki a megoldásukat!
 */
package polinom;

import java.util.Scanner;
//import matematika.KomplexSzam;
import polinom.MasodfokuPolinom.KetKomplexGyok;
import polinom.MasodfokuPolinom.KetValosGyok;
import polinom.MasodfokuPolinom.MegoldasValtozat;

public class Teszt {

	public static final boolean 
		//MANUALIS_ADATBEVITEL = true;
		MANUALIS_ADATBEVITEL = false;

	public static void main(String[] args) {
		int tombMeret = 5;
		
		MasodfokuPolinom[] polinomok = new MasodfokuPolinom[tombMeret];

		Scanner beolvasas = new Scanner(System.in);

		for (int i = 0; i < polinomok.length; i++) {
			
			if (MANUALIS_ADATBEVITEL) {

				System.out.println("Kerem a(z) " 
						+ (i + 1) + ". polinom elso egyutthatojat!");
				System.out.print("a=");

				double a = beolvasas.nextDouble(); beolvasas.nextLine();

				System.out.println("Kerem a(z) "
						+ (i + 1) + ". polinom masodik egyutthatojat!");
				System.out.print("b=");
				
				double b = beolvasas.nextDouble(); beolvasas.nextLine();

				System.out.println("Kerem a(z) "
						+ (i + 1) + ". polinom harmadik egyutthatojat!");
				System.out.print("c=");
				
				double c = beolvasas.nextDouble(); beolvasas.nextLine();
				
				polinomok[i] = new MasodfokuPolinom(a, b, c);
				
				System.out.println();
			} else {
				polinomok[i] = new MasodfokuPolinom(
						Math.random() * 20 - 10, 
						Math.random() * 20 - 10, 
						Math.random() * 20 - 10);
			}
		}
	
		beolvasas.close();
		
		System.out.println("A polinomok:");

		for (MasodfokuPolinom masodfokuPolinom : polinomok) {
			System.out.println(masodfokuPolinom);
		}

		System.out.println();
		
		for (int i = 0; i < polinomok.length; i++) {

			System.out.println(polinomok[i]);
			System.out.println("megoldasa:");

			if (polinomok[i].getMegoldasValtozat().equals(MegoldasValtozat.EGY_VALOS_GYOK)) {
				//System.out.println(polinomok[i].getMegoldasValtozat());
				double eredmeny = polinomok[i].gyokotSzamol();
				
				System.out.println(eredmeny);				
			} else if (polinomok[i].getMegoldasValtozat().equals(MegoldasValtozat.KET_VALOS_GYOK)) {
				//System.out.println(polinomok[i].getMegoldasValtozat());
				KetValosGyok valosgyokok = polinomok[i].new KetValosGyok(0, 0);
				polinomok[i].gyokotSzamol(valosgyokok);
				
				System.out.println(valosgyokok);
			} else if (polinomok[i].getMegoldasValtozat().equals(MegoldasValtozat.KET_KOMPLEX_GYOK)) {
				//System.out.println(polinomok[i].getMegoldasValtozat());
				KetKomplexGyok eredmeny = polinomok[i].new KetKomplexGyok(null, null);
				polinomok[i].gyokotSzamol(eredmeny);
				
				System.out.println(eredmeny);				
			}
			
			System.out.println();

		}
		
/*		
		MasodfokuPolinom polinom = new MasodfokuPolinom(1, -8, 25);
		polinom = new MasodfokuPolinom(2, -6, 5);
		System.out.println(polinom);
		System.out.println(polinom.getMegoldasValtozat());
				
		KetKomplexGyok eredmeny = polinom.new KetKomplexGyok(null, null);
		polinom.gyokotSzamol(eredmeny);
		System.out.println(eredmeny);
		
		polinom = new MasodfokuPolinom(1, 2, 1);
		System.out.println(polinom);
		System.out.println(polinom.getMegoldasValtozat());
		double x = polinom.gyokotSzamol();		
		System.out.println(x);

		polinom = new MasodfokuPolinom(1, -1, -2);
		System.out.println(polinom);
		System.out.println(polinom.getMegoldasValtozat());
		KetValosGyok valosgyokok = polinom.new KetValosGyok(0, 0);
		polinom.gyokotSzamol(valosgyokok);
		System.out.println(valosgyokok);

		
		polinom = new MasodfokuPolinom(1, -6, 5);
		System.out.println(polinom);
		System.out.println(polinom.getMegoldasValtozat());
		valosgyokok = polinom.new KetValosGyok(0, 0);
		polinom.gyokotSzamol(valosgyokok);
		System.out.println(valosgyokok);
		*/
	}

}
