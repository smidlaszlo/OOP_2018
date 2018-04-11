/*
A Konyv projektben készített Könyv osztály legyen
az Áru leszármazottja!
A könyv egységárát az ár/oldalszám képlettel számítsa!
 */
import java.util.*;
import java.time.LocalDate;

public class Konyv extends Aru {
	private String cim;
	private String szerzo;
	//modositas konstanssa, final modosito hozzaadasa
	private final int megjelenes_eve;
	private int oldalszam;
	//osztalyszintu adattag
	private static String kiado = "Mora Kiado";

	public Konyv(String cim, String szerzo, int ar, int oldalszam) {
		super("konyv", ar, 27);
		this.cim = cim;
		this.szerzo = szerzo;
		//this.megjelenes_eve = megjelenes_eve;
		this.megjelenes_eve = LocalDate.now().getYear();
		this.oldalszam = oldalszam;
	}	

	public Konyv(String cim, String szerzo, int oldalszam) {
		//Java 6, 7
		//this(cim, szerzo, 1900 + new Date().getYear(), 2500);
		//this(cim, szerzo, Calendar.getInstance().get(Calendar.YEAR), 2500);

		//Java 8
		//this(cim, szerzo, LocalDate.now().getYear(), 2500);
		//this(cim, szerzo, LocalDate.now().getYear(), 2500);
		this(cim, szerzo, 2500, oldalszam);
		
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
		netto_arat_novel(szazalek);
	}
	
	@Override
	public String toString() {
		return szerzo + ": " + cim 
				+ " (" 
				+ kiado 
				+ ", " 
				+ megjelenes_eve 
				+ ", " 
				+ oldalszam
				+ " old., "
				+ brutto_ar()
				+ " Ft)";
	}

	public String getCim() {
		return cim;
	}

//	public void setCim(String cim) {
//		this.cim = cim;
//	}

	public String getSzerzo() {
		return szerzo;
	}

//	public void setSzerzo(String szerzo) {
//		this.szerzo = szerzo;
//	}

	public int getMegjelenes_eve() {
		return megjelenes_eve;
	}

//	public void setMegjelenes_eve(int megjelenes_eve) {
//		this.megjelenes_eve = megjelenes_eve;
//	}

	public int getAr() {
		return brutto_ar();
	}
	
	//Írjon metódust, amely igazat ad, ha a könyv címe megegyezik
	//a paraméterként kapott könyv címével, hamisat ha nem!
	public boolean cimEgyezikE(Konyv masikKonyv) {
		return cim.equals(masikKonyv.cim);
	}
	
	//Írjon metódust, amely két paraméterként kapott könyv közül a hosszabbat adja vissza!
	public static Konyv hosszabbKonyv(Konyv egyik_konyv, Konyv masik_konyv) {
		if (egyik_konyv.oldalszam > masik_konyv.oldalszam) {
			return egyik_konyv;
		} else {
			return masik_konyv;
		}
	}
	
	//Írjon metódust, amely igazat ad vissza, ha a könyv oldalszáma páros!
	public boolean oldalszamParosE() {
		return oldalszam % 2 == 0;
	}

	@Override
	public double egysegar() {
		return (double)getAr() / oldalszam;
	}

}