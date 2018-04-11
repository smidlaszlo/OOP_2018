/*
Készítsen saját Szín osztály, ami ugyanazt tudja,
mint a java.awt.Color osztály, csak a toString()
metódus a színek magyar nevét írja ki!
 */
package sajat;

import java.awt.Color;

public class Szin {
	public enum Szinek {
		BLACK, BLUE, CYAN, MAGENTA,
		DARK_GRAY, GRAY, LIGHT_GRAY, GREEN,
		ORANGE, PINK, RED, WHITE, YELLOW
	}

	private int szinKod;

	public Szin(Szinek szinkod) {
		this.szinKod = szinkod.ordinal();
	}

	public Szin(Color szinkod) {
		setSzinKod(szinkod);
	}

	public void setSzinKod(Color szinkod) {
		if (szinkod.equals(Color.BLACK)) {
			this.szinKod = 0;
		} else if (szinkod.equals(Color.BLUE)) {
			this.szinKod = 1;
		} else if (szinkod.equals(Color.CYAN)) {
			this.szinKod = 2;
		} else if (szinkod.equals(Color.MAGENTA)) {
			this.szinKod = 3;
		} else if (szinkod.equals(Color.DARK_GRAY)) {
			this.szinKod = 4;
		} else if (szinkod.equals(Color.GRAY)) {
			this.szinKod = 5;
		} else if (szinkod.equals(Color.LIGHT_GRAY)) {
			this.szinKod = 6;
		} else if (szinkod.equals(Color.GREEN)) {
			this.szinKod = 7;
		} else if (szinkod.equals(Color.ORANGE)) {
			this.szinKod = 8;
		} else if (szinkod.equals(Color.PINK)) {
			this.szinKod = 9;
		} else if (szinkod.equals(Color.RED)) {
			this.szinKod = 10;
		} else if (szinkod.equals(Color.WHITE)) {
			this.szinKod = 11;
		} else if (szinkod.equals(Color.YELLOW)) {
			this.szinKod = 12;
		}
	}

	@Override
	public String toString() {
		String szin;
		
		switch (szinKod) {
			case 0:
				szin = "FEKETE";
				break;
	
			case 1:
				szin = "KEK";
				break;

			case 2:
				szin = "CIAN";
				break;

			case 3:
				szin = "MAGENTA";
				break;

			case 4:
				szin = "SOTETSZURKE";
				break;

			case 5:
				szin = "SZURKE";
				break;

			case 6:
				szin = "VILAGOSSZURKE";
				break;

			case 7:
				szin = "ZOLD";
				break;

			case 8:
				szin = "NARANCSSARGA";
				break;

			case 9:
				szin = "ROZSASZIN";
				break;

			case 10:
				szin = "PIROS";
				break;

			case 11:
				szin = "FEHER";
				break;

			case 12:
				szin = "SARGA";
				break;

			default:
				szin = "SZINTELEN";
				break;
		}
		
		return szin;
	}	
}
