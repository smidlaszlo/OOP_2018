/*
Egy komplex szám leírásához definiálni kell
a Komplex osztályt (külön csomagban)!
*/
package matematika;

public final class KomplexSzam {
	private final double valosResz; /*valos resz*/
	private final double kepzetesResz; /*kepzetes resz*/

	public KomplexSzam(double valosResz, double kepzetesResz) {
    	this.valosResz = valosResz;
    	this.kepzetesResz = kepzetesResz;
	}

	public String toString() {
		String valosString = String.format("%.2f", valosResz);
		String kepzetesString = String.format("%.2f", kepzetesResz);

    	if (kepzetesResz == 0)
    		return valosString + "";

    	if (valosResz == 0)
    		return kepzetesString + "*i";
    	
    	if (kepzetesResz <  0)
        	return valosString + " - " + kepzetesString.substring(1) + "*i";
        
        return valosString + " + " + kepzetesString + "*i";
	}

	public double getValosResz() {
    	return valosResz;
	}

	public double getKepzetesResz() {
    	return kepzetesResz;
	}

	//abszolut ertek, vagy norma
	public double hossz() {
    	return Math.sqrt(valosResz * valosResz + kepzetesResz * kepzetesResz);
	}
}
