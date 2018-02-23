public class Szamok {
	public static void main(String[] args) {

		//Írja ki a számokat az értéküknek megfelelõ
		//számszor egymás után:
		//1
		//2 2
		//3 3 3
		//4 4 4 4
		//5 5 5 5 5		
		
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		//Gyakorolja a címkézett ciklusok használatát!
		for (int i = 1; i <= n; i++) {

			cimke:
				
			for (int j = 1; j <= n; j++) {
				System.out.print(i + " ");
				if (j == i) {
					break cimke;
				}
			}
			System.out.println();
		}		
	}
}
