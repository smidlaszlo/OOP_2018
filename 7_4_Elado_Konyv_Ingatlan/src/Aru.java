/*
Módosítsa a 6_1-es Áru osztályt úgy,
hogy az implementálja az IElado interfészt
(legyen devizanem adattagja is)!
 */
public class Aru implements IElado{

	private String nev;
	private int netto_ar;
	private int afakulcs;
	private String devizanem;
	
	public Aru(String nev, int netto_ar, int afakulcs) {
		this.nev = nev;
		this.netto_ar = netto_ar;
		this.afakulcs = afakulcs;
		devizanem = alapertelmezett_devizanem;
	}

	public Aru(String nev, int afakulcs) {
		this.nev = nev;
		this.netto_ar = alapertelmezett_ar;
		this.afakulcs = afakulcs;
		devizanem = alapertelmezett_devizanem;
	}
	
	public int brutto_ar() {
		return (int)(netto_ar * (1 + afakulcs / 100.0));
	}

	@Override
	public String toString() {
		return "Aru [nev=" + nev
				+ ", brutto ara="
				+ getAr()
				+ "]";
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

	@Override
	public String getAr() {
		return brutto_ar() + " " + devizanem;
	}

	@Override
	public void setAr(int brutto_ar, String devizanem) {
		this.netto_ar = (int)(brutto_ar / (1 + afakulcs / 100.0));
		this.devizanem = devizanem;
	}
}
