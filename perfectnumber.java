import java.util.Scanner;

/**
 * A perfect number is a positive integer that is equal to the sum of its proper
 * positive divisors, that is, the sum of its positive divisors excluding the
 * number itself
 *
 */
public class perfectnumber {
	public static void main(String[] args) {
		System.out.println("Enter the input number");
		/**
		 * Taking the dynamic input
		 */
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		int a = 0;
		/**
		 * dividing the given number with all the numbers starting from 1to the given input and 
		 * adding divisors whose remainders are zero
		 */
		for (int i = 1; i < num; i++) {
			int r = num % i;
			if (r == 0) {
				a = a + i;
			}

		}

		if (a == num) {
			System.out.println(num + " is a Perfect Number");
		} else {
			System.out.println(num + " is Not Perfect Number");
		}

	}

}
