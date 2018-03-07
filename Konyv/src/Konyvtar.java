
public class Konyvtar {
	public static void main(String[] args) {
		//hozzunk letre egy konyv objektumot
		Konyv konyv = new Konyv();
		
		//allitsuk be az adattagjait
		konyv.setSzerzo("Kiss Kalman");
		konyv.setCim("Kalman konyvei");
		konyv.setMegjelenes_eve(2018);
		konyv.setAr(2000);
		
		//irassuk ki a konyv adatait
		System.out.println("A konyv adatai");
		System.out.println(konyv);
		
		//noveljuk a kony arat 3%-kal
		konyv.arat_szazalekkal_novel(3);		
		System.out.println(konyv);		
	}
}
