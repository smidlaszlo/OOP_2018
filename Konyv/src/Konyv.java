import java.util.*;
import java.time.LocalDate;

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

	//Egészítse ki a Könyv osztályt 2 konstruktorral!
	//Az egyik konstruktornak a könyv minden adatát meg kell adni,
	//a másiknak csak a szerzőt és a címet,
	//az ár 2500 Ft, a megjelenés éve pedig az aktuális év. 
	public Konyv(String cim, String szerzo, int megjelenes_eve, int ar) {
		this.cim = cim;
		this.szerzo = szerzo;
		this.megjelenes_eve = megjelenes_eve;
		this.ar = ar;
	}	

	public Konyv(String cim, String szerzo) {
		//Java 6, 7
		//this(cim, szerzo, 1900 + new Date().getYear(), 2500);
		//this(cim, szerzo, Calendar.getInstance().get(Calendar.YEAR), 2500);

		//Java 8
		this(cim, szerzo, LocalDate.now().getYear(), 2500);
		
		//Date mai_nap = new Date();		
		//this.megjelenes_eve = mai_nap.getYear();
		
		//Calendar kalendarium = java.util.Calendar.getInstance();
		//kalendarium.setTime(mai_nap);
		//this.megjelenes_eve = kalendarium.get(Calendar.YEAR);
		
		//LocalDate aktualis_datum = java.time.LocalDate.now();
		//this.megjelenes_eve = aktualis_datum.getYear();
		
		//this.ar = 2500;
	}	
	
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
	
	//Írjon metódust, amely igazat ad, ha a könyv címe megegyezik
	//a paraméterként kapott könyv címével, hamisat ha nem!
	public boolean cimEgyezikE(Konyv masikKonyv) {
		return cim.equals(masikKonyv.cim);
	}
}
