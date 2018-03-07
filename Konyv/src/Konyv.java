/*
Készítsen Könyv osztályt és egy Könyv osztályt használó osztályt!
a) A Könyv osztály adattagjai: cím, szerző, megjelenés éve, ára.
Legyen egy metódusa, amely a paraméterként kapott
százalékos értékkel növeli a könyv árát!
Legyen egy metódusa, ami egy String-be összefűzi az adatokat
és ezt adja vissza!
b) Írjunk setter metódusokat az adatok beállításához,
és getter metódusokat az adatok lekérdezéséhez
(adatrejtés → ellenőrzött adathozzáférés). 
 */
public class Konyv {
	private String cim;
	private String szerzo;
	private int megjelenes_eve;
	private int ar;

	public void arat_szazalekkal_novel(int szazalek) {
		ar *= (1 + szazalek / 100.0);
	}
	
	@Override
	public String toString() {
		return szerzo + ": " + cim + " (" + megjelenes_eve + ", " + ar + " Ft)";
	}

	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public String getSzerzo() {
		return szerzo;
	}

	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}

	public int getMegjelenes_eve() {
		return megjelenes_eve;
	}

	public void setMegjelenes_eve(int megjelenes_eve) {
		this.megjelenes_eve = megjelenes_eve;
	}

	public int getAr() {
		return ar;
	}

	public void setAr(int ar) {
		this.ar = ar;
	}
}
