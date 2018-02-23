public class Euler_szam {
	public static void main(String[] args) {
		
		//Adjon közelítést az Euler-féle e számra
		//(e = 2,718 281 828)
		//az alábbi sorozat elsõ 100 / 1000 tagjának kiszámításával!
        double e = 0;

        int darab = 100;

        for (int i = 0; i < darab; i++) {
                e += 1 / faktorialis(i);
        }

        System.out.println("Euler-fele szam");
        System.out.println("e: " + e);		
	}
	
    static private double faktorialis(int n) {
    	double faktorialis = 1;

    	for (int i = 2; i <= n; i++) {
                faktorialis *= i;
        }

        return faktorialis;
    }
}
