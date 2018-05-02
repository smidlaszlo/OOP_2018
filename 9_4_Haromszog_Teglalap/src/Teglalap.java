/*
Egy téglalapot a 2 oldalával adjon meg4

Szabályok: az oldalak pozitív egész számok
és nem egyenlõek.

A szabályok érvényesítését kivételkezeléssel oldja meg!
 */
public class Teglalap extends Sikidom {

	private double a_oldal;
	private double b_oldal;	
	
	public Teglalap(double a_oldal, double b_oldal) {
		if (a_oldal <= 0 || b_oldal <= 0 || a_oldal == b_oldal) {
			throw new IllegalArgumentException();
		}
		
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}

	@Override
	public double terulet() {
		return a_oldal * b_oldal;
	}

	@Override
	public double kerulet() {
		return 2 * (a_oldal + b_oldal);
	}

	@Override
	public String toString() {
		return "Teglalap [a_oldal=" + a_oldal + ", b_oldal=" + b_oldal + "]";
	}
	
}
