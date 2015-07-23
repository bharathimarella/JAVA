
/**
 * sum of first 1000 prime numbers
 *
 */
public class sumPrime {

	public static void main(String[] args) {
		long sum = 0;
		long count = 0;
		int i = 1;
		/**
		 * adding the prime numbers until count reaches 1000
		 */
		while (count < 1000) {

			int x = 0;
			int r;
			

			for (int j = 1; j <= i; j++) {
				r = i % j;

				if (r == 0) {
					x = x + 1;
				}
			}
			if (x == 2) {
				count++;
				sum = sum + i;
			}
			i++;

		}
		System.out.println(" sum of first 1000 prime numbers is  "+sum);
	}

}
