
public class Faktorialis {

	public static void main(String[] args) {

		//Számítsa ki 1-tõl 10-ig a számok faktoriálisát!
		//A faktoriális számítást külön függvényben valósítsa meg!

		//függvény nélkül
		int n = 10;
		long faktorialis = 1;

		for (int i = 2; i <= n; i++) {
			faktorialis *= i;
		}

		System.out.println("n faktorialisa: " +
								faktorialis);

		//függvényhívással
		System.out.println("n faktorialisa: " +
								faktorialis(n));
		System.out.println("n faktorialisa: " +
								faktorialis_rekurziv(n));

	}

	//iteratív megoldással
	static private long faktorialis(int n) {
		long faktorialis = 1;

		for (int i = 2; i <= n; i++) {
			faktorialis *= i;
        }

		return faktorialis;
	}

	//rekurzív megoldással
	static private long faktorialis_rekurziv(int n) {
		if (n < 2) {
			return 1;
		} else {
			return n * faktorialis_rekurziv(n - 1);
		}	
	}
		
}
