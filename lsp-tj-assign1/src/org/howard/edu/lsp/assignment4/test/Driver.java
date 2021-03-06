package org.howard.edu.lsp.assignment4.test;

import java.util.*;

import org.howard.edu.lsp.assignment4.implemetation.IntegerSet;

public class Driver {

	
	public static void main(String[] args) throws Exception {
		
		IntegerSet intset1 = new IntegerSet();
		/**
		 * first example set that tests the add function if a
		 * number appears multiple times. 
		 */
		intset1.add(1);
		intset1.add(2);
		intset1.add(3);
		intset1.add(1);
		intset1.add(4);

	
		
		IntegerSet intset2 = new IntegerSet();
		
		
		  intset2.add(3); 
		  intset2.add(4);
		  intset2.add(5); 
		  intset2.add(6);
		  intset2.add(7);
		  
		 
		IntegerSet intset3 = new IntegerSet();
		/**
		 * third example set 
		 */
		intset3.add(1);
		intset3.add(2);
		intset3.add(3);
		intset3.add(4);
		intset3.add(5);
		
		/**
		 * Displays the set length of all sets
		 */
		System.out.println("Set 1 length: "+ intset1.length());
		System.out.println("Set 2 length: "+ intset2.length());
		System.out.println("Set 3 length: "+ intset3.length() + '\n');
		
		System.out.println("Set 1 contains the number 1: "+ intset1.contains(1));
		System.out.println("Set 2 contains the number 1: "+ intset2.contains(1));
		System.out.println("Set 3 contains the number 5: "+ intset3.contains(5)+ '\n');
		
		System.out.println("Set 1 equals Set 2: "+ intset1.equals(intset2));
		System.out.println("Set 1 equals Set 3: "+ intset1.equals(intset3));
		System.out.println("Set 2 equals Set 3: "+ intset2.equals(intset3)+ '\n');
		
		/**
		 * Remove value '5' from set 3 to then compare values of set 1 and set 3 
		 */
		
		System.out.println("Removing value from set 3...\n");
		intset3.remove(5);
		System.out.println("Set 3 length: "+ intset3.length() );
		System.out.println("Set 3 contains the number 5: "+ intset3.contains(5));
		System.out.println("Set 1 equals Set 3: "+ intset1.equals(intset3));
		
		IntegerSet intset4 = new IntegerSet();		
		/**
		 * Finding the largest value in set 2
		 * Set 4 is empty, so it should throw an exception
		 */
		System.out.println("Finding largest value in set 2...\n");
		System.out.println("The largest number in set 2: "+ intset2.largest());
		System.out.println("Finding smallest value in set 4...\n");
		//System.out.println("The smallest number in set 4:"+ intset4.smallest());

		//System.out.println("Union between Set 1 and 2: ");
		//intset1.union(intset2);


	}

}
