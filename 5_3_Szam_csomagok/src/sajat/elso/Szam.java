/*
Készítsen egy Szám osztályt a sajat.elso nevû csomagban,
amelynek van egy osztályszintû konstans adattagja
0.001 értékkel egy tûrés tárolására!
Legyen egy másik private adattagja egy valós szám tárolására!
- Legyen konstruktora, amely a paraméterként kapott
értékekkel inicializálja az adattagot!
- Legyen egy metódusa, amely igazat ad,
ha a valós szám adattagnak a paraméterként kapott
számtól való eltérése a tûrésen belül van!
- Legyen getter, setter metódusa a valós szám adattagra!
 */
package sajat.elso;

public class Szam {

	private static final double tures = 0.001;
	private double valosSzam;
	
	public Szam(double valosSzam) {
		this.valosSzam = valosSzam;
	}

	public double getValosSzam() {
		return valosSzam;
	}

	public void setValosSzam(double valosSzam) {
		this.valosSzam = valosSzam;
	}
	
	//valojaban a metodus azt ellenorzi, hogy
	//egyezik-e a 2 szam (adott turesen belul)
	//public boolean egyezikE(double valosSzam) {
	public boolean szamTuresenBelulVanE(double valosSzam) {
		return Math.abs(this.valosSzam - valosSzam) < tures;
	}	
}
