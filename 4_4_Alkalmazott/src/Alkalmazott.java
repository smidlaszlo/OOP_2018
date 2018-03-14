/*
Egészítse ki a 3_1-ben definiált Alkalmazott osztályt 2 konstruktorral!
Az egyik konstruktornak az alkalmazott nevét és fizetését kell megadni,
a másik konstruktornak az alkalmazott nevét, a fizetése 250000 Ft.
A második konstruktor használja fel az elsõt!
Módosítsa az Alkalmazottat használó osztályt ennek megfelelõen!
 */

public class Alkalmazott {
	//az adatagok felnyilvanosak
	//String nev;
	//long fizetes;//forint

	//az adatagok privatak
	private String nev;
	private long fizetes;//forint	
	
	public Alkalmazott(String nev, long fizetes) {
		this.nev = nev;
		this.fizetes = fizetes;
	}

	public Alkalmazott(String nev) {
		this(nev, 250000);
	}
	
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
