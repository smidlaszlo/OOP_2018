import java.util.*;

public class Futtathato {
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
		
		boolean rosszAlkalmazott;
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			
			rosszAlkalmazott = true;
			
			do {
				try {
					alkalmazottak[i] = new Alkalmazott("XY" + (i + 1),
							//18 + veletlenszam.nextInt(Alkalmazott.getNyugdijkorhatar() - 18 + 1));
							18 + veletlenszam.nextInt(Alkalmazott.getNyugdijkorhatar() - 17));
					rosszAlkalmazott = false;
				} catch (IllegalArgumentException e) {
					System.out.println(e);
				} 
			} while (rosszAlkalmazott);
			
			System.out.println(alkalmazottak[i]);
		}
		
		//alkalmazottak[0].setNyugdijkorhatar(68);
		Alkalmazott.setNyugdijkorhatar(68);
		
		System.out.println("Adatok a nyugdijkorhatar valtoztatasa utan:");

		//foreach-es szerkezet
		for (Alkalmazott alkalmazott : alkalmazottak) {
			System.out.println(alkalmazott);
		}
		

		
		beolvasas.close();
	}

}
