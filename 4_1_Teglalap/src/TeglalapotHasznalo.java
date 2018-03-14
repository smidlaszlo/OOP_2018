/*
Készítsen egy futtatható osztályt, amely a Téglalap osztályt használja!
- Hozzon létre két téglalap objektumot ("a" és "b"),
és deklaráljon egy harmadik referencia változót ("c"), amely értékül "a"-t veszi fel!
- Írja ki mindhárom referencia változó esetén a String-be összefûzött adatokat!
- Változtassa meg "a" oldalait és írja ki újra mindhárom referencia adatait!
- Változtassa meg "a" oldalait úgy, hogy az megegyezzen "b" oldalaival!
Írja ki az (a == b) és az (a == c) kifejezések értékét!
Ezután "a" és "b" összehasonlítására használja az utoljára
definiált metódust - amely igazat ad, ha a téglalap oldalai megegyeznek a paraméterként
kapott téglalap oldalaival, hamisat ha nem! 
 */
public class TeglalapotHasznalo {
	public static void main(String[] args) {
		//Teglalap egysegnyi_oldalhasszusagu_teglalapobjektum = new Teglalap();
		Teglalap a_objektum = new Teglalap(2);
		Teglalap b_objektum = new Teglalap(3, 4);
		//Teglalap c_objektum = a_objektum;
		Teglalap c_objektum;
		c_objektum = a_objektum;
		
		System.out.println("Referencia valtozok adatai:");
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
		
		a_objektum.setOldal(5);

		System.out.println("Referencia valtozok adatai: (a_obj. modositasa utan)");
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
		
		a_objektum.setOldal(3, 4);
		
		System.out.println("Referencia valtozok adatai: (a_obj. adatai megegyeznek b_obj. adataival)");
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);

		System.out.println("a_objektum == b_objektum");
		System.out.println(a_objektum == b_objektum);
		
		System.out.println("a_objektum == c_objektum");
		System.out.println(a_objektum == c_objektum);
		
		System.out.println("a_objektum.egyenloE(b_objektum)");
		System.out.println(a_objektum.egyenloE(b_objektum));
	}
}
