/*
a) Készítsen egy futtatható osztályt a termekeim alcsomagjában!
Ebben hozzon létre egy Áru és egy Kenyér objektumot!
Írja ki az adataikat, és hasonlítsa össze az árukat!
 */
package termekeim.futo;

//import termekeim.Aru;
//import termekeim.Kenyer;
import termekeim.*;


public class Futtathato {

	public static void main(String[] args) {
		Aru aru_objektum = new Aru("aru", 20, 27);
		Kenyer kenyer_objektum = new Kenyer("kenyer", 100, 15, 0.75);
		
		System.out.println("A termekek adatai:");
		System.out.println(aru_objektum);
		System.out.println(kenyer_objektum);
		System.out.println();		
		
		//int melyik_dragabb = kenyer_objektum.dragabb_e(aru_objektum);
		int melyik_dragabb = aru_objektum.dragabb_e(kenyer_objektum);
         
		if (melyik_dragabb > 0) {
			System.out.println("aru a dragabb\n" + aru_objektum);
		}
		else if (melyik_dragabb < 0) {
			System.out.println("kenyer a dragabb\n" + kenyer_objektum);
		}
		else {
			System.out.println("egyforma a brutto aruk\n");
		}
		
		//switch (kenyer_objektum.dragabb_e(aru_objektum)) {
		switch (aru_objektum.dragabb_e(kenyer_objektum)) {		
			case 1:
				System.out.println("aru a dragabb");
				break;
	
			case -1:
				System.out.println("kenyer a dragabb");
				break;
				
			case 0:
				System.out.println("egyforma a brutto aruk");
				break;
				
			default:
				break;
		}
		
		System.out.println();
		
/*
b) Hozzon létre még egy Kenyér típusú objektumot,
de ennek a referenciáját egy Áru típusú változóban tárolja (neve: aru2)!
Próbálja ki, hogy az "aru2" referenciára meghívva
milyen eredményt ad a toString metódus!
Meg tudja-e hívni ezen a referencián keresztül
a Kenyér mennyiségét visszaadó metódust?
 */
		Aru aru2 = new Kenyer("kenyer2", 210, 15, 1);
		//Kenyer aru3 = new Aru("kenyer3", 210, 15);//error
		
		System.out.println("aru2.toString() eredmenye:");
		System.out.println(aru2);
		
		//System.out.println(aru2.getMennyiseg());//hiba
		System.out.println(((Kenyer) aru2).getMennyiseg());
		//System.out.println(((Kenyer) aru_objektum).getMennyiseg());//ClassCastException		

/*
c) Hozzon létre még egy Kenyér példányt (neve: kenyer2)
és a "aru2" referenciával hivatkozott másik Kenyérrel
összehasonlítva a nagyobb egységárút kell kiírni
(konvertálásra lesz szükség)!
 */
		Kenyer kenyer2 = new Kenyer("kenyer3", 110, 15, .5);
		
		System.out.println("\nelso_kenyer_nagyobb_egysegaru() eredmenye:");
		//System.out.println(kenyer2.elso_kenyer_nagyobb_egysegaru((Kenyer)aru2, kenyer2));
		System.out.println(Kenyer.elso_kenyer_nagyobb_egysegaru((Kenyer)aru2, kenyer2));			
		
		System.out.println("\nA nagyobb egysegaru:");
		if (Kenyer.elso_kenyer_nagyobb_egysegaru((Kenyer)aru2, kenyer2)) {
			System.out.println(aru2);
		}
		else {
			System.out.println(kenyer2);
		}
		
	}

}
