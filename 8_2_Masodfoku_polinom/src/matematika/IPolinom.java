/*
Definiáljon egy matematika.IPolinom nevû interfészt!
Metódusai:
- Egy valós számot kap és egy valós számot ad vissza.
Szerepe, egy megadott x értékre visszaadni a kiszámolt y-t.
- Paraméter nélküli és egy egészet ad vissza.
Szerepe: a polinom fokát visszaadni. 
 */
package matematika;

public interface IPolinom {
	double szamol(double valosSzam);
	int getPolinomFoka();
}
