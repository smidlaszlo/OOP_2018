
public class Szamharmas {
	public static void main(String[] args) {
		//1 és 100 közötti számokból képezzük
		//a Pitagoraszi számhármasokat
		//és írjuk ki táblázatos formában
		//(megoldás: 52 ilyen számhármas van)!
		//A Pitagoraszi számhármasok
		//egy derékszögû háromszög oldalainak
		//egész mérõszámai, azaz teljesül rájuk,
		//hogy a2 + b2 = c2.
		
		int also_hatar = 1, felso_hatar = 100;
		int darab = 0;
		int i, j, k;
		
		System.out.println("Szamharmasok:");
		
		for (i = also_hatar; i < felso_hatar - 1; i++) {
			
			for (j = i + 1; j < felso_hatar; j++) {
				
				for (k = j + 1; k <= felso_hatar; k++) {

					if (i * i + j * j == k * k) {
							darab++;
							System.out.println(i + ", " + j + ", " + k);													
					}										
				}								
			}
		}
		
		System.out.println(darab + " darab szamharmas van a megadott szamok kozott.");				
	}
}
