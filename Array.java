
/**
 * @author bharathi
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Array {
	
	
	
	public static void main(String[] args)
	{
		/**
		 * Initializing a String array list
		 */
		ArrayList<String> a=new ArrayList<String>();
		/**
		 * Adding elemnts in to the String ArrayList
		 */
		a.add("1");
		a.add("hello");
		a.add("Array");
		a.add("2");
		a.add("3");
		System.out.println("Elements in the StringList are " +a);
		/**
		 * Trimming the size of the array list using trimToSize() method
		 */
		a.trimToSize();
		System.out.println("Size of the array after trimming "+a.size());
		/**
		 * Replacing the elements using set() method
		 */
		a.set(0, "collection");
		a.set(1, "Frames");
		a.set(2, "1");
		
		System.out.println("Elements in the array after replacement "+a);
		/**
		 * Increasing the capacity of the array
		 */
		a.ensureCapacity(15);
		a.isEmpty();
		System.out.println("Is array is Empty ?  " +a.isEmpty());
		
		/**
		 * print the elements in array using iterator& while
		 */
		
		Iterator<String>it=a.iterator();
		System.out.print("Elemnts in Array Using Iterator -----  " );
		while(it.hasNext()){
		System.out.print(it.next()+",");
		}
		/**
		 * printing elements in Array using for
		 */
		System.out.print("\nElemnts in Array Using FOR LOOP ----" );
		for(String x:a){
			System.out.print(x+",");
		}
			
			
		
		
		
		
		
	}
	

}
