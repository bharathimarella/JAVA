package practice;

/**
 * @author bharathi
 *
 */
import java.util.Scanner;

public class sum {
	/**
	 * the input integer alue is declared as static
	 */
	static long num;
	long r;
	long s = 0;

	/**
	 * creating the method add() for finding the sum
	 */
	public void add() {
		while (num > 0) {
			r = num % 10;
			s = s + r;
			num = num / 10;
		}
		System.out.println("Sum of the given input number = " + s);
	}

	public static void main(String[] args) {
		/**
		 * Scanner object is created for scanning the dynamic input at runtime
		 */
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the number = ");
		num = n.nextLong();
		/**
		 * sum object is created and calling the add() method with that object
		 */
		sum s = new sum();
		s.add();

	}
}
