/**
 * 
 * parent class is inherited
 *
 */
public class child extends base {
	public child(String n, long i, double p) {
		/**
		 * parent class constructor is invoked to child class constructor
		 */
		super(n, i, p);

	}



	public void method1() {
		System.out.println("method is from child class");
		/**
		 * parent class methods are invoked
		 */

		super.getName();
		super.getid();
		super.getpercentage();

		System.out.println("Name=" + name + " " + "Id=" + id + " " + "percentage=" + percentage);
	}

}
