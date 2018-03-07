/*
1. Készítsen el egy Alkalmazott osztályt
és egy Alkalmazott osztályt használó osztályt!
a) Az Alkalmazott osztályban
- van név és fizetés adattag (félnyilvánosak);
- van egy metódusa, amely egy paraméterként kapott értékkel megnöveli a fizetést;
- van egy metódusa, amely egy String-be összefûzi a nevet és a fizetést és ezt adja vissza.

b) Írjuk át az adattagokat private-ra és készítsünk setter metódusokat az adatok beállításához,
és getter metódusokat az adatok lekérdezéséhez (adatrejtés)!
Írjuk át ennek megfelelõen az Alkalmazott osztályt használó osztályt!

c) Egészítsük ki az Alkalmazott osztályt a következõ metódusokkal:
 - adjon vissza igazat, ha a fizetés a paraméterként megadott határok közé esik, és hamisat ha nem;
 - adja vissza a fizetendõ adó értéket, ha az adókulcs 16% ;
 - adjon vissza igazat, ha a fizetés nagyobb, mint egy paraméterként megadott másik alkalmazotté!
 
Egészítsük ki az Alkalmazott osztályt használó osztályt úgy,
hogy minden funkciót ki tudjunk próbálni.
 */

public class Alkalmazott {
	//az adatagok felnyilvanosak
	//String nev;
	//long fizetes;//forint

	//az adatagok privatak
	private String nev;
	private long fizetes;//forint
	
	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public long getFizetes() {
		return fizetes;
	}

	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}

	public void fizetestNovel(long novekmeny) {
		fizetes += novekmeny;
	}

	public boolean fizetesIntervallumokKozott(long alsohatar, long felsohatar) {
		return fizetes >= alsohatar && fizetes <= felsohatar;
	}
	
	public long fizetendoAdo(int adokulcs) {
		return fizetes * adokulcs / 100;
	}
		
	public long fizetendoAdo() {
		return (long)(fizetes * 0.16);
	}
	
	public boolean fizetesNagyobbMint(Alkalmazott masikAlkalmazott) {
		//return fizetes > masikAlkalmazott.fizetes;
		
		if (fizetes > masikAlkalmazott.getFizetes()) {
			return true;
		} else {
			return false;
		}		
	}
	
	@Override
	public String toString() {
		//return "Alkalmazott neve: " + nev + ", fizetese: " + fizetes + " Ft";
		return "Alkalmazott neve: " + getNev() + ", fizetese: " + getFizetes() + " Ft";
	}
}
