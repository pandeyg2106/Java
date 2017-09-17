package interview_essentials;

public class Pattern7 {
	
/*	1 
	1 2 1 
	1 2 3 2 1 
	1 2 3 4 3 2 1 
	1 2 3 4 5 4 3 2 1 
	1 2 3 4 5 6 5 4 3 2 1 
	1 2 3 4 5 6 7 6 5 4 3 2 1 */

	public static void pattern7(int n) {

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			int temp = i;
			if (temp > 1 && temp<=7) {
				for (int k = i - 1; k > 0; k--) {
					System.out.print(k + " ");
				}
				System.out.println("");
			}
			else{
				System.out.println("");
			}

		}
	}

	public static void main(String[] args) {
		pattern7(7);
	}

}
