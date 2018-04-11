/*
Készítsen IElado interfészt!
Adattagjai: alapértelmezett ár, értéke 1, 
és alapértelmezett devizanem, értéke Ft.
Metódusok:
- Getter metódus az ár és a devizanem lekérdezésére.
- Setter metódus az ár és a devizanem megváltoztatására.
 */
public interface IElado {
	static int alapertelmezett_ar = 1;
	static String alapertelmezett_devizanem = "Ft";
	
	String getAr();
	void setAr(int ar, String devizanem);
}
