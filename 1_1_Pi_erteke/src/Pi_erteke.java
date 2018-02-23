
public class Pi_erteke {
	//Adjon közelítést Pi értékére (3,1415926535),
	//a következő sorozatok első 1000 / 10000 tagjának
	//kiszámításával!

	public static void main(String[] args) {
        //Wallis-formula
        double pi = 1;
        int darab = 10000 / 2;

        for (int i = 1; i <= darab; i++) {
        	pi *= 2.0 * i / (2 * i - 1);
        	pi *= 2.0 * i / (2 * i + 1);
        }

        System.out.println("Wallis-formula");
        System.out.println("pi/2 erteke: " + pi);
        System.out.println("pi erteke: " + pi * 2);

        //Leibniz-fele sor
        pi = 0;
        darab *= 4;
        int elojel = 1;

        for (int i = 1; i <= darab; i += 2) {
        	pi += elojel * 1.0 / i;
        	elojel *= -1;
        }

        /*
        for (int i = 0; i < darab / 2; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);     
        }
        */        
        
        System.out.println("Leibniz-fele sorfejtes");
        System.out.println("pi/4 erteke: " + pi);
        System.out.println("pi erteke: " + pi * 4);		
	}
	
	/* Pí-versek

	Ezt a kört a pível számítsad ki!
	
	Imrecze Zoltánné: Nem nehéz a matematika


	Szász Pál verse:
	Nem a régi s durva közelítés
	Mi szótól szóig így kijön
	Betűiket számlálva...
	Ludolph eredménye már,
	Ha itt végezzük húsz jegyen.
	De rendre kijő még tíz pontosan.
	Azt is bízvást ígérhetem.
	
	Vagyis: 3,141592653589793238462643383279

	Pothurszky Géza	
	Pi versek
	A pi (3,14) negyvennyolc tizedesjegyig (1 + 1)
	
	I.
	
	Itt e szám, a sorok halmazában,
	és elrejt, tudom, oly tényt,
	melyeket tudvalevő Ludolph rögzített.
	Ezt, az itt elsorolt húsz számot,
	és bizony azon túl sok tizedest,
	azt is bízvást ismerteti.
	Euler pi jelölést alkalmaz, mert
	e számsorok ezentúl a körnél gyakoriak!
	Jól használva, kerületet fog alkotni száma...
	
	II.
	
	Íme a szám, a híres, nevezetes pi,
	melyet tudom, már régen kutatnak.
	Elismerve Ludolph számsorát
	már az itt jegyzett húsz számon.
	És tudjuk, vele sok kör kerülete,
	biz` az átmérők szorzatai.
	Görög pi betűként: végtelen szám,
	a kerületek hosszát e jellel számlálod!
	Már bármilyen kerületet tud "lemérni" ezzel...
	
	Sárospatak, 2015. február 2015. március 14. a Pi (3,14) világnapjának tiszteletére.


	Szikora Ágnes verse:
	Íme a szám: a görög periféria pi betűje.
	Euler meg Viète végtelen összeggel közelít értékéhez.
	Lám, őt már Egyiptom, Kína, Európa is akarta, hogy
	„ama kör kerülete úgy ki lehetne számlálva”.
 
	angol nyelven íródott:
	See. I have a rhyme, assisting my feeble brain
	It's tasks offtimes resisting.
	
	Itt e vers, s dolga végeztére ez segíti agyam
	Aki attól gyakorta húzódozik.

	Hámori Miklós: Arányok és talányok, Typotex Kiadó, 1994.

	 */
}
