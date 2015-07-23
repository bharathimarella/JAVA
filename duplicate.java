import java.util.ArrayList;
import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		/**
		 * creating an array list with N number of dynamic inputs
		 */
		ArrayList<Integer> d = new ArrayList<Integer>();
		Scanner n = new Scanner(System.in);
		System.out.println("enter the list of input numbers");
		System.out.println("enter any non integer value after end of list");
		/**
		 * taking the input values dynamically at runtime
		 */
		while (n.hasNextInt()) {
			d.add(n.nextInt());

		}
		System.out.print("The duplicate numbers are  ");
		/**
		 * comparing the every elements in list with the other elements using
		 * their index values
		 */
		for (int i = 0; i < d.size(); i++) {
			int a = d.get(i);
			for (int x = i + 1; x < d.size(); x++) {
				int b = d.get(x);
				if (a == b) {
					System.out.print(+a + ",");
				}
			}

		}

	}

}
