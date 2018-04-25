package kivetelek;

@SuppressWarnings("serial")
public class NemPrimszamException extends Exception {
	//private static final long serialVersionUID = 5373777408321130608L;

	public NemPrimszamException() {
		super("A megadott szam nem primszam.");
	}
}
