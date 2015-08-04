import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {
		/**
		 * Array is created
		 */
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		/**
		 * Scanner object is created for taking input values
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the search Element");
		/**
		 * taking the input values
		 */
		int b = s.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				System.out.println("Element found in " + i + "th index");
			}

		}
	}

}
