
public class main {
	public static void main(String[] args) {

		/**
		 * creating parameterized constructor for parent class (base) and
		 * calling parent class method
		 */
		base b = new base("ABC", 5677896, 85.0);
		b.method1();
		/**
		 * creating parameterized constructor for child class (child) and
		 * calling child class method
		 */
		b = new child("BCA", 766890643, 90.9);
		b.method1();

	}
}
