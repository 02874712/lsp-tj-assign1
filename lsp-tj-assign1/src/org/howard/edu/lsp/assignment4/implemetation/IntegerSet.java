package org.howard.edu.lsp.assignment4.implemetation;

import java.util.*;




public class IntegerSet  {

	private List<Integer> set = new ArrayList<Integer>();

	/**
	 * clears set of previously defined attributes
	 */
	public void clear() {set.clear();};

	/**
	 * 
	 * @param set - arrayList of Integers
	 * @return the length of the arrayList
	 */
	public int length() {return set.size();}; // returns the length

	/*
     * Returns true if the 2 sets are equal, false otherwise;
 	 * Two sets are equal if they contain all of the same values in ANY order.
 	 */
	public boolean equals(IntegerSet b){
		
		//if the two sets are not equal in size, automatically false
		ArrayList<Integer> set1 = (ArrayList<Integer>) b.set;
		ArrayList<Integer> set2 = (ArrayList<Integer>) set;
		
		if(set1.size() != set2.size()) {
			return false;}
		
		//if all set1 in set2 and all set2 in set1; return true
		if(set1.containsAll(set2) == true && set2.containsAll(set1) == true) {
			return true;
		}
		else {return false;}
	}; 

	/**
	 * 
	 * @param value - value that is to be found
	 * @return bool - if value is found, otherwise false
	 */
public boolean contains(int value) {
	List<Integer> set1 = set;
	
	if(set1.contains(value)) {return true;}
	else {return false;}
};    

// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
public int largest() throws Exception {
	//if set size = 0, throw exception
	if(set.size() == 0) {
		throw new IntegerSetException("Largest: Empty Set!");
	}
	
	//uses a for loop to compare values to find the largest number
	int max_num = set.get(0);
	for(int i=0; i<set.size(); i++) {
		if(set.get(i)>max_num) {
			max_num = set.get(i);}
	}
	return max_num;

}; 


// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
public int smallest() throws IntegerSetException{
	//throws exception if size of set is empty
	if(set.size() == 0) {
		throw new IntegerSetException("Smallest: Empty Set!");
	}
	
	//uses a for loop to compare values to find the smaller number
	int min_num = set.get(0);
	for(int i=0; i<set.size(); i++) {
		if(set.get(i)>min_num) {
			min_num = set.get(i);}
	}
	
	return min_num;
};

	/**
	 * 	Add - takes in an item that is to be added to the list if it is
	 * not already in the set
	 * @param item - value to be added
	 */
 	public void add(int item) {
 		if(set.contains(item) == false) {
 			int size = set.size();
 			set.add(size, item);
 		}; // adds item to s or does nothing if it is in set
 	}

 	/**
 	 * Remove - takes in an item that, if found, should be removed from the list
 	 * @param item - value to be removed
 	 */
 	public void remove(int item) {
 		for(int i=0;i<set.size();i++) {
            if(set.get(i)==item) {
                set.remove(set.get(i));
            }
           
 		}
 	}; 

// Set union
/**
 * add's the elements of both sets together
 * @param intSetb 
 */
 	public List<Integer> union(IntegerSet intSetb) {
 		ArrayList<Integer> set2 = (ArrayList<Integer>) intSetb.set;
 		for(int i = 0; i < set.size(); i++) {
 			if(set.contains(set2.get(i)) == false) {
 				set.add(set2.get(i));
 				
 			}
 		}
 		System.out.println(set.size());
 		return set2;
 	};

// Set intersection
 	public List<Integer> intersect(IntegerSet intSetb) {
 		List<Integer> set2 = intSetb.set;
 		List<Integer> union_set = set;
 		int j = 0;
 		for(int i = 0; i < set.size(); i++) {
 			if (set2.contains(set.get(i)) == true){
 				union_set.add(j, set.get(i));
 			}	
 		}
 		return union_set;
 	}; 

// Set difference, i.e., s1 –s2
 	public List<Integer> diff(IntegerSet intSetb) {
 		List<Integer> set2 = intSetb.set;
 		List<Integer> diff_set = set; 
 		for(int i = 0; i < set.size(); i++) {
 			if(set2.contains(set.get(i)) == true) {
 				diff_set.remove(set.get(i));
 			}
 		}
 		return diff_set;
 	};
 	

// Returns true if the set is empty, false otherwise
 	boolean isEmpty() {
 		if(set.size() == 0) {return true;}
 		return false;
 	}; 

// Return String representation of your set
 	//public String toString() {…};	// return String representation of your set
}

