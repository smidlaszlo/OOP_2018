/*
Készítsen saját csomagban ISzinezheto néven interfészt!
Adattagja: alapértelmezett szín,
értéke piros (használja a java.awt.Color osztályt)!
Metódusok:
- getter metódus a szín lekérdezésére,
- setter metódus a szín megváltoztatására.
 */
package sajat;

import java.awt.Color;

public interface ISzinezheto {
	Color alapertelmezettSzin = Color.RED;
	Color getSzin();
	void setSzin(Color szin);
}
