// A Könyv osztály pedig az Áru leszármazottja.
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
		this.megjelenes_eve = LocalDate.now().getYear();
		this.oldalszam = oldalszam;
	}

	public Konyv(String cim, String szerzo, int oldalszam) {
		this(cim, szerzo, 2500, oldalszam);
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
				+ getAr()
				+ ")";
	}

	public String getCim() {
		return cim;
	}

	public String getSzerzo() {
		return szerzo;
	}

	public int getMegjelenes_eve() {
		return megjelenes_eve;
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
}