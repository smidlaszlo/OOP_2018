import java.util.Scanner;
/*
Készítsen egy futtatható osztályt, amelyben létrehoz
és tömbben tárol beolvasott számú beolvasott adatú hanglemezt!
Írja ki a leghosszabb lemez adatait!
Írja ki egy beolvasott nevû elõadó lemezeit! 
 */
public class Hanglemezek {
	public static void main(String[] args) {
		int darabszam;
		int maximalis_hosszu_indexe = 0;

		Scanner beolvasas = new Scanner(System.in);
		System.out.println("Kerem adja meg a lemezek szamat!");
		System.out.println("darab=");
		darabszam = Integer.parseInt(beolvasas.nextLine());
		//darabszam = beolvasas.nextInt(); String ujsor = beolvasas.nextLine();

		Hanglemez[] tomb = new Hanglemez[darabszam];

		for (int i = 0; i < darabszam; i++) {
			tomb[i] = new Hanglemez("E" + (i + 1),
									"C",
									(int)(100 * Math.random()) + 1);
			System.out.println(tomb[i]);
		}

		for (int i = 1; i < darabszam; i++) {
			if (tomb[i].hosszabbMint(tomb[maximalis_hosszu_indexe]) == 1) {
				maximalis_hosszu_indexe = i;
			}
		}
		
		System.out.println("A leghosszabb lemez adatai:\n"
							+ tomb[maximalis_hosszu_indexe]);

		System.out.println("Kerem adja meg az eloado nevet!");
		System.out.println("eloado=");
		String eloado = beolvasas.nextLine();

		System.out.println(eloado + " lemezei:");
		
		for (int i = 0; i < darabszam; i++) {
			if (tomb[i].eloado(eloado)) {
				System.out.println(tomb[i]);
			}
		}
		
		beolvasas.close();
	}	
	
}
