/*
Definiáljon egy polinom.MasodfokuPolinom osztályt,
amely egy másodfokú egyváltozós polinomot reprezentál
(képlete: y = ax2 + bx + c)!
Adattagjai: a polinom együtthatói (a, b és c), valós számok
Konstruktor: három paraméterben megadott értékkel inicializálja az adattagokat.
Végezzen ellenõrzést: ha a=0, akkor elsõfokú a polinom!
Metódusai:
- Implementálja az 1. feladatban definiált IPolinom interfész metódusait!
- Definiálja felül a toString metódust, amely a polinom képletét adja vissza
egy string-ben a konkrét együtthatókkal
(Pl.: y=2x2–3x+5)!
- Kiszámítja a diszkriminánst (b2 – 4ac).
- Visszaadja a megoldás változatokat (2 komplex gyök, 1 valós gyök, 2 valós gyök).
A megoldás változatokat Enum-ban tárolja!
- Kiszámítja az egyes megoldás változatokhoz tartozó gyököket.
Alkalmazza a metódus túlterhelést!

Ahhoz, hogy két gyököt vissza tudjon adni, definiálni kell a 2 valós gyököt ill.
a 2 komplex gyököt leíró beágyazott osztályokat.
A beágyazott osztályokban definiálja felül a toString metódust,
ami a két gyököt összefûzve adja vissza!
 */
package polinom;

//import matematika.IPolinom;
//import matematika.KomplexSzam;
import matematika.*;

public class MasodfokuPolinom implements IPolinom {
	//beagyazott enum
	public enum MegoldasValtozat {
		KET_KOMPLEX_GYOK, EGY_VALOS_GYOK, KET_VALOS_GYOK
	}

	//beagyazott osztalyok
	public class KetKomplexGyok {
		private KomplexSzam x1;
		private KomplexSzam x2;
		
		public KetKomplexGyok(KomplexSzam x1, KomplexSzam x2) {
			this.x1 = x1;
			this.x2 = x2;
		}

		@Override
		public String toString() {
			return "[x1=" 
					+ x1 
					+ ", x2=" 
					+ x2
					+ "]";
		}

		public KomplexSzam getX1() {
			return x1;
		}

		public KomplexSzam getX2() {
			return x2;
		}

		public void setX1(KomplexSzam x1) {
			this.x1 = x1;
		}

		public void setX2(KomplexSzam x2) {
			this.x2 = x2;
		}		
	}

	public class KetValosGyok {
		private double x1;
		private double x2;
		
		public KetValosGyok(double x1, double x2) {
			this.x1 = x1;
			this.x2 = x2;
		}

		@Override
		public String toString() {
			return "[x1=" 
					+ String.format("%.2f", x1) 
					+ ", x2=" 
					+ String.format("%.2f", x2)
					+ "]";
		}

		public double getX1() {
			return x1;
		}

		public double getX2() {
			return x2;
		}

		public void setX1(double x1) {
			this.x1 = x1;
		}

		public void setX2(double x2) {
			this.x2 = x2;
		}		
	}
	
	//a polinom egyutthatoi
	//y = ax2 + bx + c
	private double a;
	private double b;
	private double c;

	public MasodfokuPolinom(double a, double b, double c) {
		if (a == 0) {
			throw new RuntimeException("A polinom elsofoku.");
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double szamol(double valosSzam) {
		return a * a * valosSzam + b * valosSzam + c;
	}

	@Override
	public int getPolinomFoka() {
		if (a == 0) {
			if (b == 0) {
				return 0;
			} else {
				return 1;
			}
		} else {
			return 2;
		}
	}

	@Override
	public String toString() {
		return "y =" 
				+ String.format("%5.2f", a) 
				+ "x2 "
				+ (b < 0 ? "" : "+") 
				+ String.format("%.2f", b) 
				+ "x "
				+ (c < 0 ? "" : "+") 
				+ String.format("%.2f", c);
	}

	public double diszkriminanstSzamol() {
		return b * b - 4 * a * c;
	}
	
	public MegoldasValtozat getMegoldasValtozat() {
		double diszkriminans = diszkriminanstSzamol();
		
		if (diszkriminans < 0) {
			return MegoldasValtozat.KET_KOMPLEX_GYOK;
		} else if (diszkriminans == 0) {
			return MegoldasValtozat.EGY_VALOS_GYOK;
		} else {
			return MegoldasValtozat.KET_VALOS_GYOK;
		}
	}
	
	public void gyokotSzamol(KetKomplexGyok komplexGyokok) {
		double nevezo = 2 * a;
		double kepzetes = Math.sqrt(-diszkriminanstSzamol());

		komplexGyokok.x1 = new KomplexSzam(-b / nevezo, kepzetes / nevezo);
		komplexGyokok.x2 = new KomplexSzam(-b / nevezo, -kepzetes / nevezo);
	}

	public double gyokotSzamol() {
		return -b / (2 * a);
	}

	public void gyokotSzamol(KetValosGyok valosGyokok) {
		double nevezo = 2 * a;
		double negyzetgyok = Math.sqrt(diszkriminanstSzamol());

		valosGyokok.x1 = (-b + negyzetgyok) / nevezo;
		valosGyokok.x2 = (-b - negyzetgyok) / nevezo;		
	}

}
