package practice;

import java.util.*;

public class fibanocci {

	public static void main(String[] args) {
		/** 
		 * creating an Array of size 10
		 */
		int[] a = new int[20];
		System.out.println("Fibanocci series for 10 is... ");
	
		for (int x = 0; x < a.length; x++) {
			/**
			 * if the index value is less than 2,assigning the index number as the value in to it
			 */
			if (x < 2) {
				a[x] = x;
			} else {
				/**
				 * if index number is greater than 1 then sum of the last two values 
				 * is sending  to the immediate current index
				 */
				a[x] = a[x - 2] + a[x - 1];
			}

			System.out.print(a[x] + " , ");

		}

	}

}
