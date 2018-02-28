import java.util.Arrays;

public class Tomb_Arrays {
	public static void main(String[] args) {
/*
A java.util csomagban definiált Arrays osztály metódusaival
kényelmesen kezelhetõk a tömbök.
Például:
- tömb rendezése (nem ad vissza értéket): java.util.Arrays.sort(myArray);
- bináris keresés tömbben (a megtalált elem indexét adja vissza):
java.util.Arrays.binarySearch(myArray, searchKey);
- két tömbben az elemek azonosságának a vizsgálata (boolean-el tér vissza):
java.util.Arrays.equals(array1, array2);

Próbálja ki a metódusokat int, double és char tömbökön!
 */
		int meret = 5, maxertek = 50;
		char keresendo_elem = 'c';
		int[] egesztomb = new int[meret];
		double[] valostomb = new double[meret];
		double[] valostomb2 = new double[meret];
		char[] karaktertomb = new char[meret];
		
		for (int i = 0; i < meret; i++) {
			egesztomb[i] = (int)(Math.random() * maxertek);
			valostomb[i] = Math.random() * maxertek;
			valostomb2[i] = valostomb[i];
			karaktertomb[i] = (char)('a' + i); 
		}
		
		Arrays.sort(egesztomb);
		System.out.println("A sorbarendezett egesz tomb elemei:");
		for (int i : egesztomb) {
			System.out.println(i);
		}
		
		System.out.println("Az 1. valos tomb elemei:");
		for (double d : valostomb) {
			System.out.println(d);
		}
		
		System.out.println("A ket valos tomb megegyezik?"); 
		System.out.println(Arrays.equals(valostomb, valostomb2));
		System.out.println("A ket valos tomb ugyanoda hivatkozik?");
		System.out.println(valostomb.equals(valostomb2));
		
		System.out.println("A " + keresendo_elem + " karakter indexe a karaktertombben:");
		System.out.println(Arrays.binarySearch(karaktertomb, keresendo_elem));

	}
}
