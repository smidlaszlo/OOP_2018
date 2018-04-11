package termekeim;

public class Aru {
	private String nev;
	private int netto_ar;
	private int afakulcs;
	
	public Aru(String nev, int netto_ar, int afakulcs) {
		this.nev = nev;
		this.netto_ar = netto_ar;
		this.afakulcs = afakulcs;
	}

	public int brutto_ar() {
		return (int)(netto_ar * (1 + afakulcs / 100.0));
	}

	@Override
	public String toString() {
		return "Aru [nev=" + nev + ", brutto ara=" + brutto_ar() + "]";
	}
	
	public void netto_arat_novel(int szazalek) {
		netto_ar = (int)(netto_ar * (1 + szazalek / 100.0));
	}

	public int dragabb_e(Aru masik_aru) {
		if (brutto_ar() > masik_aru.brutto_ar()) {
			return 1;
		} else if (brutto_ar() < masik_aru.brutto_ar()) {
			return -1;
		} else {
			return 0;
		}
	}
}
