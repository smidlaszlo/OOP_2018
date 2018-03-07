
public class Szemely {
//Készítsen egy Személy osztályt az alábbi adatokkal:
//név, testtömeg (egész, kilogramban megadva),
//magasság (valós, méterben megadva)!
	
	private String nev;
	private int testtomeg;
	double magassag;


	// Legyen egy metódusa, amely visszaadja a testtömeg indexet!
	// (tti = tomeg / (m * m))
	public double testTomegIndex() {
		return testtomeg / (magassag * magassag);
	}

	// Legyen egy metódusa, amely visszaad egy alkatot jellemző szöveget:
	// "sovány": tti<18.5
	// "túlsúlyos": tti>25
	// "normál": egyébként
	public String alkat() {
		double testtomegindex = testTomegIndex();
		
		if (testtomegindex < 18.5)
			return "sovány";
		else if (testtomegindex > 25)
			return "túlsúlyos";
		else
			return "normál";
	}

	// Legyen egy metódusa, amely egy String-be összefűzi az adatokat
	// és visszaadja a következő alakban: név, tömeg, magasság, tti: alkat
	public String toString() {
		return nev + ", " + testtomeg + " kg, " 
				+ magassag + " m, alkat: " 
				+ alkat() + " (tti: " 
				+ String.format("%.1f", testTomegIndex()) + ")";
	}	
	
//Írjunk setter metódusokat az adatok beállításához,
//és getter metódusokat az adatok lekérdezéséhez
//(adatrejtés → ellenőrzött adathozzáférés).	
	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getTesttomeg() {
		return testtomeg;
	}

	public void setTesttomeg(int testtomeg) {
		this.testtomeg = testtomeg;
	}

	public double getMagassag() {
		return magassag;
	}

	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}	
	
	
	//Az Oxfordi Egyetem matematikusai szerint a testtömegindex
	//a magasabb embereket szisztematikusan kövérebbnek,
	//az alacsonyabbakat viszont soványabbnak mutatja.
	//Az általuk javasolt új formula így hangzik: 
	//BMI = 1,3 x testtömeg (kilogramm) / magasság (méter)^2,5

	//A BMI-képlet hiányosságaira már megalkotója,
	//Adolphe Quetelet is felhívta a figyelmet az 1840-es években.

	//A két képlet alapján kiszámolható, hogy 1,69 m az a magasság,
	//amelyiknél a két képlet azonos BMI értéket ad.
	public double modositott_testTomegIndex() {
		return 1.3 * testtomeg / Math.pow(magassag, 2.5);
	}
}
